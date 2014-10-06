#!/bin/bash

fullfile=$1
filename=$(basename "$fullfile")
extension="${filename##*.}"
filename="${filename%.*}"

echo $filename
echo $extension

javac -d ./classes/ -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:. TigerParser.java TigerLexer.java Tiger.java
java -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:./classes/ Tiger "$filename.tiger"  
dot -Tpng "$filename.dot" -o "$filename.png"
if hash open 2>/dev/null; then
    open "$filename.png"
fi
