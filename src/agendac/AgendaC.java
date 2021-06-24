/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendac;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author fatii
 */
public class AgendaC {
static void setModel(DefaultTableModel modelo){
}
    /**
     * @param args the command line arguments
     */
   int Id;
   String Nombre;
   int Edad;
   String Telefono;
   String Correo;

    public AgendaC(int Id, String Nombre, int Edad, String Telefono, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    AgendaC() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
   
    
}
