package com.altioracorp.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altioracorp.dao.IArticuloDAO;
import com.altioracorp.model.Articulo;
import com.altioracorp.service.IArticuloService;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	private IArticuloDAO dao;

	@Override
	public Articulo registrar(Articulo entidad) {
		return dao.save(entidad);
	}

	@Override
	public Optional<Articulo> listarPorId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Articulo> listar() {
		return dao.findAll();
	}

}
