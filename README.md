# TODO:

- [x] Array load for 2-D arrays
- [ ] Short Circuting

## Known Bugs
 
- [ ] OR opcode in testcase10? function concat

## ~~Symbol Table~~
## ~~Semantic Checks~~

## IR Gen

- [x] Functions (call, callr)
- [x] Variable assignment (assign)
- [x] Binary operation (op)
- [x] Goto operation (goto) 
- [x] Branch (breq, brneq etc.)
- [x] Return statements (return)
- [x] Store into array (array_store)
- [x] Load into array (array_load)
- [x] Array Assignment (assign)

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
