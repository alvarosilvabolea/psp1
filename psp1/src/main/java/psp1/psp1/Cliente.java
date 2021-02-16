package psp1.psp1;

public class Cliente {
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
	
	
	
	
}
