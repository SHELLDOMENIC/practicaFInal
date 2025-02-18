
package espoch.edu.ec.finish.Tester;

import java.security.Principal;

/**
 *
 * @author and_j
 */
public class TesterVista {
    private Principal principal;

    public TesterVista(Principal principal) {
        this.principal = principal;
    }

    public void prueba() {
        //Principal principal=new Principal();
        try {
            System.out.println("Titulo: " + principal.getName());
            System.out.println("Descripcion: " + principal.getName());
            System.out.println("Estado: " + principal.getName());

        } catch (NumberFormatException e) {
            //vista.mostrarError("Error cambiate a ambiental");
        }
    
}
}
