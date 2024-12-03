package Lojas;

import Animais.Animal;
import Animais.Cachorro;
import org.w3c.dom.ls.LSOutput;

public class PetShot {
    public void darBanho(Animal animal){
        animal.setEstadoDoEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDoEspirito("tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDoEspirito("com saudade");
    }
}
