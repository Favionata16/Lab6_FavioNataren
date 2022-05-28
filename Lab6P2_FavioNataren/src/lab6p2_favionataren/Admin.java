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
public class Admin {

    ArrayList<Pinguino> pinguinos = new ArrayList();
    ArrayList<Casa> casas = new ArrayList();
    ArrayList<Juego> juegos = new ArrayList();
    ArrayList<Puffle> puffles = new ArrayList();
    ArrayList<Item> items = new ArrayList();

    public Pinguino Buscar(String Name, String Password) {
        for (Pinguino pinguino : pinguinos) {
            if (pinguino.getNombre().equals(Name) && pinguino.getPassword().equals(Password)) {
                return pinguino;
            }
        }

        return null;
    }

}
