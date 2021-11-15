package com.example.demo.Estudante.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Estudante.Estudante;
import com.example.demo.Estudante.Repository.EstudanteRepository;

@Service
public class EstudanteService {
		
	@Autowired	
	 private EstudanteRepository estudanteRepository;
	
	public List<Estudante> getStudants(){
		return estudanteRepository.findAll();
	}

}
