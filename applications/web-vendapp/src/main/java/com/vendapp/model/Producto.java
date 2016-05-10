package com.vendapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_producto")
	private Integer idProducto;

	@Column(name = "nombre_producto", length = 50)
	@NotNull
	private String nombreProducto;

	@Column(name = "precio", precision = 22)
	@NotNull
	private Double precio;

	@Column(name = "disponible")
	private Integer disponible;

	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer id) {
		this.idProducto = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getDisponible() {
		return disponible;
	}

	public void setDisponible(Integer disponible) {
		this.disponible = disponible;
	}
}
