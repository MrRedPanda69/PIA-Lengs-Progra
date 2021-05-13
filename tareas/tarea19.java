/*
    Alumno: Jorge Gregorio Loredo Hernández
    Matricula: 1736010
    Tarea 19:
    Elaborar un programa en JAVA que realice una búsqueda de un número en un vector, mostrando solamente un mensaje indicando cuantas veces apareció el número. Además de imprimir el vector
*/

import java.util.Scanner;

public class tarea19 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n;
        int i;
        int b;
        int r = 0;
        int[] A;
        System.out.print("Ingresa el total de numeros: ");
        n = lec.nextInt();
        A = new int[n];

        for(i = 0; i < n; i++) {
            System.out.print( "A[ " + (i + 1) + " ]= " );
            A[i] = lec.nextInt();
        } // Fin for

        System.out.print("Que numero quieres buscar? ");
        b = lec.nextInt();

        System.out.print("A = [ ");
        for(i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        } // Fin for impresion de vector
        System.out.println("]");

        for(int v : A) {
            if(v == b) {
                r++;
            }
        }
        System.out.print("El numero " + b + " se impimio " + r + " veces.");
    }
}
