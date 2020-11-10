package com.altioracorp.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ordenDetalle")
public class OrdenDetalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOrdenDetalle;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_orden", nullable = false, foreignKey = @ForeignKey(name = "detalle_orden"))
	private Orden orden;

	@ManyToOne
	@JoinColumn(name = "id_articulo", nullable = false, foreignKey = @ForeignKey(name = "detalle_articulo"))
	private Articulo articulo;

	public Integer getIdOrdenDetalle() {
		return idOrdenDetalle;
	}

	public void setIdOrdenDetalle(Integer idOrdenDetalle) {
		this.idOrdenDetalle = idOrdenDetalle;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}
