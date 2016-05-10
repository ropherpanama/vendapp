package com.vendapp.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "productos_factura")
@AssociationOverrides({ @AssociationOverride(name = "pk.factura", joinColumns = @JoinColumn(name = "id_factura") ),
		@AssociationOverride(name = "pk.producto", joinColumns = @JoinColumn(name = "id_producto") ) })
@Proxy(lazy = false)
public class ProductosFactura {
	private ProductosFacturaId pk = new ProductosFacturaId();
	
	private String numFactura;

	private int cantidad;

	@EmbeddedId
	private ProductosFacturaId getPk() {
		return pk;
	}

	@Column(name = "num_factura")
	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	@Column(name = "cantidad")
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPk(ProductosFacturaId pk) {
		this.pk = pk;
	}

	@Transient
	public Factura getFactura() {
		return pk.getFactura();
	}

	@Transient
	public Producto getProducto() {
		return pk.getProducto();
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ProductosFactura that = (ProductosFactura) o;

		if (getPk() != null ? !getPk().equals(that.getPk()) : that.getPk() != null)
			return false;

		return true;
	}

	public int hashCode() {
		return (getPk() != null ? getPk().hashCode() : 0);
	}
}
