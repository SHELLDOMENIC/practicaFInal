
package espoch.edu.ec.finish.Modelo;

/**
 *
 * @author and_j
 */
public class Productos {

    static int length;
    
    private int id;
    private String titulo;
    private double precio;
    private boolean estado;
    

    public Productos(int id, String titulo, double precio, boolean estado) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
    }

    Productos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
    
    
    
}
