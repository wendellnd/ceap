pagar = float(input("Quanto você tem que pagar? "))
dinheiro = float(input("Com quanto você pagou? "))
troco = dinheiro-pagar
print("Seu troco é de:",troco)
nota =[100,50,20,10,5,2,1,0.5,0.25,0.1,0.05]
for x in range(11):
    contador = int(0)
    while troco >= nota[x]:
        troco = troco-nota[x]
        contador +=1
    print(str(nota[x])+":"+str(contador))
