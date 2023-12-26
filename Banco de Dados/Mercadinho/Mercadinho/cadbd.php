<?php
$server = "localhost";
$user = "root";
$pass = "";
$dbname = "mercadinho";
$nomeprod = $_POST['Produto'];
$precoprod = $_POST['Preco'];
//Conexao do php para o bd
$conexao = new mysqli($server,$user,$pass,$dbname);

//Verificando a conexao
if($conexao->connect_error){
	echo "Algo de errado nao esta certo!";
}

$insert = "INSERT INTO produtos VALUES('$nomeprod',$precoprod)";

if ($conexao->query($insert)===TRUE) {
	echo "Cadastrado com sucesso";
	echo "<!DOCTYPE html>
	<html>
	<body>
		<a href = 'cadprod.html'><input type = 'submit' value = 'Cadastra mai'></a><br>
	</body>
	</html>";
}else{
	echo "Cadastro bunro";
}
$conexao->close();
?>