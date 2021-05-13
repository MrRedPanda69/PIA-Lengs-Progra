/*
    Alumno: Jorge Gregorio Loredo Hernández
    Matricula: 1736010
    Tarea 21:
    Construya un programa en JAVA que, al recibir como datos un arreglo bidimensional de
    NxM elementos de tipo entero y un número entero, determine cuántas veces se encuentra 
    este número dentro del arreglo. Además, que imprima la matriz al final 
*/

import java.util.Scanner;
public class tarea21 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int i;
        int n;
        int m;
        int j;
        int[][] A;   // Primer Matriz
        int[][] B;   // Segunda Matriz
        int[][] C = new int [20][20];   // Matris resultante

        // Primer matriz
        System.out.print("Ingresa el total de filas para la primer matriz: ");
        n = lec.nextInt();
        System.out.print("Ingresa el total de columnas para la primer matriz: ");
        m = lec.nextInt();
        A = new int[n][m];

        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]");
                A[i][j] = lec.nextInt();
            }
        }
        System.out.print("A[" + n + "][" + m + "]\n");
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        // Segunda Matriz
        System.out.print("Ingresa el total de filas para la segunda matriz: ");
        n = lec.nextInt();
        System.out.print("Ingresa el total de columnas para la segunda matriz: ");
        m = lec.nextInt();
        B = new int[n][m];

        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                System.out.print("B[" + (i + 1) + "][" + (j + 1) + "]");
                B[i][j] = lec.nextInt();
            }
        }
        System.out.print("B[" + n + "][" + m + "]\n");
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }

        //Suma de Matrices
        System.out.print("La suma de las matrices es:\n");

        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.print("C[" + n + "][" + m + "]\n");
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

