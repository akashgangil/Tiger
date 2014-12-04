.data
main_s:	.word	100
main_a:	.word	5
main_sum:	.word	0
itemp:  .word  1000
.text
.globl main
main:
sw $ra, -4($sp)
addi $sp, $sp, -4
la  $t5,  main_s
lw  $t4,  0($t5)
move $a0, $t4
la  $t5,  main_a
lw  $t4,  0($t5)
move $a1, $t4
addi $sp, $sp, -0
sw $t0, -4($sp)
sw $t1, -8($sp)
sw $t2, -12($sp)
sw $t3, -16($sp)
sw $t4, -20($sp)
sw $t5, -24($sp)
sw $t6, -28($sp)
sw $t7, -32($sp)
sw $t8, -36($sp)
sw $t9, -40($sp)
addi $sp, $sp, -40
jal addNums
addi $sp, $sp, 40
lw $t0, -4($sp)
lw $t1, -8($sp)
lw $t2, -12($sp)
lw $t3, -16($sp)
lw $t4, -20($sp)
lw $t5, -24($sp)
lw $t6, -28($sp)
lw $t7, -32($sp)
lw $t8, -36($sp)
lw $t9, -40($sp)
addi $sp, $sp, 0
la  $t5,  main_sum
lw  $t4,  0($t5)
move $t4, $v0
sw $t4,  0($t5)
li $v0 1
la  $t5,  main_sum
lw  $t4,  0($t5)
move $a0, $t4
syscall
li $v0 11
li $a0 0xA
syscall
lw $ra, 0($sp)
addi $sp, $sp, 4
jr $ra
addNums:
sw $ra, -4($sp)
addi $sp, $sp, -4
move $t7, $a0
move $t6, $a1
la  $t1, itemp
lw  $t0,  0($t1)
add $t0, $t7, $t6
sw $t0,  0($t1)
la  $t7, itemp
lw  $t6,  0($t7)
move $v0, $t6
lw $ra, 0($sp)
addi $sp, $sp, 4
jr $ra
