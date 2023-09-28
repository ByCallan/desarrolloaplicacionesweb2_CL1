package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.models.Producto;

public interface IProductoService {
	
	public List<Producto> Lista();
	public Optional<Producto> Buscar(String id);
	public int Guardar(Producto p);
	public void Eliminar(String id); 

}
