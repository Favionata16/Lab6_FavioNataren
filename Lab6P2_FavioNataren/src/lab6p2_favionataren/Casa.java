/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_favionataren;

import java.util.ArrayList;
/**
 *
 * @author favio
 */
public class Casa {
    
    protected String Nombre;
    protected int Size = 0,Costo = 0;
    protected int CoordenadaX = 0,CoordenadaY = 0;
    
    ArrayList<Puffle> puffles = new ArrayList();

    public Casa(String Nombre, int Size, int Costo, int  CoordenadaX, int CoordenadaY) {
        this.Nombre = Nombre;
        this.CoordenadaX = CoordenadaX;
        this.CoordenadaY = CoordenadaY;
        this.Costo = Costo;
        this.Size = Size;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(int CoordenadaX) {
        this.CoordenadaX = CoordenadaX;
    }

    public int getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(int CoordenadaY) {
        this.CoordenadaY = CoordenadaY;
    }

    public ArrayList<Puffle> getPuffles() {
        return puffles;
    }

    public void setPuffles(ArrayList<Puffle> puffles) {
        this.puffles = puffles;
    }

    @Override
    public String toString() {
        return "Casa{" + "Size=" + Size + ", Costo=" + Costo + ", CoordenadaX=" + CoordenadaX + ", CoordenadaY=" + CoordenadaY + ", puffles=" + puffles + '}';
    }
    
    
    
    
}
