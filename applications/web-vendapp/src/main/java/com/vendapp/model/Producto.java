package com.vendapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "productos")
@Proxy(lazy = false)
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "nombre_producto")
	private String nombreProducto;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "disponible")
	private int disponible;

	@OneToMany(fetch = FetchType.LAZY, mappedBy ="pk.producto")
	private List<ProductosFactura> productosFactura;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}

	public List<ProductosFactura> getProductosFactura() {
		return productosFactura;
	}

	public void setProductosFactura(List<ProductosFactura> productosFactura) {
		this.productosFactura = productosFactura;
	}
}
