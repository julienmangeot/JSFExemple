package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit implements Serializable{
	
	@Id
	@GeneratedValue
	private int idProduit;
	@Column(nullable= false, unique = true)
	private String nomProduit;
	private String descri;
	private double prix;
	
	@JoinColumn(name="idMarque")
	@ManyToOne
	private Marque marque;
	
	public Produit() {
	}

	public Produit(String nomProduit, String descri, double prix) {
		this.nomProduit = nomProduit;
		this.descri = descri;
		this.prix = prix;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	
	public String toString() {
		return "Identifiant :" + idProduit + ", Nom :" + nomProduit + ", Decription :" + descri + ", Prix :"
				+ prix + ", Marque :" + marque;
	}
}
