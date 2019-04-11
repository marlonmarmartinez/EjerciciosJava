package matrices;

public class Multiplicacion {

    public static void main(String[] args) {
        int m[][] = new int[2][3];
        int m2[][] = new int[3][2];
        int r[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = (int) (Math.random() * 5);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = (int) (Math.random() * 5);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (r[0][0] == 0) {
                int temporal = (m[0][0] * m2[0][0]) + (m[0][1] * m2[1][0])
                        + (m[0][2] * m2[2][0]);
                r[0][0] = temporal;

            } else if (r[1][0] == 0) {
                int temporal = (m[1][0] * m2[0][0]) + (m[1][1] * m2[1][0])
                        + (m[1][2] * m2[2][0]);
                r[1][0] = temporal;

            } else if (r[0][1] == 0) {
                int temporal = (m[0][0] * m2[0][1]) + (m[0][1] * m2[1][1])
                        + (m[0][2] * m2[2][1]);
                r[0][1] = temporal;

            } else if (r[1][1] == 0) {
                int temporal = (m[1][0] * m2[0][1]) + (m[1][1] * m2[1][1])
                        + (m[1][2] * m2[2][1]);
                r[1][1] = temporal;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + m[i][j] + " ]");
                }
                if (i == 1) {
                    System.out.print("  X  ");
                } else {
                    System.out.print("     ");
                }
                
            }else{
                System.out.print("                    ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print("[ "+m2[i][j]+" ]");
            }
            if (i == 1) {
                    System.out.print("  =  ");
                } else {
                    System.out.print("     ");
                }
            if(i<2){
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ "+r[i][j]+" ]");
                }
            }
            System.out.println("");
        }
        /*
        /* Multiplicación matrices: "matrizR" = "matrizF1" x "matrizF2"
 * Dimensiones de las matrices:
 * int [][] matrizF1 = new int[filasF1][columnasF1];  
 * int [][] matrizF2 = new int[columnasF1][columnasF2];
 * int [][] matrizR = new int[filasF1][columnasF2];
       
        for (int i = 0; i < filasF1; i++) {
            for (int j = 0; j < columnasF2; j++) {
                for (int k = 0; k < columnasF1; k++) {
                    matrizR[i][j] += matrizF1[i][k] * matrizF2[k][j];                    
                }
            }
        }﻿
        */
    }
}
