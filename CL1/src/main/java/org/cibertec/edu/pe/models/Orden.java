package org.cibertec.edu.pe.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Orden {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
	private Date orderDate;
	private double productCost;
	private double deliveryCost;
	private double discount;
	private double totalAmount;
	@OneToMany(mappedBy = "order" //
            ,cascade = CascadeType.ALL) // 
    private Set<OrdenItem> ordenProductos;

	
	public void addOrderItem(OrdenItem ordenProducto){
        if(ordenProductos == null){
        	ordenProductos = new HashSet<>();
        }
        ordenProductos.add(ordenProducto);
        ordenProducto.setOrder(this);;
    }
	
	

	//CONSTRUCTORES
	public Orden() {
		super();
	}




	public Orden(Long orderId, Date orderDate, double productCost, double deliveryCost, double discount,
			double totalAmount, Set<OrdenItem> ordenProductos) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.productCost = productCost;
		this.deliveryCost = deliveryCost;
		this.discount = discount;
		this.totalAmount = totalAmount;
		this.ordenProductos = ordenProductos;
	}

	//METODOS LECTURA Y ESCRITURA

	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public double getProductCost() {
		return productCost;
	}



	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}



	public double getDeliveryCost() {
		return deliveryCost;
	}



	public void setDeliveryCost(double deliveryCost) {
		this.deliveryCost = deliveryCost;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public double getTotalAmount() {
		return totalAmount;
	}



	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}



	public Set<OrdenItem> getOrdenProductos() {
		return ordenProductos;
	}



	public void setOrdenProductos(Set<OrdenItem> ordenProductos) {
		this.ordenProductos = ordenProductos;
	}
	
	
	
	

}
