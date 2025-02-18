
package espoch.edu.ec.finish.Controlador;

import espoch.edu.ec.finish.Modelo.GestorProductos;
import espoch.edu.ec.finish.Modelo.Productos;
import espoch.edu.ec.finish.Vista.Listar;
import espoch.edu.ec.finish.Vista.Vista;




/**
 *
 * @author and_j
 */
public class Controlador {
    private Vista vista;
    private GestorProductos gestorProductos;
    private Listar listar;
    
    //Cuando hagas conexion con el modelo --> quita los /// de la linea 17
    //private GestorTarea gestorTarea;
    public Controlador(Vista vista, GestorProductos gestorProductos, Listar listar) {
        this.vista = vista;
        this.gestorProductos =  new GestorProductos();
        this.listar = listar;
    }
        public void agregarProductos() {
        try {
            if (this.vista != null) {
                Productos objProductos = new Productos();
                objProductos.setNombre(this.vista.getNombre());
                objProductos.setPrecio(this.vista.getPrecio());
                //objProductos.setEstado(this.vista.getEstado());
                objProductos.setEstado(Boolean.parseBoolean(this.vista.getEstado()));


                String msg = gestorProductos.agregarProducto(objProductos);
                vista.error(msg);
            } else {
                vista.error("¡Completa todos los datos!");
            }
        } catch (Exception e) {
            vista.error("Error al agregar producto: " + e.getMessage());
        }  
}
    public void listarProductos() {
      try {
        Productos[] productos = gestorProductos.listarProductos();
        if (productos != null) {
            StringBuilder lista = new StringBuilder();
            for (Productos p : productos) {
                if (p != null) {
                    lista.append("ID: ").append(p.getId()).append("\n")
                         .append("Título: ").append(p.getNombre()).append("\n")
                         .append("Precio: ").append(p.getPrecio()).append("\n")
                         .append("Estado: ").append(p.getEstado() ? "Activo" : "Inactivo").append("\n\n");
                }
            }
            System.out.println(lista.toString()); // Muestra la lista en consola
            listar.mostrarLista(lista.toString()); // Si listarIU tiene un método para mostrar la lista en la interfaz
        } else {
            listar.mostrarLista("No hay productos disponibles.");
        }
    } catch (Exception e) {
        listar.mostrarLista("Error al listar productos: " + e.getMessage());
    }
} 
} 
        
        
        
        
        
        
        
        
        
        

    
                        
    

