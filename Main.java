package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] meteo = {{76,68,81,91,65,96,107,94,98,107,96,130},
                {55,51,59,65,66,67,69,82,72,61,72,67},
                {71,63,70,72,76,90,89,96,89,80,92,92},
                {87,68,84,84,78,78,95,91,73,89,86,102}};

//        Villes.afficherTab(meteo);
//        System.out.println(Villes.sommeUneLigne(meteo , 0));
//        System.out.print(Villes.moyenneUneLigne(meteo, 0));
//        System.out.print(Villes.moyenneUneCol(meteo, 1));
//        System.out.println(Villes.maxLigne(meteo,1));
//        System.out.println(Villes.minLigne(meteo,2));
        System.out.println(Villes.maxCol(meteo, 1));
    }
}
