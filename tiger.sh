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

input=$1
filename=$(basename ${input%.*})
dotfile=filename.dot
pngfile=filename.png

java -classpath "lib/*:build" Tiger "$input" "$dotfile"

if hash dot 2>/dev/null; then
    dot -Tpng "$dotfile" -o "$pngfile"
	
	if hash open 2>/dev/null; then
		open "$pngfile"
	fi
fi
