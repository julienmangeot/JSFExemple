package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Marque implements Serializable{
	
	@Id
	@GeneratedValue
	private int idMarque;
	private String nomMarque;
	@Temporal(TemporalType.DATE)
	private Date dateMarque;
	
	public Marque() {
	}
	
	public Marque(String nomMarque, Date dateMarque) {
		this.nomMarque = nomMarque;
		this.dateMarque = dateMarque;
	}

	public int getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(int idMarque) {
		this.idMarque = idMarque;
	}
	public String getNomMarque() {
		return nomMarque;
	}
	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}
	public Date getDateMarque() {
		return dateMarque;
	}
	public void setDateMarque(Date dateMarque) {
		this.dateMarque = dateMarque;
	}

	public String toString() {
		return "Identifiant :" + idMarque + ", Nom :" + nomMarque + ", Date de création :" + dateMarque;
	}
	

}
