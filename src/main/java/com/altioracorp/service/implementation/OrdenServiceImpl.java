package com.altioracorp.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altioracorp.dao.IOrdenDAO;
import com.altioracorp.model.Orden;
import com.altioracorp.service.IOrdenService;

@Service
public class OrdenServiceImpl implements IOrdenService {

	@Autowired
	private IOrdenDAO dao;

	@Override
	public Orden registrar(Orden entidad) {
		entidad.getOrdenDetalle().forEach(detalle -> detalle.setOrden(entidad));
		return dao.save(entidad);
	}

	@Override
	public Optional<Orden> listarPorId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Orden> listar() {
		return dao.findAll();
	}

	@Override
	public Orden modificar(Orden ord) {
		ord.getOrdenDetalle().forEach(detalle -> detalle.setOrden(ord));
		return dao.save(ord);
	}

	@Override
	public boolean eliminar(Integer id) {
		dao.deleteById(id);
		return true;
	}

}
