package com.vendapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DetalleFacturaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "id_factura", nullable = false)
	private Integer idFactura;

	@Column(name = "id_producto", nullable = false)
	private Integer idProducto;

	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	public DetalleFacturaPK(){
	}
	
	public DetalleFacturaPK(Integer idFactura, Integer idProducto, Integer cantidad) {
		super();
		this.idFactura = idFactura;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

}
