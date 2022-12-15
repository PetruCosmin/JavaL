package BarChart;

import java.util.Scanner;

public class BarChart {

public static class Jucator {
    String nume;
    int puncte;
        public void setNume(String N){
            nume=N;
        }
        public String getNume(){
            return nume;
        }
        public void setPuncte(int P){
            puncte=P;
        }
        public int getPuncte(){
            return puncte;
        }


}
    int numereRand(int min, int max){
        int aruncari = (max - min) + 1;
        return (int)(Math.random() * aruncari) + min;
    }


    public static void main( String[] args ) {

        BarChart obiect=new BarChart();
        Scanner A= new Scanner(System.in);
        Scanner B= new Scanner(System.in);
        Scanner C= new Scanner(System.in);
        Scanner D= new Scanner(System.in);
        int cosuri=obiect.numereRand(1,50);     //numarul de cosuri
                System.out.println("********Aruncari la cos*******");
                System.out.println("Fiecare jucator a aruncat la cos de*** ["+cosuri+"] *** ori");
                System.out.println("Precizati numarul de inscrieri pentru fiecare jucator!");

                Jucator Art = new Jucator();

        System.out.println("Introduceti numele:");
        String Artnume = A.nextLine();
        Art.setNume(Artnume);
        System.out.println(Art.getNume()+"\t a aruncat de:"+ cosuri+"ori, Si a marcat de:");
        int ArtPuncte =A.nextInt();
        int scorArt=cosuri-ArtPuncte;
        System.out.println(Artnume+" are "+scorArt+" ratari!");
        Art.setPuncte(ArtPuncte);
        System.out.println("Punctajul lui\t"+Art.getNume()+ "\teste:"+ArtPuncte);
        System.out.print("\n");
        Jucator Bob = new Jucator();
        System.out.println("Introduceti numele:");
        String Bobnume = B.nextLine();
        Bob.setNume(Bobnume);
        System.out.println(Bob.getNume()+"\t a aruncat de:"+ cosuri+"ori, Si a marcat de:");
        int BobPuncte =B.nextInt();
        int scorBob=cosuri-BobPuncte;
        System.out.println(Bobnume+" are "+scorBob+" ratari!");
        Bob.setPuncte(BobPuncte);
        System.out.println("Punctajul lui\t"+Bob.getNume()+ "\teste:"+BobPuncte);
        System.out.print("\n");
        Jucator Cal= new Jucator();
        System.out.println("Introduceti numele:");
        String Calnume = C.nextLine();
        Bob.setNume(Calnume);
        System.out.println(Cal.getNume()+"\t a aruncat de:"+cosuri+"ori, A marcat de");
        int CalPuncte =C.nextInt();
        int scorCal=cosuri-CalPuncte;
        System.out.println(Calnume+" are"+scorCal+" ratari!");
        Bob.setPuncte(CalPuncte);
        System.out.println("Punctajul lui\t"+Cal.getNume()+ "\teste:"+CalPuncte);
        System.out.print("\n");
        Jucator Dan = new Jucator();
        System.out.println("Introduceti numele:");
        String Dannume = D.nextLine();
        Bob.setNume(Dannume);
        System.out.println(Dan.getNume()+"\t a aruncat de:"+cosuri+"ori, A marcat de");
        int DanPuncte =D.nextInt();
        int scorDan=cosuri-DanPuncte;
        System.out.println(Dannume+" are"+scorDan+" ratari!");
        Bob.setPuncte(DanPuncte);
        System.out.println("Punctajul lui\t"+Dan.getNume()+ "\teste:"+DanPuncte);
        System.out.print("\n");

        System.out.println("Afisam Punctajul");
        System.out.print(Artnume+":");
            for(int i=1; i<=ArtPuncte; i++){
                System.out.print("*");
                 }
        System.out.println("\nAfisam Punctajul");
        System.out.print(Bobnume+":");
            for(int i=1; i<=BobPuncte; i++){
                System.out.print("*");
                 }
        System.out.println("\nAfisam Punctajul");
        System.out.print(Calnume+":");
            for(int i=1; i<=CalPuncte; i++){
                System.out.print("*");
                }
        System.out.println("\nAfisam Punctajul");
        System.out.print(Dannume+":");
            for(int i=1; i<=DanPuncte; i++){
                System.out.print("*");
                }

    }
        }


