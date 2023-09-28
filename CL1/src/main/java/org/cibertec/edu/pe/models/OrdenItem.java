package org.cibertec.edu.pe.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrdenItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordenItemId;
	@Embedded // 
	private Producto producto;
	private double descuento;
	private double subTotal;
	@ManyToOne
	@JoinColumn(name="orderId") //
	private Orden order;
	
	
	//CONSTRUCTORES
	public OrdenItem() {
		super();
	}



	public OrdenItem(Long ordenItemId, Producto producto, double descuento, double subTotal, Orden order) {
		super();
		this.ordenItemId = ordenItemId;
		this.producto = producto;
		this.descuento = descuento;
		this.subTotal = subTotal;
		this.order = order;
	}


	//METODOS LECTURA Y ESCRITURA
	public Long getOrdenItemId() {
		return ordenItemId;
	}



	public void setOrdenItemId(Long ordenItemId) {
		this.ordenItemId = ordenItemId;
	}



	public Producto getProducto() {
		return producto;
	}



	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	public double getSubTotal() {
		return subTotal;
	}



	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}



	public Orden getOrder() {
		return order;
	}



	public void setOrder(Orden order) {
		this.order = order;
	}
	
	
	
}
