package com.example.demo.Estudante.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Estudante.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
