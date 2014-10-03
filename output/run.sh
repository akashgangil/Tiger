javac -classpath ".:antlr.jar" tigerParser.java
javac -classpath ".:antlr.jar" tigerLexer.java
javac -classpath antlr.jar:string.jar:. Main.java
java -classpath antlr.jar:string.jar:. Main
