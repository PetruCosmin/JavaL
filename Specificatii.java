package Exercitiul1;


import java.util.*;
class Argumente{
    String denumire;
    String nume;

    int membreSup;
    int membreinf;

   
    Argumente(String denumire,String nume,int membreSup,int membreinf){
        this.denumire=denumire;
        this.nume=nume;
        this.membreSup=membreSup;
        this.membreinf=membreinf;
    }
}
public class Specificatii extends Argumente {
    int degeteMaini;
    int degetePicioare;

    Specificatii(String denumire, String nume, int membreSup, int membreinf, int degeteMaini, int degetePicioare) {
        super(denumire, nume, membreSup, membreinf);
        this.degeteMaini = degeteMaini;
        this.degetePicioare = degetePicioare;

    }

    public void Afisare() {
        System.out.println("\t" + denumire);
        System.out.println("cu numele: " + nume);
        System.out.println("are: " + membreSup + " membre superioare");
        System.out.println("are: " + membreinf + " membre inferioare");
        System.out.println("are: " + degeteMaini + " degete la maini");
        System.out.println("are: " + degetePicioare + " degete la picioare");

    }

    public static void main(String[] args) {
        int nrCoada = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti specia:");
        String specie = input.next();
        System.out.println("Dati numele: ");
        String nume = input.next();
        System.out.println("Introduceti numarul de membre superioare: ");
        int membresup = input.nextInt();
        System.out.println("Introduceti numarul de membre inferioare: ");
        int membreinf = input.nextInt();
        System.out.println("Introduceti numarul de degete de la maini: ");
        int degeteMaini = input.nextInt();
        System.out.println("introduceti numarul de degete de la picioare: ");
        int degetePicioare = input.nextInt();
        System.out.println("Are coada?");
        String coada = input.next();
        if (Objects.equals(coada, "da")) {
            System.out.println("Dati numarul:");
            nrCoada = input.nextInt();
        } else
            System.out.println("Nu are coada!");


        System.out.println("----------Specia creata este!--------:");
        System.out.println();
        Specificatii obiect = new Specificatii(specie, nume, membresup, membreinf, degeteMaini, degetePicioare);
        obiect.Afisare();
        if (nrCoada > 1)
            System.out.println("Are:" + nrCoada + "cozi");
        else if (nrCoada == 1) {
            System.out.println("Are o coada");
        } else if (Objects.equals(coada, "nu")) {
            System.out.println("Fara coada");
        }
    }
}
