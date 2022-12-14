package com.idat.Rivera.EFAngeloRiveraTurista.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Rivera.EFAngeloRiveraTurista.Model.Turista;



@Repository
public interface TuristaRepository extends JpaRepository<Turista,Integer> {

}
