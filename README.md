# TODO:

## Phase 1
- [ ] Naive Register Allocation
- [x] Detect basic blocks
- [ ] Construct CFG
- [ ] Graph Coloring (intra block level)
- [ ] EBB construction
- [ ] Liveness analysis (Bonus)

## Phase 2
- [ ] Instruction Selection & Code Generation


## Phase 3
- [ ] Function Calls


# References:

* MIPS http://en.wikipedia.org/wiki/MIPS_architecture
* .data http://www.cs.umd.edu/class/sum2003/cmsc311/Notes/Mips/dataseg.html
* Functions calls http://people.cs.pitt.edu/~xujie/cs447/Mips/sub.html
* SPIM http://spimsimulator.sourceforge.net/ 
* http://courses.cs.washington.edu/courses/cse378/04au/sec378au04-02.pdf

# Usage

## Build

```sh
$ ./make.sh
```

## Parse, Generate AST

```sh
$ ./tiger.sh [options] <tiger source>
```

For full list of options
```sh
$ ./tiger.sh --help
```

## Clean

```sh
$ ./clean.sh
```

# Directory Structure

- xxx
