package lab6p2_favionataren;

import java.util.ArrayList;

public class Pinguino {
    
    protected String Nombre;
    protected String Password;
    boolean Socio = false;
    int Dinero = 1000;
    Casa casa = null;
    ArrayList<Item> items = new ArrayList();
    
    public Pinguino(String Nombre, String Password){
        this.Nombre = Nombre;
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isSocio() {
        return Socio;
    }

    public void setSocio(boolean Socio) {
        this.Socio = Socio;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
  
}
