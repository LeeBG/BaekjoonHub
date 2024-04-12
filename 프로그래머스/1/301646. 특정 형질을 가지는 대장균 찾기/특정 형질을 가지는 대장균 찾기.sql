SELECT COUNT(id) as COUNT
FROM ECOLI_DATA
where (GENOTYPE & 2 != 2) and (GENOTYPE & 4 = 4 or GENOTYPE & 1 = 1)

/*

4321
----
1000     & (AND 연산) 0010  0000 - x
1111     & (AND 연산) 0010  0010 - x
0001     & (AND 연산) 0001  만족 - o
1101     & (AND 연산) 0100  만족 - o

*/