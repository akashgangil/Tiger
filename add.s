.data
main_s:	.word	100
main_a:	.word	1
main_product:	.word	0
multNums_total:	.word	0
multNums_i:	.word	0
itemp:  .word  1000
.text
.globl main
main:
sw $ra, -4($sp)
addi $sp, $sp, -4
sw $a0, -4($sp)
sw $a1, -8($sp)
sw $a2, -12($sp)
sw $a3, -16($sp)
addi $sp, $sp, -16
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
la  $t5,  main_s
lw  $t4,  0($t5)
la  $t7,  main_a
lw  $t6,  0($t7)
move $a0, $t4
move $a1, $t6
addi $sp, $sp, -0
jal multNums
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
la  $t5,  main_product
lw  $t4,  0($t5)
move $t4, $v0
sw $t4,  0($t5)
addi $sp, $sp, 16
lw $a0, -4($sp)
lw $a1, -8($sp)
lw $a2, -12($sp)
lw $a3, -16($sp)
li $v0 1
la  $t5,  main_product
lw  $t4,  0($t5)
move $a0, $t4
syscall
li $v0 11
li $a0 0xA
syscall
lw $ra, 0($sp)
addi $sp, $sp, 4
jr $ra
addNums2:
sw $ra, -4($sp)
addi $sp, $sp, -4
la $t6, itemp
lw $t7, 0($t6)
move $t7, $a0
la $t0, itemp
lw $t1, 0($t0)
move $t1, $a1
la  $t3, itemp
lw  $t2,  0($t3)
add $t2, $t7, $t1
sw $t2,  0($t3)
la  $t7, itemp
lw  $t6,  0($t7)
move $v0, $t6
lw $ra, 0($sp)
addi $sp, $sp, 4
jr $ra
addNums:
sw $ra, -4($sp)
addi $sp, $sp, -4
sw $a0, -4($sp)
sw $a1, -8($sp)
sw $a2, -12($sp)
sw $a3, -16($sp)
addi $sp, $sp, -16
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
la $t6, itemp
lw $t7, 0($t6)
move $t7, $a0
la $t0, itemp
lw $t1, 0($t0)
move $t1, $a1
move $a0, $t7
move $a1, $t1
addi $sp, $sp, -0
jal addNums2
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
la  $t7, itemp
lw  $t6,  4($t7)
move $t6, $v0
sw $t6,  4($t7)
addi $sp, $sp, 16
lw $a0, -4($sp)
lw $a1, -8($sp)
lw $a2, -12($sp)
lw $a3, -16($sp)
la  $t7, itemp
lw  $t6,  4($t7)
move $v0, $t6
lw $ra, 0($sp)
addi $sp, $sp, 4
jr $ra
multNums:
sw $ra, -4($sp)
addi $sp, $sp, -4
L1:
la $t6, itemp
lw $t7, 0($t6)
move $t7, $a1
la  $t1,  multNums_i
lw  $t0,  0($t1)
la  $t3, itemp
lw  $t2,  8($t3)
sub $t2, $t7, $t0
sw $t2,  8($t3)
li  $t7, 0
la  $t6, itemp
lw  $t1,  8($t6)
bge  $t7,  $t1,  L3
L2:
la  $t7, itemp
lw  $t6,  8($t7)
addi $t6, $zero , 1
sw $t6,  8($t7)
j L4
L3:
la  $t7, itemp
lw  $t6,  8($t7)
addi $t6, $zero , 0
sw $t6,  8($t7)
L4:
la  $t7, itemp
lw  $t6,  8($t7)
li  $t1, 0
beq  $t6,  $t1,  L0
la  $t7,  multNums_total
lw  $t6,  0($t7)
la $t0, itemp
lw $t1, 0($t0)
move $t1, $a0
la  $t3, itemp
lw  $t2,  12($t3)
add $t2, $t6, $t1
sw $t2,  12($t3)
la  $t7,  multNums_total
lw  $t6,  0($t7)
la  $t1, itemp
lw  $t0,  12($t1)
addi $t6, $t0, 0
sw $t6,  0($t7)
la  $t7,  multNums_i
lw  $t6,  0($t7)
li  $t1, 1
la  $t0, itemp
lw  $t3,  16($t0)
add $t3, $t6, $t1
sw $t3,  16($t0)
la  $t7,  multNums_i
lw  $t6,  0($t7)
la  $t1, itemp
lw  $t0,  16($t1)
addi $t6, $t0, 0
sw $t6,  0($t7)
j L1
L0:
la  $t7,  multNums_total
lw  $t6,  0($t7)
move $v0, $t6
lw $ra, 0($sp)
addi $sp, $sp, 4
jr $ra
