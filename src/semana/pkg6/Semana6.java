/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg6;

/**
 *
 * @author jhann
 */
import java.util.Scanner;
public class Semana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona();
        String rpta = "s";
        Controlador controla = new Controlador();

        while (rpta.equalsIgnoreCase("s")) {

            System.out.println("Ingrese tipo de documento");
            String tipo = sc.nextLine();
            p1.setTipoDoc(tipo);

            System.out.println("Ingrese numero de documento");
            String nro = sc.nextLine();
            p1.setNumDoc(nro);

            System.out.println("Ingrese su nombre: ");
            String nom = sc.nextLine();
            p1.setNombre(nom);

            System.out.println("Ingrese su apellido paterno");
            String apPe = sc.nextLine();
            p1.setApPaterno(apPe);

            System.out.println("Ingrese su apellido materno");
            String apMa = sc.nextLine();
            p1.setApMaterno(apMa);

            controla.agregarPersona(p1);
            System.out.println("Desea ingresar otra persona s/n");
            rpta = sc.nextLine();
        }
        controla.listarPersonas();
        // TODO code application logic here
    }
    
}
