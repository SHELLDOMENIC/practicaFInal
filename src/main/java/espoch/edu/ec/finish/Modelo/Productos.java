
package espoch.edu.ec.finish.Modelo;

/**
 *
 * @author and_j
 */
public class Productos {

    static int length;
    
    private int id;
    private String nombre;
    private double precio;
    private boolean estado;

    public Productos(int id, String nombre, double precio, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }
    public Productos(){
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Productos.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}