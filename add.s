.data
s:	.word	4
a:	.word	5
itemp:  .word  1000
newline:  .asciiz "\n"
.text
.globl main
main:
la  $t0,  s
lw  $t1,  0($t0)
addi $t1, $zero , 1
sw $t1,  0($t0)
li $v0 1
lw $a0 s
syscall
li $v0 4
la $a0 newline
syscall
li $v0 1
lw $a0 a
syscall
li $v0 4
la $a0 newline
syscall
li $v0, 10
syscall
