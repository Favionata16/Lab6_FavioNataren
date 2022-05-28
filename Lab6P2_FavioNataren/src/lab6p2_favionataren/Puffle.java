package lab6p2_favionataren;

import java.awt.Color;

public class Puffle {
    
    String Nombre = "";
    int Precio = 0;
    Color color = null;

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
