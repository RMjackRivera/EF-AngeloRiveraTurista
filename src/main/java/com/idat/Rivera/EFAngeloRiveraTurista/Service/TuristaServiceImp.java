package com.idat.Rivera.EFAngeloRiveraTurista.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.Rivera.EFAngeloRiveraTurista.Client.OpenFeingClient;
import com.idat.Rivera.EFAngeloRiveraTurista.Model.HospedajeTuristaFK;
import com.idat.Rivera.EFAngeloRiveraTurista.Model.Turista;
import com.idat.Rivera.EFAngeloRiveraTurista.Model.TuristaDetalle;
import com.idat.Rivera.EFAngeloRiveraTurista.Repository.DetalleTuristaRepository;
import com.idat.Rivera.EFAngeloRiveraTurista.Repository.TuristaRepository;
import com.idat.Rivera.EFAngeloRiveraTurista.dto.HospedajeDTO;



public class TuristaServiceImp implements TuristaService {

	@Autowired
	private TuristaRepository turistaRepo;
	@Autowired
	private DetalleTuristaRepository detalleRepo;
	
	
	
	@Autowired
	private OpenFeingClient client;

	
	
	@Override
	public void guardarTurista(Turista turista) {
		turistaRepo.save(turista);

	}

	@Override
	public void asignarHospedajeTurista() {
		 List<HospedajeDTO> listado = client.listarHospedajes();
	        
		    HospedajeTuristaFK fk = null;
	        TuristaDetalle detalle = null;
	        
		    for (HospedajeDTO hospedajeDTO : listado) {
				fk = new HospedajeTuristaFK();
				fk.setIdHospedaje(hospedajeDTO .getCod());
				fk.setIdHospedaje(1);
				
				detalle = new TuristaDetalle();
				detalle.setFk(fk);
			   
	            detalleRepo.save(detalle);
			
		    }

	}

}
