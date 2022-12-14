package com.idat.Rivera.EFAngeloRiveraTurista.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "turista")
@Entity
public class Turista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;
	private String nombreTurista;
	private Integer nrocelular;
	private String direccion;
	public Integer getIdTurista() {
		return idTurista;
	}
	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	public String getNombreTurista() {
		return nombreTurista;
	}
	public void setNombreTurista(String nombreTurista) {
		this.nombreTurista = nombreTurista;
	}
	public Integer getNrocelular() {
		return nrocelular;
	}
	public void setNrocelular(Integer nrocelular) {
		this.nrocelular = nrocelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
