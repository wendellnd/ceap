<?php
$server = "localhost";
$user = "root";
$pass = "";
$dbname = "mercadinho";

$conexao = new mysqli($server,$user,$pass,$dbname);

if($conexao->connect_error){
	echo "Algo de errado nao esta certo!";
}
$consulta = $conexao->query("SELECT * FROM produtos");
$linhas = $consulta->num_rows;
echo "<p>preco categ nome_prod cod</p>";
 for($i =0; $i<$linhas;$i++){
 	$reg = $consulta->fetch_row();
 	echo "$reg[0] $reg[1] $reg[2] $reg[3]<br>";
 	}

?>