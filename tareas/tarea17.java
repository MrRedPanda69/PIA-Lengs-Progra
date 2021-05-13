/*
    Alumno: Jorge Gregorio Loredo Hernández
    Matricula: 1736010
    Tarea 17:
    Elabore un programa en JAVA que a través de un Menú de opciones permita al usuario convertir de pesos a las siguientes monedas:
    1. Dolar
    2. Euro
    3. Yen(Japonés)
    4. Dolar de Hong Kong
    (Notas:
    Las equivalencias deberán definirse dentro del programa.
    Usar el cuadro de dialogo, showOptionDialog(), para seleccionar : Dólar, Euro, Yen, DolarHK)
*/

import javax.swing.JOptionPane;

public class tarea17 {
    public static void main(String[] args) {
        String entrada;

        String[] options = {"X", "Dolar", "Euro", "Yen", "Dolar HK"};
        int v = JOptionPane.showOptionDialog(null, 
        "Selecciona tu tipo de moneda a convertir",
        "Convertidor de MXN pesos a distintas monedas internacionales",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]);
        float n;
        double y;
        switch(v) {
            case 1:
                entrada = JOptionPane.showInputDialog("Ingresa la cantidad en pesos para convertirlo a dolares");
                n = Float.parseFloat(entrada);
                n = (n) / (1983 / 100);  
                JOptionPane.showMessageDialog(null, "Tienes: " + n + " dolar(es)");
                break;  // fin case 1

            case 2:
                entrada = JOptionPane.showInputDialog("Ingresa la cantidad en pesos para convertirlo a euros");
                n = Float.parseFloat(entrada);
                n = (n) / (477 / 20);  
                JOptionPane.showMessageDialog(null, "Tienes: " + n + " euro(s)");
                break;  // fin case 2
            
            case 3:  
                entrada = JOptionPane.showInputDialog("Ingresa la cantidad en pesos para convertirlo a yenes");
                y = Double.parseDouble(entrada);
                y = (y) / (0.18);  
                JOptionPane.showMessageDialog(null, "Tienes: " + y + " yen(es)");
                break;  // fin case 3

            case 4:
                entrada = JOptionPane.showInputDialog("Ingresa la cantidad en pesos para convertirlo a dolares de Hong Kong");
                n = Float.parseFloat(entrada);
                n = (n) / (51 / 20);  
                JOptionPane.showMessageDialog(null, "Tienes: " + n + " dolar(es) de Hong Kong");
                break;  // fin case 4

            default: JOptionPane.showMessageDialog(null, "Bye");
            break;
        } // fin switch
    } 
} 