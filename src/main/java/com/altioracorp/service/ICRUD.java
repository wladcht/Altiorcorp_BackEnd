package com.altioracorp.service;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {

	public T registrar(T entidad);

	public Optional<T> listarPorId(Integer id);

	public List<T> listar();

}
