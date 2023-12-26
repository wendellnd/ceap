from random import shuffle
print("Senha da Conta \n ")
#senha HU PA SA CO
#Variaveis da Senha
senha_1 = "CE"
senha_2 = "PO"
senha_3 = "SA"
senha_4 = "FI"
soma = int(0)
primeiro = int(0)
segundo = int(0)
terceiro = int(0)
quarto = int(0)
#HU
while primeiro <= 0:
    var = ["KA","HU","NE","PO","RI","CE","MA","FI","SA","TI","ZA","JU","QA","HI","BO","PA","KE","ZU","CO","PI","VE"]
    shuffle(var)
    um = var[0]+" "+var[1]+" "+var[2]
    dois = var[3]+" "+var[4]+" "+var[5]
    tres = var[6]+" "+var[7]+" "+var[8]
    quatro = var[9]+" "+var[10]+" "+var[11]
    cinco = var[12]+" "+var[13]+" "+var[14]
    seis = var[15]+" "+var[16]+" "+var[17]
    sete = var[18]+" "+var[19]+" "+var[20]
    print("================================================================================")
    print(" 1° passo:\n 1-"+um+"     5-"+cinco+"\n 2-"+dois+"     6-"+seis+"\n 3-"+tres+"     7-"+sete+"\n 4-"+quatro+"     8-Cancelar")
    escolha = input("Número: ")
    print("================================================================================")
    if escolha == "1":
        if var[0] == senha_1 or var[1] == senha_1 or var[2] == senha_1:
            soma+=1
            primeiro+=1
        else:
            soma+=2
            primeiro+=1
    elif escolha == "2":
        if var[3] == senha_1 or var[4] == senha_1 or var[5] == senha_1:
            soma+=1
            primeiro+=1
        else:
            soma+=2
            primeiro+=1
    elif escolha == "3":
        if var[6] == senha_1 or var[7] == senha_1 or var[8] == senha_1:
            soma+=1
            primeiro+=1
        else:
            soma+=2
            primeiro+=1
    elif escolha == "4":
        if var[9] == senha_1 or var[10] == senha_1 or var[11] == senha_1:
            soma+=1
            primeiro+=1
        else:
            soma+=2
            primeiro+=1
    elif escolha == "5":
        if var[12] == senha_1 or var[13] == senha_1 or var[14] == senha_1:
            soma+=1
            primeiro+=1
        else:
            soma+=2
            primeiro+=1
    elif escolha == "6":
        if var[15] == senha_1 or var[16] == senha_1 or var[17] == senha_1:
            soma+=1
            primeiro+=1
        else:
            soma+=2
            primeiro+=1
    elif escolha == "7":
        if var[18] == senha_1 or var[19] == senha_1 or var[20] == senha_1:
            soma+=1
            primeiro+=1
        else:
            soma+=2
            primeiro+=1
    elif escolha == "8":
        primeiro+=1
        segundo+=1
        terceiro+=1
        quarto+=1
    else:
        print("Digite um número de 1 à 7 para selecionar uma opção ou 8 para cancelar a operação")
#PA
while segundo <= 0:
    var = ["KA","HU","NE","PO","RI","CE","MA","FI","SA","TI","ZA","JU","QA","HI","BO","PA","KE","ZU","CO","PI","VE"]
    shuffle(var)
    um = var[0]+" "+var[1]+" "+var[2]
    dois = var[3]+" "+var[4]+" "+var[5]
    tres = var[6]+" "+var[7]+" "+var[8]
    quatro = var[9]+" "+var[10]+" "+var[11]
    cinco = var[12]+" "+var[13]+" "+var[14]
    seis = var[15]+" "+var[16]+" "+var[17]
    sete = var[18]+" "+var[19]+" "+var[20]
    print(" 2° passo:\n 1-"+um+"     5-"+cinco+"\n 2-"+dois+"     6-"+seis+"\n 3-"+tres+"     7-"+sete+"\n 4-"+quatro+"     8-Cancelar")
    escolha = input("Número: ")
    print("================================================================================")
    if escolha == "1":
        if var[0] == senha_2 or var[1] == senha_2 or var[2] == senha_2:
            soma+=1
            segundo+=1
        else:
            soma+=2
            segundo+=1
    elif escolha == "2":
        if var[3] == senha_2 or var[4] == senha_2 or var[5] == senha_2:
            soma+=1
            segundo+=1
        else:
            soma+=2
            segundo+=1
    elif escolha == "3":
        if var[6] == senha_2 or var[7] == senha_2 or var[8] == senha_2:
            soma+=1
            segundo+=1
        else:
            soma+=2
            segundo+=1
    elif escolha == "4":
        if var[9] == senha_2 or var[10] == senha_2 or var[11] == senha_2:
            soma+=1
            segundo+=1
        else:
            soma+=2
            segundo+=1
    elif escolha == "5":
        if var[12] == senha_2 or var[13] == senha_2 or var[14] == senha_2:
            soma+=1
            segundo+=1
        else:
            soma+=2
            segundo+=1
    elif escolha == "6":
        if var[15] == senha_2 or var[16] == senha_2 or var[17] == senha_2:
            soma+=1
            segundo+=1
        else:
            soma+=2
            segundo+=1
    elif escolha == "7":
        if var[18] == senha_2 or var[19] == senha_2 or var[20] == senha_2:
            soma+=1
            segundo+=1
        else:
            soma+=2
            segundo+=1
    elif escolha == "8":
        segundo+=1
        terceiro+=1
        quarto+=1
    else:
        print("Digite um número de 1 à 7 para selecionar uma opção ou 8 para cancelar a operação")
        print("================================================================================")
