package com.altioracorp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altioracorp.model.Articulo;
import com.altioracorp.service.IArticuloService;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

	@Autowired
	private IArticuloService service;

	@PostMapping(produces = "application/json", consumes = "application/json")
	public Articulo registrar(@RequestBody Articulo articulo) {
		return service.registrar(articulo);
	}

	@GetMapping(produces = "application/json")
	public List<Articulo> listar() {
		return service.listar();
	}

	@GetMapping(produces = "application/json", value = "/{id}")
	public Optional<Articulo> listarPorID(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}

}
