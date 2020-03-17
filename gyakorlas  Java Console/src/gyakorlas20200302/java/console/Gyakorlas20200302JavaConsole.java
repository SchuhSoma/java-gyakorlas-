/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas20200302.java.console;

import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author schuhs
 */
public class Gyakorlas20200302JavaConsole {

    /**
     * @param args the command line arguments
     */
    static Random rnd=new Random();
    public static void main(String[] args) 
    {
        Feladat1KamatosKamat();
        System.out.println("\n--------------------------------\n");
        Feladat2HaromJegyuHetteolszthato();
        System.out.println("\n--------------------------------\n");
        Feladat3OttelOszthatoKetjegyu();
        System.out.println("\n--------------------------------\n");
        Feladat5Jatek(); 
        System.out.println("\n--------------------------------\n");
        Feladat6Gomb();
        System.out.println("\n--------------------------------\n");
        Feladat7Meterologia();
        System.out.println("\n--------------------------------\n");
        FeladatNegyHatvanyok();
        System.out.println("\n--------------------------------\n");
        FeladatDioptria();
    }

    private static void Feladat1KamatosKamat() 
    {System.out.println("1.Feladat Kamatos kamat számítás");
        Scanner KezdoOsszeg=new Scanner(in);
        System.out.print("Kérem adja meg a kezdő összeget: ");
        double KezdoOsszegSzam=KezdoOsszeg.nextDouble();
        Scanner EvekSzama=new Scanner(in);
        System.out.print("Kérem adja meg hány évig szeretné a pépnzét lekötni: ");
        double EvekSzamaSzam=EvekSzama.nextDouble();
        Scanner KamatSzazalek=new Scanner(in);
        System.out.print("Kérem adja meg a banki kamat %-ot: ");
        double KamatSzazalekSzam=KamatSzazalek.nextDouble();
        
        double KamatosKamat=0;
        double Kamatszorzo=(100+KamatSzazalekSzam)/100;
        for (int i = 1; i <= EvekSzamaSzam; i++) 
        {
            KamatosKamat=KezdoOsszegSzam*Math.pow(Kamatszorzo,i);
            System.out.println("Az "+i+" évi kamatos kamat: "+ KamatosKamat +" Ft");
        }
        
    }

    private static void Feladat2HaromJegyuHetteolszthato()
    {
        System.out.println("2.Feladat: Írja ki az összes háromjegyű héttel osztható számot");
        int HettelOszthato;
        for (int i = 17; i <= 142; i++)
        {
            HettelOszthato=7*i;
            System.out.print(HettelOszthato+" , ");
        }
    }

    private static void Feladat3OttelOszthatoKetjegyu()
    {
        System.out.println("3.Feladat: Kétjegyű öttel osztható számok");
        int OttelOszthato;
        int db=0;
        for (int i = 2; i <= 19; i++)
        {
            OttelOszthato=5*i;
            if(OttelOszthato%2==0)
            {
                db++;
            }
            System.out.print(OttelOszthato+" , ");
        }
         System.out.println("4.Feladat: Kétjegyű öttel osztható számok ami kettövel is oszthatók");
         System.out.println("Ennyi kettővel osztható szám van közötte: "+db);
         for (int i = 2; i <= 19; i++)
        {
            OttelOszthato=5*i;
            if(OttelOszthato%2==0)
            {
              System.out.print(OttelOszthato+" , ");
            }
            
        }
    }

    private static void Feladat5Jatek()
    {System.out.println("5.Feladat: Játék");
       Scanner Nev=new Scanner(in);
       System.out.print("Kérem adja meg a nevét: ");
       String JatekosNeve=Nev.next();
       Scanner Jatekos=new  Scanner(in);
       System.out.print("Kérem adjon meg egy számot 1 és 10 között: ");
       int JatekosSzam=Jatekos.nextInt();
       int GepValasztas=rnd.nextInt(11)+1;
       if(GepValasztas>JatekosSzam)
       {
           System.out.println("\tGép által választott szám: "+GepValasztas);
           System.out.println("\tSajnalom "+ JatekosNeve+ " vesztett");
       }
       else
       {
           System.out.println("\tGép által választott szám: "+GepValasztas);
           System.out.println("\tGratulálok "+ JatekosNeve+ " Ön nyert");
       }
    }

    private static void Feladat6Gomb() 
    {
       System.out.println("6.Feladat: Gömb felszíne, térfogata");
       Scanner Sugar=new  Scanner(in);
       System.out.print("Kérem adja meg a gömb sugarát: ");
       double SugarSzam=Sugar.nextDouble();
       double Terfogat=4*Math.pow(SugarSzam, 3)*Math.PI/4;
       double Felszin=4*Math.pow(SugarSzam, 2)*Math.PI;
       System.out.println("\tA gömb térfogata: "+Terfogat+ " cm^3");
       System.out.println("\tA gömb felszíne: "+Felszin+ " cm^2");
    }

    private static void Feladat7Meterologia()
    {
        System.out.println("7.Feladat: Meterologia");
        int Csapadek;
        double Osszeg=0;
        double Atlag=0;
        int db=0;
        for (int i = 1; i < 22; i++)
        {
            Csapadek=rnd.nextInt(30)+35;
            System.out.println(i+" nap csapadek := "+Csapadek);
            Osszeg+=Csapadek;
            Atlag=Osszeg/21;
            if(Csapadek>55)
            {
                db++;
            }
        }
        System.out.println("Az átlag napi csapadék az időszakban: "+Atlag);
        System.out.println("A napok száma amikor 55 mm feletti volt a csapadék: "+db);
        
    }

    private static void FeladatNegyHatvanyok() 
    {
        System.out.println("8.Feladat: Négy hatványok");
        double HatvanyAlap=4;
        double Ertek;
        for (int i = 1; i < 13; i++)
        {
           Ertek=Math.pow(HatvanyAlap, i);
            System.out.println(i+" hatvány: "+Ertek);
        }
    }

    private static void FeladatDioptria() 
    {System.out.println("9.Feladat: dioptria");
       Scanner Nev=new Scanner(in);
       System.out.print("Kérem adja meg a nevét: ");
       String Neve=Nev.next();
       Scanner dioptria=new  Scanner(in);
       System.out.print("Kérem adjon meg egy számot 1 és 10 között: ");
       int dioptriasSzam=dioptria.nextInt();
       if(0<=dioptriasSzam && dioptriasSzam<=1)
       {
           System.out.println("Az Ön szeme "+ Neve+" jó a látása");
       }
       if(1<dioptriasSzam && dioptriasSzam<=2)
       {
           System.out.println("Az Ön szeme "+ Neve+" – átlagos a látása");
       }
       if(2<dioptriasSzam && dioptriasSzam<=3)
       {
           System.out.println("Az Ön szeme "+ Neve+" enyhén gyenge a látása");
       }
       if(3<dioptriasSzam && dioptriasSzam<=4)
       {
           System.out.println("Az Ön szeme "+ Neve+"  gyenge a látása");
       }
       if(4<dioptriasSzam && dioptriasSzam<=5)
       {
           System.out.println("Az Ön szeme "+ Neve+" nagyon gyenge a látása");
       }
       if(5<dioptriasSzam && dioptriasSzam<=6)
       {
           System.out.println("Az Ön szeme "+ Neve+" nagyon-nagyon gyenge a látása");
       }
    }
    
}
