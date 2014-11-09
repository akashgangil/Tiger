# TODO:

## Known Bugs

- [ ] Null Pointer exception if two functions have same name. To reproduce, in testcase02.tig change the function name "add" to "cakes".


  ```
  [09:08 gangil@gangil:~/dev/Tiger]./tiger.sh --symbol-table test/testcase02.tig 
        java.lang.NullPointerException
        java.lang.NullPointerException
        at TigerFor.fromAstNode(TigerFor.java:27)
        at TigerStatement.fromAstNode(TigerStatement.java:13)
        at TigerBlock.fromAstNode(TigerBlock.java:40)
        at TigerUserFunction.setDefinition(TigerUserFunction.java:71)
        at TigerProgram.<init>(TigerProgram.java:34)
        at Tiger.main(Tiger.java:104)
   ```
- [ ] Type promotion. We only allow type promotion from fixedpt to int and not vice versa. So we should flag an error.
      To reproduce, in testcase02.tig, change the arugment of function add to fixedpt and pass a int. It succeeds right now.

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
