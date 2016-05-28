package com.vendapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pedido")
	private Integer idPedido;

	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", nullable = false)
	private Cliente idCliente;

	@ManyToOne
	@JoinColumn(name = "id_vendedor", referencedColumnName = "id_vendedor", nullable = false)
	private Vendedor idVendedor;

	@Column(name = "fecha_pedido")
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "M-")
	private Date fechaPedido;

	@Column(name = "monto", precision = 12)
	private Float monto;

	@Column(name = "num_pedido")
	@NotNull
	private Integer numPedido;

	@Column(name = "estado")
	@NotNull
	private Integer estado;

	public Integer getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Integer id) {
		this.idPedido = id;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Vendedor getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Vendedor idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
	}

	public Integer getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(Integer numPedido) {
		this.numPedido = numPedido;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
}
