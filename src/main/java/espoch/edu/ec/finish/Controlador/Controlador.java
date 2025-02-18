
package espoch.edu.ec.finish.Controlador;

import espoch.edu.ec.finish.Modelo.GestorProductos;
import espoch.edu.ec.finish.Modelo.Productos;
import java.security.Principal;

/**
 *
 * @author and_j
 */
public class Controlador {
    private Principal principal;
    private GestorProductos gestorProductos;
    private ListarIU listarIU;
    //Cuando hagas conexion con el modelo --> quita los /// de la linea 17
    //private GestorTarea gestorTarea;

    public Controlador(Principal principal, ListarIU listarIU) {
        this.principal = principal;
        this.listarIU= listarIU;
        //Cambia el constructor de la clase modelo
        this.gestorProductos = new GestorProductos();
    }

    public void agregarProductos() {
        try {
        if (this.principal != null) {
            Productos objProductos = new Productos();
            objProductos.setId(Integer.parseInt(this.principal.getId())); // Asegúrate de que el ID sea un número válido
            objProductos.setTitulo(this.principal.getTitulo());
            objProductos.setDescripcion(this.principal.getDescripcion());
            objProductos.setEstado(this.principal.isEstado()); // Agregar los paréntesis

            String msg = gestorProductos.agregarTarea(objProductos); // Cambiar gestorTarea por gestorProductos
            principal.error(msg);
        } else {
            principal.error("¡Completa los datos!");
        }
    } catch (NumberFormatException e) {
        principal.error("Error: el ID debe ser un número válido.");
    } catch (NullPointerException e) {
        principal.error("Error: Faltan datos en el formulario.");
    } catch (Exception e) {
        principal.error("Error inesperado: " + e.getMessage());
    }
}
    }
        
     /*try {
            if (this.principal != null) {
                Productos objProductos = new Productos();
                objProductos.setTitulo(this.principal.getTitulo());
                objProductos.setDescripcion(this.principal.getDescripcion());
                objProductos.setEstado(this.principal.isEstado());
                String msm = gestorTarea.agregarTarea(objTarea);
                principal.error(msm);

            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Error controlado:" + e);
        }
    }*/


        

    public void listarProductos() {
      try {
        Productos[] productos = gestorProductos.listarProductos();
        if (productos != null) {
            StringBuilder lista = new StringBuilder();
            for (Productos p : productos) {
                if (p != null) {
                    lista.append("ID: ").append(p.getId()).append("\n")
                         .append("Título: ").append(p.getTitulo()).append("\n")
                         .append("Precio: ").append(p.getPrecio()).append("\n")
                         .append("Estado: ").append(p.isEstado() ? "Activo" : "Inactivo").append("\n\n");
                }
            }
            System.out.println(lista.toString()); // Muestra la lista en consola
            listarIU.mostrarLista(lista.toString()); // Si listarIU tiene un método para mostrar la lista en la interfaz
        } else {
            listarIU.mostrarLista("No hay productos disponibles.");
        }
    } catch (Exception e) {
        listarIU.mostrarLista("Error al listar productos: " + e.getMessage());
    }
} 
} 
        
        
        
        
        
        
        
        
        
        

    
                        
    

