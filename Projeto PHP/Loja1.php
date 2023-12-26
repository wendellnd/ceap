<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="CSS/estil.css">
	<title></title>
	<script type="text/javascript">
		function Corrigir(){
			<?php
				$server = "localhost";
				$user = "root";
				$pass = "";
				$dbname = "mercadinho";
				$conexao = new mysqli($server,$user,$pass,$dbname);

				$cont = "SELECT COUNT(cod) FROM produtos;";
				$mai = "SELECT MAX(cod) FROM produtos";
				while ($cont > 1 && $cont > $mai) {
					$cont=$cont-1;
					$update = "UPDATE produtos SET cod = $cont WHERE cod = $cont+1";
				}
			?>
		}

		function Cadastrar(){
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
				echo "Cadastrado com Sucesso!";
			}else{
				echo "Cadastro bunro";
			}

		?>	
		Corrigir();		
		}
		function Excluir(){
		<?php
			$server = "localhost";
			$user = "root";
			$pass = "";
			$dbname = "mercadinho";
			$cod = $_POST['Excluir'];

			$conexao = new mysqli($server,$user,$pass,$dbname);
			$delete = "DELETE FROM produtos WHERE cod = $cod";
			if ($conexao->query($delete)===TRUE){
				echo "Excluido com Sucesso!";
			}
		?>		
		}
		function Atualizar(){
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
					echo "Atualizado com Sucesso!";
				}else{
					echo "num deu";
				}
			?>

		}
	</script>
</head>
<body style="font-family: Segoe UI;">
	<form  action = "Loja1.php" method = "POST">		
		<div class = "form-group">
			<h2>Cadastrar produtos</h2>
				
			<div class = "row">
				<div class = "col-lg-2">
					Nome do Produto: <br>
					<input type="text" name="Produto" class = "form-control">
				</div>
				<div class = "col-lg-2">
					Preco do Produto:<br>
					<input type="text" name="Preco" class = "form-control">
				</div>
					<div class = "col-lg-2">
					Categoria:<br>
					<input type="text" name="Categoria" class = "form-control">
					</div>	
					<div class = "col-lg-2"><br>
					<input onclick="Cadastrar()" type="submit" value="Enviar Produto" class = "btn btn-secondary">
					</div>
				</div>
		</div>
	</form>
	<br>
	<form action = "Loja1.php" method="POST">
		<div class = "form-group">
			<h2>Excluir produtos</h2>
			<div class = "row">
				<div class = "col-lg-6">
						Digite o codigo do produto:<br>
						<input type = "text" name="Excluir" class = "form-control"><br>
						</div>
						<div class = "col-lg-2"><br>
							<input onclick="Excluir()" type="submit" value="Excluir item" class = "btn btn-secondary">
						</div>
			</div>
		</div>
	</form>
	<br>
	<form action = "Loja1.php" method = "POST">
	
		<div class = "form-group">
			<h2>Atualizar produto</h2>	
			<div class = "row">
				<div class = "col-lg-2">
					Codigo do produto:<br>
					<input type="text" name="Cod" class = "form-control"><br>
				</div>
				<div class = "col-lg-2">
					Campo a ser alterado:<br>
					<input type="text" name="Campo" class = "form-control"><br>
				</div>
				<div class = "col-lg-2">
					Valor a ser inserido<br>
					<input type="text" name="Value" class = "form-control"><br>
				</div>
				<div class = "col-lg-2"><br>
					<input onclick="Atualizar()" type="submit" value="Atualizar" class = "btn btn-secondary">	
				</div>
			</div>
		</div>
	</form>
	<br>
<div>
	<table class = "table table-bordered table-hover col-lg-6">
		<thead>
			<tr>
				<th scope="col">cod</th>
			 	<th scope="col">nome_prod</th>
			 	<th scope="col">preco</th>
				<th scope="col">categ</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">
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
				 	for($i =0; $i<$linhas;$i++){
				 		$reg = $consulta->fetch_row();
				 		echo "$reg[0]<br>";
				 	}
					?>
				</th>
				<td>
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
				 	for($i =0; $i<$linhas;$i++){
				 		$reg = $consulta->fetch_row();
				 		echo "$reg[1]<br>";
				 	}
					?>
				</td>
				<td>
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
				 	for($i =0; $i<$linhas;$i++){
				 		$reg = $consulta->fetch_row();
				 		echo "$reg[2]<br>";
				 	}
					?>
				</td>
				<td>
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
				 	for($i =0; $i<$linhas;$i++){
				 		$reg = $consulta->fetch_row();
				 		echo "$reg[3]<br>";
				 	}
					?>
				</td>
			</tr>
		</tbody>
	</table>
</div>
</body>
</html>