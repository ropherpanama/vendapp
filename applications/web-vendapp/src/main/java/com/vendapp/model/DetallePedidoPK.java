package com.vendapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DetallePedidoPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_pedido", nullable = false)
	private Integer idPedido;

	@Column(name = "id_producto", nullable = false)
	private Integer idProducto;

	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	public DetallePedidoPK() {
	}
	
	public DetallePedidoPK(Integer idPedido, Integer idProducto, Integer cantidad) {
		super();
		this.idPedido = idPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}
}
