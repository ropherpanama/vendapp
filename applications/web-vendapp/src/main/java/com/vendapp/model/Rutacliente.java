package com.vendapp.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rutacliente")
public class Rutacliente {

	@EmbeddedId
	private RutaclientePK id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
	private Cliente idCliente;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta", nullable = false, insertable = false, updatable = false)
	private Ruta idRuta;

	public RutaclientePK getId() {
		return this.id;
	}

	public void setId(RutaclientePK id) {
		this.id = id;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Ruta getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Ruta idRuta) {
		this.idRuta = idRuta;
	}
}
