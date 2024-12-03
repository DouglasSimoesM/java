import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 4, "carinho");
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);
        PetShot petShot = new PetShot();

        petShot.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDoEspirito());

        petShot.darBanho(gato1);
        System.out.println(gato1.getEstadoDoEspirito());

        petShot.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDoEspirito());

    }
}