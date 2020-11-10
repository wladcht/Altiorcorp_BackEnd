package com.altioracorp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altioracorp.model.Orden;
import com.altioracorp.service.IOrdenService;


@RestController
@RequestMapping("/ordenes")
public class OrdenController {

	@Autowired
	private IOrdenService service;
	
	@PostMapping (produces = "application/json", consumes = "application/json")
	public Orden registrar(@RequestBody Orden orden) {
		return service.registrar(orden);
	}

	@GetMapping (produces = "application/json")
	public List<Orden> listar() {
		return service.listar();
	}

	
	@GetMapping(produces = "application/json", value = "/{id}")
	public Optional<Orden> listarPorID(@PathVariable("id") Integer id){
		return service.listarPorId(id);
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public Orden modificar(@RequestBody Orden orden) {
		return service.modificar(orden);
	}
	
	@DeleteMapping(produces = "application/json", value = "/{id}")
	public boolean eliminar(@PathVariable("id") Integer id) {
		return service.eliminar(id);
	}
}
