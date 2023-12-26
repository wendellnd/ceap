class Carro():
    def __init__(self,consumo,tanque = 0):
        self.consumo = consumo
        self.tanque = tanque
    def andar(self,distancia):
        gasto = distancia/self.consumo
        self.tanque = self.tanque - gasto
    def obterGasolina(self):
        print("Seu gaiz: ",self.tanque)
    def adicionarGasolina(self,addgas):
        self.tanque = self.tanque+addgas
meuFusca = Carro(15)
meuFusca.adicionarGasolina(20)
meuFusca.andar(100)
meuFusca.obterGasolina()
