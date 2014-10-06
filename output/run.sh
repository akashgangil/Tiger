#!/bin/bash

if [ "$#" -ne 1 ]; then
  echo "Usage: $0 <INPUT TIGER PROGRAM FILE>" >&2
  exit 1
fi
if ! [ -e "$1" ]; then
  echo "$1 not found" >&2
  exit 1
fi
if ! [ -f "$1" ]; then
  echo "$1 not a file" >&2
  exit 1
fi

fullfile=$1
filename=$(basename "$fullfile")
extension="${filename##*.}"
filename="${filename%.*}"

javac -d ./classes/ -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:. TigerParser.java TigerLexer.java Tiger.java
java -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:./classes/ Tiger "$filename.tiger"  
dot -Tpng "$filename.dot" -o "$filename.png"
