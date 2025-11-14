.PHONY: all build clean runClient runServer data install

PACK_INSTANCE := quantum-skies-0.7.6
PRISMLAUNCHER_INSTANCE := PrismLauncher/instances/${PACK_INSTANCE}/minecraft/

LINUX_INSTALL := ${HOME}/.local/share/${PRISMLAUNCHER_INSTANCE}
MAC_INSTALL := ${HOME}/Library/Application Support/${PRISMLAUNCHER_INSTANCE}
WIN_INSTALL := $(shell ls -1d /mnt/c/Users/*/AppData/Roaming/${PRISMLAUNCHER_INSTANCE} 2>/dev/null | head -n 1)

# INSTALLPATH resolves to the first detected PrismLauncher instance location across Linux, macOS, and WSL.
INSTALLPATH ?=
ifeq ($(strip $(INSTALLPATH)),)
ifneq ($(shell test -d "$(LINUX_INSTALL)" && printf 'y'),)
INSTALLPATH := ${LINUX_INSTALL}
else ifneq ($(shell test -d "$(MAC_INSTALL)" && printf 'y'),)
INSTALLPATH := ${MAC_INSTALL}
else ifneq ($(strip $(WIN_INSTALL)),)
INSTALLPATH := ${WIN_INSTALL}
else
INSTALLPATH := ${LINUX_INSTALL}
$(warning INSTALLPATH not detected; defaulting to ${INSTALLPATH})
endif
endif


GRADLEW ?= ./gradlew
MODS_DIR ?= ${INSTALLPATH}/mods

# Default target runs the Gradle build
all: build

build:
	$(GRADLEW) build

clean:
	$(GRADLEW) clean

runClient:
	$(GRADLEW) runClient

runServer:
	$(GRADLEW) runServer

data:
	$(GRADLEW) runData

install: build
	mkdir -p "$(MODS_DIR)"
	cp -v build/libs/*.jar "$(MODS_DIR)/"
