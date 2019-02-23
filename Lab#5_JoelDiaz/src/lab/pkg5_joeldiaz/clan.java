package lab.pkg5_joeldiaz;

import java.util.ArrayList;

public class clan {
    private String nombre;
    private usuario lider;
    private ArrayList<usuario> miembros = new ArrayList();
    private String tipo;

    public clan() {
    }

    public clan(String nombre, usuario lider, String tipo) {
        this.nombre = nombre;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public usuario getLider() {
        return lider;
    }

    public void setLider(usuario lider) {
        this.lider = lider;
    }

    public ArrayList<usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<usuario> miembros) {
        this.miembros = miembros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
