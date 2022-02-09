install:
	gradlew clean install

run-dist:
	#/Users/serdi/Hexlet/java/java-project-lvl1/build/install/app/bin/app
	build\install\app\bin\app
check-updates:
	gradlew dependencyUpdates

lint:
	gradlew checkstyleMain

build:
	gradlew clean build

start:
	gradlew clean build install
	build\install\app\bin\app