/*
    Alumno: Jorge Gregorio Loredo Hernández
    Matricula: 1736010
    Tarea 20:
    Construya un programa en JAVA que, al recibir como datos un arreglo bidimensional de
    NxM elementos de tipo entero y un número entero, determine cuántas veces se encuentra 
    este número dentro del arreglo. Además, que imprima la matriz al final 
*/

import java.util.Scanner;
public class tarea20 {
public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int i;
        int n;
        int m;
        int j;
        int nb;
        int r = 0;
        int[][] A;
        System.out.print("Ingresa el total de filas: ");
        n = lec.nextInt();
        System.out.print("Ingresa el total de columnas: ");
        m = lec.nextInt();
        A = new int[n][m];

        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]");
                A[i][j] = lec.nextInt();
            }
        }

        System.out.println("--------------------------");
        System.out.print("Que numero quieres buscar? ");
        nb = lec.nextInt();

        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                if(A[i][j] == nb) {
                    r++;
                }
            }
        }

        System.out.print("A[" + n + "][" + m + "]\n");
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("El numero " + nb + " se impimio " + r + " veces.");
    }
}
