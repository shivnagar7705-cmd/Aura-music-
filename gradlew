#!/usr/bin/env sh
set -e
GRADLE_VERSION=8.4
if [ ! -d "gradle/wrapper" ]; then mkdir -p gradle/wrapper; fi
if [ ! -f "gradle/wrapper/gradle-wrapper.jar" ]; then
  echo "Downloading gradle-wrapper.jar"
  curl -sL https://github.com/gradle/gradle/raw/master/gradle/wrapper/gradle-wrapper.jar -o gradle/wrapper/gradle-wrapper.jar || wget -q https://github.com/gradle/gradle/raw/master/gradle/wrapper/gradle-wrapper.jar -O gradle/wrapper/gradle-wrapper.jar
fi
if [ ! -f "gradle/wrapper/gradle-wrapper.properties" ]; then
  echo "distributionUrl=https\\://services.gradle.org/distributions/gradle-8.4-bin.zip" > gradle/wrapper/gradle-wrapper.properties
fi
exec java -jar gradle/wrapper/gradle-wrapper.jar "$@"
