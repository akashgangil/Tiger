# TODO:

## Known Bugs

## Symbol Table

- [x] Scopes
- [x] output function parameter types on print

## Semantic Checks

- [x] Undefined type
- [x] Undefined variable
- [x] Undefined function
- [x] Assignment lhs.type = rhs.type
- [x] Binary operator types match
- [x] Function parameter types match
- [ ] Return type matches function type
- [x] Control conditions are boolean

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
- [ ] callr IR
- [ ] User defined types IR


## Other

- [x] Do multiple semantic passes. Global functions and types should be accessible from anywhere
- [x] Better error reporting

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
