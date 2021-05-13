/*
    Alumno: Jorge Gregorio Loredo Hernández
    Matricula: 1736010
    Tarea 16:
    Elabore un programa en JAVA que mediante un Menú de opciones permita calcular la conversión de escala de temperatura:
    1. De grados Centígrados a grados Farenheit
    2. De grados Farenheita grados  Centígrados
    (Nota: 
    Usar el cuadro de dialogo, showOptionDialog(), para seleccionar : °C -> °F  y otro °F -> °C,)
*/
import javax.swing.JOptionPane;

public class tarea16 {
    public static void main(String[] args) {
        String entrada;

        String[] options = {"Grados Celsius a Farenheit", "Grados Farenheit a Celsius"};
        int v = JOptionPane.showOptionDialog(null, 
        "Selecciona tu tipo de conversion",
        "Programa de conversiones",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]);
        float n;
        if(v == 0) {
            entrada = JOptionPane.showInputDialog("Ingresa la temperatura en Celsius");
            n = Float.parseFloat(entrada);
            n = ( (n * 9) / 5 ) + 32;
            JOptionPane.showMessageDialog(null, "La temperatura en Farenheit es: " + n); 
        } else {
            entrada = JOptionPane.showInputDialog("Ingresa la temperatura en Farenheit");
            n = Float.parseFloat(entrada);
            n = ( (n - 32) * 5 ) / (9);
            JOptionPane.showMessageDialog(null, "La temperatura en Celsius es: " + n); 
        }
    }
}