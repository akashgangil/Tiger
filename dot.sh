#!/bin/bash

if hash dot 2>/dev/null; then
    dot -Tpng "$@" -o "$@.png"

    if hash open 2>/dev/null; then
        open "$@.png"
    fi
fi
