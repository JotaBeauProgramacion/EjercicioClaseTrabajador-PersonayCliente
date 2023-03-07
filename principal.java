/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNombre("Jota");
        c1.setEdad(19);
        c1.setTelefono(609231256);
        c1.setCredito(100);
        System.out.println("Los datos del cliente es: "+c1.infoCliente());
        System.out.println("----------------");
        Trabajador t1 = new Trabajador();
        t1.setNombre("Antonio");
        t1.setEdad(29);
        t1.setTelefono(609214556);
        t1.setSalario(1000);
        System.out.println("Los datos del Trabajador es: "+t1.infoTrabajador());
    }
}
