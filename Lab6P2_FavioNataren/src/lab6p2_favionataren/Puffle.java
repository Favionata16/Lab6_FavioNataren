/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_favionataren;

import java.awt.Color;
/**
 *
 * @author favio
 */
public class Puffle {
    
    protected String Nombre;
    protected int Precio = 0;
    protected Color color = null;

    public Puffle(String Nombre, int Precio, Color color) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.color = color;                
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Puffle{" + "Nombre=" + Nombre + ", Precio=" + Precio + ", color=" + color + '}';
    }
    
    
}
