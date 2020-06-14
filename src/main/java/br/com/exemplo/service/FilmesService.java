package br.com.exemplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exemplo.entidade.Filmes;
import br.com.exemplo.repository.FilmesRepository;

@Service
public class FilmesService {

	@Autowired
	private FilmesRepository filmeRepo;
	
	public List<Filmes> buscarTodosFilmes() {
		return filmeRepo.findAll();
	}
	
	public Optional<Filmes> buscarFilmePeloId(long id) {
		return filmeRepo.findById(id);
	}
	
}
