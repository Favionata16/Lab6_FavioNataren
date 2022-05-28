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
public class Item {
    
    protected String Nombre;
    protected int Precio = 0;
    protected String Tipo;

    public Item(String Nombre, int Precio, String Tipo) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Tipo = Tipo;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Item{" + "Nombre=" + Nombre + ", Precio=" + Precio + ", Tipo=" + Tipo + '}';
    }
    
    
}
