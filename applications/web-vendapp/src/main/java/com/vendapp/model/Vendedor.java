package com.vendapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "vendedores")
@Proxy(lazy = false)
public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_vendedor")
	private Integer idVendedor;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "ruta_vendedor")
	private String ruta;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
