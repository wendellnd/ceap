print("Média geral\n ")
alunos_q = float(input("Quantos alunos tem sua sala? "))
nota = float(0)
quan = int(0)
geral = float(0)
soma = float(0)
while alunos_q > quan:
    nota = float(input("Digite a nota do aluno: "))
    quan +=1
    soma = soma+nota
geral = soma/alunos_q
print("Nota geral da sala:",geral)
