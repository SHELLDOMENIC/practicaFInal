
package espoch.edu.ec.finish.Tester;

import espoch.edu.ec.finish.Modelo.Productos;

/**
 *
 * @author and_j
 */
public class TesterControlador {
      public void prueba(Productos objproductos) {
        System.out.println("Titulo: " + objproductos.getTitulo());
        System.out.println("Descripcion: " + objproductos.getPrecio());
        System.out.println("Estado: " + objproductos.isEstado());
       
    }
}
