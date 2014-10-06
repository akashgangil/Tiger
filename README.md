# Run:

- ./run.sh <tiger program file>

# TODO:

- Add checks to find syntactic errors in the program
- Do Testing and output report

output/
contains tigerLexer.java, tigerParser.java, Main.java which generates the AST which can be fed to http://graphviz-dev.appspot.com/ to generate the graph.

test_program.tiger : sample test program contributed by us

tiger.g : tiger grammar


Now the Main.java generates a dot file which can then be fed to 'dot' tool to generate the graph

sudo apt-get install dot

dot -Tpng input.dot -o test.png

