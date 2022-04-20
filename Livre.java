package beans;

public class Livre {
private String auteur;
private String titre;

public Livre() {
	setAuteur("mohamed");
	setTitre("coran");
}

public String getAuteur() {
	return auteur;
}

public void setAuteur(String auteur) {
	this.auteur = auteur;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}
}

