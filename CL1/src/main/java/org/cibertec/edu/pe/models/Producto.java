package org.cibertec.edu.pe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	private int Id;
	private String Nombre;
	private String Descripcion;
	private double Precio;
	
	
	//CONSTRUCTORES
	
	public Producto() {
		super();
	}
	
	public Producto(int id, String nombre, String descripcion, double precio) {
		super();
		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
		Precio = precio;
	}
	
	//METODOS LECTURA Y ESCRITURA

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
	

	




}
