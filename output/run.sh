javac -classpath .:antlr.jar:string.jar:antlr-dep.jar tigerParser.java tigerLexer.java Main.java
java -classpath antlr.jar:string.jar:antlr-dep.jar:. Main
dot -Tpng input.dot -o test.png

