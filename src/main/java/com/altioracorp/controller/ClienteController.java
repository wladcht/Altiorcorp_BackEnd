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

import com.altioracorp.model.Cliente;
import com.altioracorp.service.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteService service;

	@PostMapping(produces = "application/json", consumes = "application/json")
	public Cliente registrar(@RequestBody Cliente cliente) {
		return service.registrar(cliente);
	}

	@GetMapping(produces = "application/json")
	public List<Cliente> listar() {
		return service.listar();
	}

	@GetMapping(produces = "application/json", value = "/{id}")
	public Optional<Cliente> listarPorID(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}

}
