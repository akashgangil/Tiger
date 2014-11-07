#!/bin/bash

printf "Generating code ... \n"
java -classpath bin/antlrworks.jar org.antlr.Tool -fo src grammar/Tiger.g &>/dev/null || {
    printf "Code generation failed. Check antlrworks for reason.\n"
    exit 1;
}
printf "Done\n"
