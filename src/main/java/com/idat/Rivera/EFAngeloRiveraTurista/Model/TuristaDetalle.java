package com.idat.Rivera.EFAngeloRiveraTurista.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "detalle_turista")
public class TuristaDetalle {
	@Id
	private HospedajeTuristaFK fk = new HospedajeTuristaFK();

	public HospedajeTuristaFK getFk() {
		return fk;
	}

	public void setFk(HospedajeTuristaFK fk) {
		this.fk = fk;
	}


}
