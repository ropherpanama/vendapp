package com.vendapp.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
public class ProductosFacturaId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Factura factura;
	private Producto producto;

	@ManyToOne(fetch = FetchType.LAZY)
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ProductosFactura that = (ProductosFactura) o;

		if (factura != null ? !factura.equals(that.getFactura()) : that.getFactura() != null)
			return false;
		if (producto != null ? !producto.equals(that.getProducto()) : that.getProducto() != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result;
		result = (factura != null ? factura.hashCode() : 0);
		result = 31 * result + (producto != null ? producto.hashCode() : 0);
		return result;
	}
}
