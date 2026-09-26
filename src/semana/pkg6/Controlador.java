/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg6;

/**
 *
 * @author jhann
 */
import java.util.ArrayList;

public class Controlador {
    ArrayList<Persona> lista = new ArrayList<>();

    public void agregarPersona(Persona nuevaPersona) {
        lista.add(nuevaPersona);
    }

    public void listarPersonas() {
        System.out.println("La lista contiene las siguientes personas:");
        for (Persona p : lista) {
            System.out.println("Tipo Doc: " + p.getTipoDoc()
                + " Nro Doc: " + p.getNumDoc()
                + " Nombre: " + p.getNombre()
                + " Ap. Paterno: " + p.getApPaterno()
                + " Ap. Materno: " + p.getApMaterno());
        }
    }
    
}
