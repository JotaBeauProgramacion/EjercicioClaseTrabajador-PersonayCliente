/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Cliente extends Persona {
   private int credito;

    public Cliente() {
        
    }

    public Cliente(int credito, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    
    public String infoCliente() {
        return infoPersona()+ " credito=" + credito + '}';
    }
   
   
}
