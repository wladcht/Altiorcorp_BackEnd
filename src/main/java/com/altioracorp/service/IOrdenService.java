package com.altioracorp.service;

import com.altioracorp.model.Orden;

public interface IOrdenService extends ICRUD<Orden> {

	public Orden modificar(Orden orden);

	public boolean eliminar(Integer id);

}
