package com.example.demo.Estudante.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Estudante.Estudante;
import com.example.demo.Estudante.Service.EstudanteService;

@RestController
@RequestMapping(path = "api/v1/estudante")
public class EstudanteController {
	
	@Autowired
	private EstudanteService estudanteService;
	
	@GetMapping
	public List<Estudante> getStudents(){		
		return estudanteService.getStudants();
	}
		
	}



