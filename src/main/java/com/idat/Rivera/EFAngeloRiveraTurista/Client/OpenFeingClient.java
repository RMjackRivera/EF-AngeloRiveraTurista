package com.idat.Rivera.EFAngeloRiveraTurista.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.Rivera.EFAngeloRiveraTurista.dto.HospedajeDTO;


@FeignClient(name = "hospedaje-microservicio" , url="localhost:8080")
public interface OpenFeingClient {
	@GetMapping("/api/hospedaje/v1/listar")
	public List<HospedajeDTO> listarHospedajes();
}
