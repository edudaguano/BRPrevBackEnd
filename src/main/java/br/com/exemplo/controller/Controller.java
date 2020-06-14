package br.com.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.entidade.Filmes;
import br.com.exemplo.service.FilmesService;


@RestController
@RequestMapping({"/filme"})
public class Controller {
	
	@Autowired
	FilmesService filmesServ;
	
	@RequestMapping(produces = "application/json", 
					method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
	public List<Filmes> buscaTodosFilmes() {
		return filmesServ.buscarTodosFilmes();
	}
	
	@GetMapping(path = {"/{id}"})
	public Optional<Filmes> buscarFilmePeloId(@PathVariable long id) {
		return filmesServ.buscarFilmePeloId(id);
	}
	
	

}
