#!/bin/bash

javac -d ./classes/ -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:. TigerParser.java TigerLexer.java Tiger.java
java -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:./classes/ Tiger 
dot -Tpng ast.dot -o ast.png
if hash open 2>/dev/null; then
    open "ast.png"
fi
