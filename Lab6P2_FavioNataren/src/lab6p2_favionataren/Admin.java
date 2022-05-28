package lab6p2_favionataren;

import java.util.ArrayList;

public class Admin {
    
    //Atributos
    ArrayList<Pinguino> pinguinos = new ArrayList();
    ArrayList<Casa> casas = new ArrayList();
    ArrayList<Juego> juegos = new ArrayList();
    ArrayList<Puffle> puffles = new ArrayList();
    ArrayList<Item> items = new ArrayList();
    
    //Funciones
    public Pinguino Buscar(String Name, String Password){
        for (Pinguino pinguino : pinguinos) {
            if(pinguino.getNombre().equals(Name) && pinguino.getPassword().equals(Password)){
                return pinguino;
            }
        }
        
        return null;
    }
    
    
}
