package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.entidade.Filmes;

public interface FilmesRepository extends JpaRepository<Filmes, Long> {

}
