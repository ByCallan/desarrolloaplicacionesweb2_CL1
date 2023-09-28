package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.cibertec.edu.pe.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

	
	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> Lista() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> Buscar(String id) {
		return data.findById(id);
	}

	@Override
	public int Guardar(Producto p) {
		int hasSaved = 0;
		Producto dbProduct = data.save(p);
		if(!dbProduct.equals(null)) hasSaved = -1;
		return hasSaved;
	}

	@Override
	public void Eliminar(String id) {
		data.deleteById(id);
		
	}

	

}
