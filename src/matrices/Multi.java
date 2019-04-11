
package matrices;

import java.util.Scanner;


public class Multi {
    public static void main(String[] args) {
        Scanner param = new Scanner(System.in);
        System.out.println("Dame el n. de lineas: ");
        int lineas = param.nextInt();
        System.out.println("Dame el n. de columnas: ");
        int columnas = param.nextInt();
        // creo las 3 matrices
        int matr_uno[][] = new int[lineas][columnas];
        int matr_due[][] = new int[columnas][lineas];
        int matr_tre[][] = new int[lineas][lineas];
        // pongo los numeros aleatorios en las dos matrices
        for (int linea = 0; linea < lineas; linea++) {
            for (int col = 0; col < columnas; col++) {
                matr_uno[linea][col] = (int) (Math.random() * 10);
                matr_due[col][linea] = (int) (Math.random() * 10);
            }
        }
        for (int linea = 0; linea < lineas; linea++) {
            for (int col = 0; col < columnas; col++) {
                matr_uno[linea][col] = (int) (Math.random() * 10);
                matr_due[col][linea] = (int) (Math.random() * 10);
            }
        }
        // calculo la matriz 3
        for (int linea_3 = 0; linea_3 < lineas; linea_3++) {
            for (int linea = 0; linea < lineas; linea++) {
                for (int col = 0; col < columnas; col++) {
                    matr_tre[linea_3][linea] = matr_tre[linea_3][linea] + matr_uno[linea][col] * matr_due[col][linea_3];
                }
            }
        }
        // enseño la matriz 1
        System.out.println("Matriz 1");
        for (int linea = 0; linea < lineas; linea++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("[" + matr_uno[linea][col] + "] ");
            }
            System.out.println("");
        }
        // enseño la matriz 2
        System.out.println("Matriz 2");
        for (int linea = 0; linea < columnas; linea++) {
            for (int col = 0; col < lineas; col++) {
                System.out.print("[" + matr_due[linea][col] + "] ");
            }
            System.out.println("");
        }
        // enseño la matriz 3
        System.out.println("Matriz 3");
        for (int linea = 0; linea < lineas; linea++) {
            for (int col = 0; col < lineas; col++) {
                System.out.print("[" + matr_tre[linea][col] + "] ");
            }
            System.out.println("");
        }
    }
}