#SA
while terceiro <= 0:
    var = ["KA","HU","NE","PO","RI","CE","MA","FI","SA","TI","ZA","JU","QA","HI","BO","PA","KE","ZU","CO","PI","VE"]
    shuffle(var)
    um = var[0]+" "+var[1]+" "+var[2]
    dois = var[3]+" "+var[4]+" "+var[5]
    tres = var[6]+" "+var[7]+" "+var[8]
    quatro = var[9]+" "+var[10]+" "+var[11]
    cinco = var[12]+" "+var[13]+" "+var[14]
    seis = var[15]+" "+var[16]+" "+var[17]
    sete = var[18]+" "+var[19]+" "+var[20]
    print(" 3° passo:\n 1-"+um+"     5-"+cinco+"\n 2-"+dois+"     6-"+seis+"\n 3-"+tres+"     7-"+sete+"\n 4-"+quatro+"     8-Cancelar")
    escolha = input("Número: ")
    print("================================================================================")
    if escolha == "1":
        if var[0] == senha_3 or var[1] == senha_3 or var[2] == senha_3:
            soma+=1
            terceiro+=1
        else:
            soma+=2
            terceiro+=1
    elif escolha == "2":
        if var[3] == senha_3 or var[4] == senha_3 or var[5] == senha_3:
            soma+=1
            terceiro+=1
        else:
            soma+=2
            terceiro+=1
    elif escolha == "3":
        if var[6] == senha_3 or var[7] == senha_3 or var[8] == senha_3:
            soma+=1
            terceiro+=1
        else:
            soma+=2
            terceiro+=1
    elif escolha == "4":
        if var[9] == senha_3 or var[10] == senha_3 or var[11] == senha_3:
            soma+=1
            terceiro+=1
        else:
            soma+=2
            terceiro+=1
    elif escolha == "5":
        if var[12] == senha_3 or var[13] == senha_3 or var[14] == senha_3:
            soma+=1
            terceiro+=1
        else:
            soma+=2
            terceiro+=1
    elif escolha == "6":
        if var[15] == senha_3 or var[16] == senha_3 or var[17] == senha_3:
            soma+=1
            terceiro+=1
        else:
            soma+=2
            terceiro+=1
    elif escolha == "7":
        if var[18] == senha_3 or var[19] == senha_3 or var[20] == senha_3:
            soma+=1
            terceiro+=1
        else:
            soma+=2
            terceiro+=1
    elif escolha == "8":
        terceiro+=1
        quarto+=1
    else:
        print("Digite um número de 1 à 7 para selecionar uma opção ou 8 para cancelar a operação")
        print("================================================================================")
#CO
while quarto <= 0:
    var = ["KA","HU","NE","PO","RI","CE","MA","FI","SA","TI","ZA","JU","QA","HI","BO","PA","KE","ZU","CO","PI","VE"]
    shuffle(var)
    um = var[0]+" "+var[1]+" "+var[2]
    dois = var[3]+" "+var[4]+" "+var[5]
    tres = var[6]+" "+var[7]+" "+var[8]
    quatro = var[9]+" "+var[10]+" "+var[11]
    cinco = var[12]+" "+var[13]+" "+var[14]
    seis = var[15]+" "+var[16]+" "+var[17]
    sete = var[18]+" "+var[19]+" "+var[20]
    print(" 4° passo:\n 1-"+um+"     5-"+cinco+"\n 2-"+dois+"     6-"+seis+"\n 3-"+tres+"     7-"+sete+"\n 4-"+quatro+"     8-Cancelar")
    escolha = input("Número: ")
    print("================================================================================")
    if escolha == "1":
        if var[0] == senha_4 or var[1] == senha_4 or var[2] == senha_4:
            soma+=1
            quarto+=1
        else:
            soma+=2
            quarto+=1
    elif escolha == "2":
        if var[3] == senha_4 or var[4] == senha_4 or var[5] == senha_4:
            soma+=1
            quarto+=1
        else:
            soma+=2
            quarto+=1
    elif escolha == "3":
        if var[6] == senha_4 or var[7] == senha_4 or var[8] == senha_4:
            soma+=1
            quarto+=1
        else:
            soma+=2
            quarto+=1
    elif escolha == "4":
        if var[9] == senha_4 or var[10] == senha_4 or var[11] == senha_4:
            soma+=1
            quarto+=1
        else:
            soma+=2
            quarto+=1
    elif escolha == "5":
        if var[12] == senha_4 or var[13] == senha_4 or var[14] == senha_4:
            soma+=1
            quarto+=1
        else:
            soma+=2
            quarto+=1
    elif escolha == "6":
        if var[15] == senha_4 or var[16] == senha_4 or var[17] == senha_4:
            soma+=1
            quarto+=1
        else:
            soma+=2
            quarto+=1
    elif escolha == "7":
        if var[18] == senha_4 or var[19] == senha_4 or var[20] == senha_4:
            soma+=1
            quarto+=1
        else:
            soma+=2
            quarto+=1
    elif escolha == "8":
        quarto+=1
    else:
        print("Digite um número de 1 à 7 para selecionar uma opção ou 8 para cancelar a operação")
        print("================================================================================")
#Acesso
if escolha != "8":
    if soma == 4:
        print("Acesso liberado")
    else:
        print("Acesso negado")
else:
    print("Operação cancelada")
