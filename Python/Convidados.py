print("Lista de convidados\n ")
quantidade = int(input("Quantos convidados? "))
nome = []
contador = int(0)
while quantidade > contador:
    nome.append(input("Digite o nome do convidado:"))
    contador = contador+1
for x in nome:
    print(x)
