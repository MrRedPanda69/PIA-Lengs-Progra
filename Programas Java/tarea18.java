/*
    Alumno: Jorge Gregorio Loredo Hernández
    Matricula: 1736010
    Tarea 18:
    Construya un programa en JAVA. Que calcule e imprima la siguiente serie para los N primeros  términos
    1, 8, 243, 16384, 1953125 ...
*/

import java.util.Scanner;

public class tarea18 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n;
        int i;
        System.out.print("Ingrese el total de numeros: ");
        n = lec.nextInt();
        for(i = 1; i <= n; i++) {
            System.out.println(Math.pow(i, ((2 * i) - 1)) + ",");
        }
    } 
} 