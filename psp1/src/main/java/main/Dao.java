package main;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
		
	Optional<T> get(long id);
    
    List<T> getAll();
    
    void guardar(T t);
    
    void modificar(T t, String[] params);
    
    void eliminar(T t);
}
