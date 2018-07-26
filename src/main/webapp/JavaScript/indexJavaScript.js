/* On charge tout le DOM avant */
window.onload = auChargement;  
function auChargement(){ 
	document.getElementById('password').onclick = montrerConditionsPassword;
}

/* On montre les regles pour la password */
function montrerConditionsPassword() {  
	alert("Le password doit avoir 10 caracteres maximum");
}
