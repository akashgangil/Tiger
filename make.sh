#!/bin/bash

printf "Generating code ... "
java -classpath bin/antlrworks.jar org.antlr.Tool -fo src grammar/Tiger.g &>/dev/null
printf "Done\n"

mkdir -p build

printf "Compiling ... "
javac -d ./build/ -classpath "lib/*:src" src/TigerParser.java src/TigerLexer.java src/Tiger.java
printf "Done\n"