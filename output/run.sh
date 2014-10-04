#!/bin/bash

javac -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:. tigerParser.java tigerLexer.java Tiger.java
java -classpath antlr-runtime.jar:antlr-stringtemplate.jar:antlr.jar:. Tiger 
dot -Tpng ast.dot -o ast.png
if hash open 2>/dev/null; then
    open "ast.png"
fi
