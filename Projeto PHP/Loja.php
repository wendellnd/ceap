<?php
$server = "localhost";
$user = "root";
$pass = "";
$dbname = "mercadinho";
$nomeprod = $_POST['Produto'];
$precoprod = $_POST['Preco'];
$categprod = $_POST['Categoria'];

$conexao = new mysqli($server,$user,$pass,$dbname);

if($conexao->connect_error){
	echo "Algo de errado nao esta certo!";
}

$insert = "INSERT INTO produtos(nome_prod,preco,categ) VALUES('$nomeprod',$precoprod,'$categprod')";
if($conexao->query($insert)===TRUE) {
	echo "Cadastrado com sucesso";
	echo "<!DOCTYPE html>
	<html>
	<body>
		<a href = 'Loja1.php'><input type = 'submit' value = 'Cadastra mai'></a><br>
	</body>
	</html>";
}else{
	echo "Cadastro bunro";
}
$conexao->close();
