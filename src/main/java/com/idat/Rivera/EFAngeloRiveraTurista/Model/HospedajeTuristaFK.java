package com.idat.Rivera.EFAngeloRiveraTurista.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HospedajeTuristaFK implements Serializable{

	private static final long serialVersionUID = -7165799496866160750L;
	
	@Column(name = "id_turista" , nullable = false, unique = true)
	private Integer idTurista;
	
	@Column(name = "id_hospedaje" , nullable = false, unique = true)
	private Integer idHospedaje;

	public Integer getIdTurista() {
		return idTurista;
	}

	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}

	public Integer getIdHospedaje() {
		return idHospedaje;
	}

	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
