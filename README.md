# TODO:

## Symbol Table

- [x] Scopes
- [x] output function parameter types on print

## Semantic Checks

- [x] Undefined type
- [x] Undefined variable
- [x] Undefined function
- [ ] Bounds check on array when possible
- [ ] Assignment lhs.type = rhs.type
- [ ] Binary operator types match
- [ ] Function parameter types match
- [ ] Return type matches function type
- [ ] Control conditions are boolean

## IR Gen

- ???

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
