package com.vendapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RutaclientePK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_cliente", nullable = false)
	private Integer idCliente;

	@Column(name = "id_ruta", nullable = false)
	private Integer idRuta;

	public RutaclientePK(Integer idCliente, Integer idRuta) {
		super();
		this.idCliente = idCliente;
		this.idRuta = idRuta;
	}

	public RutaclientePK() {
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public Integer getIdRuta() {
		return idRuta;
	}
}
