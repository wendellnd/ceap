function sort(){ 
	var a = Number(Math.floor(Math.random() * 6)+1);
	var b = Number(Math.floor(Math.random() * 6)+1);
	if(a > b){
		document.querySelector("h1").textContent = "Player 1 venceu!";
		document.querySelector("title").textContent = "Player 1 venceu!";
	}else if(b > a){
		document.querySelector("h1").textContent = "Player 2 venceu!";
		document.querySelector("title").textContent = "Player 2 venceu!";
	}else{
		document.querySelector("h1").textContent = "Seus ruim!";
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
sort();