package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.dominio.Aluno;

@Repository
public interface AlunoReopsitorio extends JpaRepository<Aluno, Integer> {
	
	

}
