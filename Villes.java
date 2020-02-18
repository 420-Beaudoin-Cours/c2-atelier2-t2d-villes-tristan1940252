package com.company;

public class Villes {

    public static void afficherTab(int[][] tab2d){
        for (int i = 0; i< tab2d.length; i++){
            System.out.println("");
            for (int j = 0; j < tab2d[i].length; j++){
                System.out.print(tab2d[i][j] + " ");
            }
        }
    }

    public static int sommeUneLigne(int[][] tab2d, int iLigne) {
        int total = 0;
        for (int iCol = 0; iCol < tab2d[iLigne].length; iCol++){
            total += tab2d[iLigne][iCol];
        }
        return total;
    }
    public static double moyenneUneLigne(int[][] tab2d, int iLigne){
        double moyenne = 0;
        for (int i = 0; i < tab2d[iLigne].length; i++){
                moyenne += tab2d[iLigne][i];
            }
        try{moyenne /= tab2d[iLigne].length;}
        catch (ArithmeticException e){
            moyenne = -1;
        }
        return moyenne;
    }
    public static double moyenneUneCol(int[][] tab2d, int iCol){
        double moyenne = 0;
        for (int i = 0; i < tab2d.length; i++)
        return  moyenne;
    }
}
