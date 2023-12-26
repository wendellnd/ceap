var pontA = 0;
var pontB = 0;
function sort(){ 
	var a = Number(Math.floor(Math.random() * 6)+1);
	var b = Number(Math.floor(Math.random() * 6)+1);

	if(a > b){
		pontA++;
		document.querySelector("h1").innerHTML = "Player 1: "+pontA+"<br>Player 2: "+pontB;
		document.querySelector("title").textContent = "Player 1 venceu!";
	}else if(b > a){
		pontB++;
		document.querySelector("h1").innerHTML = "Player 1: "+pontA+"<br>Player 2: "+pontB;
		document.querySelector("title").textContent = "Player 2 venceu!";
	}else{
		document.querySelector("h1").innerHTML = "Player 1: "+pontA+"<br>Player 2: "+pontB;
		document.querySelector("title").textContent = "Seus ruim!";
	}
	switch(a){
		case 1: document.getElementsByClassName("img1")[0].setAttribute("src","images/dado1.png");break;
		case 2: document.getElementsByClassName("img1")[0].setAttribute("src","images/dado2.png");break;
		case 3: document.getElementsByClassName("img1")[0].setAttribute("src","images/dado3.png");break;
		case 4: document.getElementsByClassName("img1")[0].setAttribute("src","images/dado4.png");break;
		case 5: document.getElementsByClassName("img1")[0].setAttribute("src","images/dado5.png");break;
		case 6: document.getElementsByClassName("img1")[0].setAttribute("src","images/dado6.png");break;	
	}
	switch(b){
		case 1: document.getElementsByClassName("img2")[0].setAttribute("src","images/dado1.png");break;
		case 2: document.getElementsByClassName("img2")[0].setAttribute("src","images/dado2.png");break;
		case 3: document.getElementsByClassName("img2")[0].setAttribute("src","images/dado3.png");break;
		case 4: document.getElementsByClassName("img2")[0].setAttribute("src","images/dado4.png");break;
		case 5: document.getElementsByClassName("img2")[0].setAttribute("src","images/dado5.png");break;
		case 6: document.getElementsByClassName("img2")[0].setAttribute("src","images/dado6.png");break;
	}
}
function zerar(){
	pontA = 0;
	pontB = 0;
	document.querySelector("h1").innerHTML = "Player 1: "+pontA+"<br>Player 2: "+pontB;
	document.querySelector("title").textContent = "Zerou!";
}