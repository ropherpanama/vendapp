package com.vendapp.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
	@EmbeddedId
	private DetalleFacturaPK id;

	@ManyToOne
	@JoinColumn(name = "id_factura", referencedColumnName = "id_factura", insertable = false, updatable = false)
	private Factura idFactura;

	@ManyToOne
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
	private Producto idProducto;
	
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	public DetalleFacturaPK getId() {
		return this.id;
	}

	public void setId(DetalleFacturaPK id) {
		this.id = id;
	}

	public Factura getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Factura idFactura) {
		this.idFactura = idFactura;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
