# TODO:

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
- [ ] Variable assignment (assign)
- [ ] Binary operation (op)
- [ ] Goto operation (goto) 
- [ ] Branch (breq, brneq etc.)
- [ ] Return statements (return)
- [ ] Store into array (array_store)
- [ ] Load into array (array_load)
- [ ] Array Assignment (assign)


## Other

- [x] Do multiple semantic passes. Global functions and types should be accessible from anywhere
- [ ] Better error reporting

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
