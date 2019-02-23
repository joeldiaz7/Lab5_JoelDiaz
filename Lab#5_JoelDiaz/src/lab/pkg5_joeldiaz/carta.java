package lab.pkg5_joeldiaz;

public class carta {
    private String nombre;
    private int dmg;
    private int hp;
    private String objetivo;
    private String vel;
    private int costo;
    private String tipo;

    public carta() {
    }

    public carta(String nombre, int dmg, int hp, String objetivo, String vel, int costo, String tipo) {
        this.nombre = nombre;
        this.dmg = dmg;
        this.hp = hp;
        this.objetivo = objetivo;
        this.vel = vel;
        this.costo = costo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVel() {
        return vel;
    }

    public void setVel(String vel) {
        this.vel = vel;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
