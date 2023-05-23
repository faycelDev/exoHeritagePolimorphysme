import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Animal lion1 = new Lion("lolo");
        Animal lion2 = new Lion("doudou");
        Animal lion3 = new Lion("pierro");
        Animal lion4 = new Lion("lionnou");

        lion2.marcher(7);
        lion2.marcher();


        Tigre tigre1 = new Tigre("tigrou");
        Tigre tigre2 = new Tigre("tigrette");
        Tigre tigre3 = new Tigre("blackTigre");
        Tigre tigre4 = new Tigre("bigTigre");

        AnimalMarin requin1 = new Requin();
        Requin requin2 = new Requin();

        List<Animal> tabAnimaux = new ArrayList<>();  //Tableau polymorphique
        tabAnimaux.add(lion1);
        tabAnimaux.add(lion2);
        tabAnimaux.add(tigre1);
        tabAnimaux.add(tigre2);
        tabAnimaux.add(tigre3);
        tabAnimaux.add(tigre4);
        tabAnimaux.add(lion3);
        tabAnimaux.add(lion4);

            for(Animal animal : tabAnimaux){

                animal.manger();
                animal.dormir();

            }


        List<AnimalMarin> tabAnimauxMarin = new ArrayList<>();
            tabAnimauxMarin.add(requin1);
            tabAnimauxMarin.add(requin2);

            for(AnimalMarin animalMarin : tabAnimauxMarin){

                requin2.nager();
            }
        }



}
