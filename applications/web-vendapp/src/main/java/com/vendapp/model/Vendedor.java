package com.vendapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendedores")
public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_vendedor")
	private Integer idVendedor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta", nullable = false)
	private Ruta idRuta;

	@Column(name = "nombre_vendedor", length = 15)
	private String nombreVendedor;

	public Ruta getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Ruta idRuta) {
		this.idRuta = idRuta;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
}
