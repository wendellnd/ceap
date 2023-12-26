print("Iniciais\n ")
nome = input("Digite seu nome e sobrenome: ")
nome_1 = nome.split(" ")
nome_s1 = nome_1[0]
nome_s2 = nome_1[1]
contador = nome.count(" ")
if contador < 2:
    print("Suas iniciais são: "+nome_s1[0]+nome_s2[0])
if contador == 2:
    nome_s3 = nome_1[2]
    print("Suas iniciais são: "+nome_s1[0]+nome_s2[0]+nome_s3[0])
