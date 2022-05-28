/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_favionataren;
/**
 *
 * @author favio
 */
import java.util.ArrayList;

public class Pinguino {
    
    protected String Nombre;
    protected String Password;
    protected boolean Socio = false;
    protected int Dinero = 1000;
    protected Casa casa = null;
    protected ArrayList<Item> items = new ArrayList();
    
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
