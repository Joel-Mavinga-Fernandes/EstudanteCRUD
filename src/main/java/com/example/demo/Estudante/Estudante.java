package com.example.demo.Estudante;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name= "tb_estudante")
public class Estudante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email; 
	
	private int idade;
	
	public Estudante(Long id, String nome, String email, int idade) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
//		this.ddn = ddn;
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public LocalDate getDdn() {
//		return ddn;
//	}
//
//	public void setDdn(LocalDate ddn) {
//		this.ddn = ddn;
//	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	

}
