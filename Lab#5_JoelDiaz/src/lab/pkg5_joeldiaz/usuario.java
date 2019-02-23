package lab.pkg5_joeldiaz;

import java.util.ArrayList;
import java.util.Date;

public class usuario {
    private String nombre;
    private String apellido;
    private String user;
    private String pass;
    private Date nacimiento;
    private int edad;
    private String color;
    private ArrayList<mazo> mazos = new ArrayList();

    public usuario() {
    }

    public usuario(String nombre, String apellido, String user, String pass, Date nacimiento, int edad, String color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.pass = pass;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<mazo> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<mazo> mazos) {
        this.mazos = mazos;
    }

    @Override
    public String toString() {
        return user;
    }
    
    
}
