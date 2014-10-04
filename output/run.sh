javac -classpath .:antlr.jar:string.jar:antlr-dep.jar tigerParser.java tigerLexer.java
java -classpath antlr.jar:string.jar:antlr-dep.jar:. Main
