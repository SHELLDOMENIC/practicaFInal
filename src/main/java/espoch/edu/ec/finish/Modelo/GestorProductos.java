
package espoch.edu.ec.finish.Modelo;


/**
 *
 * @author and_j
 */
public class GestorProductos {
      int tamanoVector = 5;
    Productos[] productos = new Productos[tamanoVector];
    int cont = 0;

    public String agregarTarea(Productos producto) {
        String msg = "Ingreso exitoso";
        
        if (productos.length != cont) {
            for (int i = 0; i < productos.length; i++) {
                if (productos[i] == null) {
                    //inicializar el objeto
                    productos [i] = new Productos();
                    productos[i].setId(i);
                    productos[i].setTitulo(producto.getTitulo());
                    productos[i].setPrecio(producto.getPrecio());
                    productos[i].setEstado(producto.isEstado());
                    cont++;
                    //con esto me aseguro que los datos solo se ingresen una vez en el vector. 
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Productos[] listarProductos() {

        Productos[] auxProductos = new Productos[tamanoVector];
        for (int i = 0; i < cont; i++) {

            //if (tareas[i].getEstado()) {
            auxProductos[i] = new Productos();
            auxProductos[i].setId(productos[i].getId());
            auxProductos[i].setTitulo(productos[i].getTitulo());
            auxProductos[i].setPrecio(productos[i].getPrecio());
            auxProductos[i].setEstado(productos[i].isEstado());
            System.out.println("Modelo-listaProducto" + auxProductos[i].isEstado());
            // }
        }
        return auxProductos;
    }

    public String agregarProductos(Productos objProductos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

