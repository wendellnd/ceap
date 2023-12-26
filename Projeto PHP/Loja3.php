<?php
$server = "localhost";
$user = "root";
$pass = "";
$dbname = "mercadinho";
$cod = $_POST['Excluir'];

$conexao = new mysqli($server,$user,$pass,$dbname);
$delete = "DELETE FROM produtos WHERE cod = $cod";
if ($conexao->query($delete)===TRUE){
	echo "<!DOCTYPE html>
	<html>
	<body>
	Excluido com sucesso!<a href = 'Loja1.php'><input type='submit' value='Voltar'></a>
	</body>
	</html>";
}
?>