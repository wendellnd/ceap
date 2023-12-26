<?php
$server = "localhost";
$user = "root";
$pass = "";
$dbname = "mercadinho";

$campo = $_POST['Campo'];
$cod = $_POST['Cod'];
$value = $_POST['Value'];

$conexao = new mysqli($server,$user,$pass,$dbname);

if($conexao->connect_error){
	echo "Algo de errado nao esta certo!";
}
if($campo === "preco"){
	$set = "UPDATE produtos SET $campo = $value WHERE cod = $cod";
}else{
	$set = "UPDATE produtos SET $campo = '$value' WHERE cod = $cod";
}

if($conexao->query($set)===TRUE){
	echo "deu certo";
}else{
	echo "deu rrado";
}

?>