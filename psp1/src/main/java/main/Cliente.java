package main;

import java.util.List;
import java.util.Optional;

public class Cliente<T> implements Dao<T> {
	  int codigo_cliente;
	  String nombre_cliente;
	
	  
	  public Cliente(int codigo_cliente, String nombre_cliente) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre_cliente = nombre_cliente;
	}


	public int getCodigo_cliente() {
		return codigo_cliente;
	}


	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}


	public String getNombre_cliente() {
		return nombre_cliente;
	}


	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}


	@Override
	public String toString() {
		return "Cliente [codigo_cliente=" + codigo_cliente + ", nombre_cliente=" + nombre_cliente + "]";
	}


	public Optional<T> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public void guardar(T t) {
		// TODO Auto-generated method stub
		
	}


	public void modificar(T t, String[] params) {
		// TODO Auto-generated method stub
		
	}


	public void eliminar(T t) {
		// TODO Auto-generated method stub
		
	} 
	
	
	
	
}
