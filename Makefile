.PHONY: all build clean runClient runServer runData install

GRADLEW ?= ./gradlew
MODS_DIR ?= /mnt/c/Users/jlmoi/AppData/Roaming/PrismLauncher/instances/quantum-skies-0.7.6/minecraft/mods

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

runData:
	$(GRADLEW) runData

install: build
	mkdir -p "$(MODS_DIR)"
	cp -v build/libs/*.jar "$(MODS_DIR)/"
