package com.gym.monsterfit.services.implementations;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gym.monsterfit.entities.RutinaEjercicioEntity;
import com.gym.monsterfit.repositories.RutinaEjercicioRepository;
import com.gym.monsterfit.services.interfaces.RutinaEjercicioServiceInterface;

@Service
public class RutinaEjercicioService implements RutinaEjercicioServiceInterface {

    private RutinaEjercicioRepository repository;

    public RutinaEjercicioService(RutinaEjercicioRepository rutinaEjercicioRepository) {
        this.repository = rutinaEjercicioRepository;
    }

	@Override
	public List<RutinaEjercicioEntity> obtenerEjerciciosPorRutina(int rutinaId) {
		return repository.findByRutinaId(rutinaId);
    }


	@Override
	public List<RutinaEjercicioEntity> obtenerEjerciciosPorFecha(LocalDate fecha) {	
		return repository.findByFecha(fecha);
	}

	@Override
	public void agregarEjercicioRutina(RutinaEjercicioEntity rutinaEjercicio) {
		repository.save(rutinaEjercicio);
	}

	@Override
	public void actualizarEjercicioRutina(RutinaEjercicioEntity rutinaEjercicio) {
		repository.save(rutinaEjercicio);
	}

	@Override
	public void eliminarEjercicioRutina(int rutinaEjercicioId) {
		repository.deleteById(rutinaEjercicioId);
	}

   
}