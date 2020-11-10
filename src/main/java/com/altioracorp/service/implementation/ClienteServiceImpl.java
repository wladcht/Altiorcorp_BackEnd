package com.altioracorp.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altioracorp.dao.IClienteDAO;
import com.altioracorp.model.Cliente;
import com.altioracorp.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDAO dao;

	@Override
	public Cliente registrar(Cliente entidad) {
		return dao.save(entidad);
	}

	@Override
	public Optional<Cliente> listarPorId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Cliente> listar() {
		return dao.findAll();
	}

}
