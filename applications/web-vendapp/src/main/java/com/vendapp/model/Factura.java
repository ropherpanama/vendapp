package com.vendapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "facturas")
@Proxy(lazy = false)
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_factura")
	private Integer idFactura;

	@Column(name = "fecha_factura")
	private Date fecha;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendedor")
	private Vendedor vendedor;// una factura fue creada por un vendedor

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;// una factura pertenece a un cliente

	@Column(name = "num_factura")
	private String numFactura;
	
	@Column(name = "importe")
	private double importe;

	@OneToMany(fetch = FetchType.LAZY, mappedBy ="pk.factura")
	private List<ProductosFactura> productosFactura;

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public List<ProductosFactura> getProductosFactura() {
		return productosFactura;
	}

	public void setProductosFactura(List<ProductosFactura> productosFactura) {
		this.productosFactura = productosFactura;
	}
}
