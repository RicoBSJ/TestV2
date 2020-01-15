package com.sdzee.beans;

public class Coyote {
	private String nom;
	private String prenom;
	private boolean genius;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isGenius() {
		return genius;
	}

	public void setGenius(boolean genius) {
		/*
		 * Wile E. Coyote fait toujours preuve d'une ingéniosité hors du commun, c'est
		 * indéniable ! Bip bip...
		 */
		this.genius = genius;
	}

}