/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Trabajador extends Persona {
    private int salario;

    public Trabajador() {
        
    }

    public Trabajador(int salario, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public String infoTrabajador() {
        return infoPersona()+ " salario=" + salario + '}';
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
