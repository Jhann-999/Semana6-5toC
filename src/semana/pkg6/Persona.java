/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg6;

/**
 *
 * @author jhann
 */
public class Persona {
    private String tipoDoc;
    private String numDoc;
    private String nombre;
    private String apMaterno;
    private String apPaterno;

    public Persona() {
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
         if (tipoDoc.equals("DNI") || tipoDoc.equals("CE")) {
        this.tipoDoc = tipoDoc;
    } else {
        System.out.println("Tipo de documento invalido, debe ser DNI o CE");
    }
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
       if (this.tipoDoc == null) {
        System.out.println("Primero debe ingresar el tipo de documento");
        return;
    }
    if (this.tipoDoc.equals("DNI") && numDoc.length() == 8) {
        this.numDoc = numDoc;
    } else if (this.tipoDoc.equals("CE") && numDoc.length() == 9) {
        this.numDoc = numDoc;
    } else {
        System.out.println("Numero de documento invalido para el tipo " + this.tipoDoc);
    }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
      if (nombre != null && !nombre.trim().isEmpty()) {
        this.nombre = nombre;
    } else {
        System.out.println("El nombre no puede estar vacio");
    }
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
     if (apMaterno != null && !apMaterno.trim().isEmpty()) {
        this.apMaterno = apMaterno;
    } else {
        System.out.println("El apellido materno no puede estar vacio");
    }
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
     if (apPaterno != null && !apPaterno.trim().isEmpty()) {
        this.apPaterno = apPaterno;
    } else {
        System.out.println("El apellido paterno no puede estar vacio");
    }
    }
    
    
}
