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
            moyenne = 0;
        }
        return moyenne;
    }

    public static double moyenneUneCol(int[][] tab2d, int iCol){
        double moyenne = 0;
        for (int i = 0; i < tab2d.length; i++){
                moyenne += tab2d[i][iCol];
        }
        try{
            moyenne /= tab2d.length;
        }
        catch (ArithmeticException e){
            moyenne = 0;
        }
        return  moyenne;
    }

    public static int maxLigne(int[][] tab2d, int iLigne){
        int imax = 0;
        for (int i = 0; i < tab2d[iLigne].length; i++){
            if (tab2d[iLigne][i] > tab2d[iLigne][imax]){
                imax = i;
            }
        }
        return tab2d[iLigne][imax];
    }

    public static int minLigne(int[][] tab2d, int iLigne){
        int imin = 0;
        for (int i =0; i < tab2d[iLigne].length; i++){
            if (tab2d[iLigne][imin] > tab2d[iLigne][i])
                imin = i;
        }
        return tab2d[iLigne][imin];
    }

    public static  int maxCol(int[][] tab2d, int iCol){
        int imax = 0;
        for (int i = 0; i < tab2d.length; i++){
            if (tab2d[imax][iCol] < tab2d[i][iCol])
                imax = i;
        }
        return tab2d[imax][iCol];
    }
}
