package lab6p2_favionataren;

public class Item {
    
    //Atributos
    String Nombre = "";
    int Precio = 0;
    String Tipo = "";

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
