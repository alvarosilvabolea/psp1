package psp1.psp1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static Connection connection =null;
    public static void main( String[] args ) throws SQLException
    {
    	
    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jardineria?useUnicode=true&useLegacyDatetimeCode="
    			+ "false&serverTimezone=UTC", "admin", "admin");
        System.out.println("Elige que quieres hacer:");
        System.out.println("1-Añade un cliente");
        System.out.println("2-Muestra un cliente");
        System.out.println("3-Muestra todos los cliente");
        System.out.println("4-Buscar clientes");
        System.out.println("5-Edita producto");
        System.out.println("0-Cerrar");
        
        int caso;
        Scanner teclado= new Scanner (System.in);
        
        caso = teclado.nextInt();
    
        	
            
        // booleano ? codigo si es true : codigo si es false;
        //? System.out.println("La opcion es correcta"):System.out.println("La opcion no es correcta");  
        
        System.out.println("La opción " + (caso>-1 && caso<6 ? "es correcta" : "no es correcta"));
        
        
        
    }
    
    public void anyadeCliente() {
    	
    }
    
    public void muestraCliente() {
    	
    }
    
    public void muestraClientes() {
    	
    }
    
    public void buscaClientes() {
    }
    
    public void editaProducto() {
    }
        
        
        
        
    
}
