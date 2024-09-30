import java.util.*;

public class Comprobacion {
    
    public static void realizarComprobacion() {
        Habitante habitante1 = new Habitante("Víctor","Rodriguez","De la Serna");
        Habitante habitante2 = new Habitante("Jorge", "Salvaje", "Jordi");
        OficinaPadron padron = new OficinaPadron();
        padron.annadir(habitante1);
        padron.annadir(habitante2);
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante: habitantes){
            System.out.println(habitante.getNombre() + habitante.getApellido1() + habitante.getApellido2());
        }
        System.out.println(padron.sumarHabitantes());
       }
}

