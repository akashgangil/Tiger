#!/bin/bash

mkdir -p build

printf "Compiling ... \n"
javac -d ./build/ -classpath "lib/*:src" src/*.java -Xlint:unchecked
printf "Done\n"
