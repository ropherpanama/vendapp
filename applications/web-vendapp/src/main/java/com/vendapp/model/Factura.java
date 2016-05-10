package com.vendapp.model;

import java.util.Calendar;

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
@Table(name = "facturas")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_factura")
	private Integer idFactura;

	//@OneToMany(mappedBy = "idFactura", fetch = FetchType.EAGER)
	//private Set<ProductosFactura> productosFacturas;

	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", nullable = false)
	private Cliente idCliente;

	@ManyToOne
	@JoinColumn(name = "id_vendedor", referencedColumnName = "id_vendedor", nullable = false)
	private Vendedor idVendedor;

	@Column(name = "fecha_factura")
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar fechaFactura;

	@Column(name = "num_factura", length = 100)
	@NotNull
	private String numFactura;

	@Column(name = "importe", precision = 22)
	@NotNull
	private Double importe;

	public Integer getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(Integer id) {
		this.idFactura = id;
	}
	
//	public Set<ProductosFactura> getProductosFacturas() {
//		return productosFacturas;
//	}
//
//	public void setProductosFacturas(Set<ProductosFactura> productosFacturas) {
//		this.productosFacturas = productosFacturas;
//	}

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

	public Calendar getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Calendar fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
}
