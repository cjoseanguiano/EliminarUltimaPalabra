/*
Vamos a escribir un método que reciba un String que contiene una frase. 
1El método eliminará la última palabra y devuelve un String con la frase modificada.
 */
package eliminarultimapalabra;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class EliminarUltimaPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        do {
            System.out.println("Introduce el texto :");
            texto = entrada.nextLine();
        } while (texto.isEmpty());
        texto = eliminarUltimaPalabra(texto);
        System.out.println(texto);
    }

    public static String eliminarUltimaPalabra(String s) {
        int posicion;
        s = s.trim();
        posicion = s.lastIndexOf(" ");
        if (posicion != -1) {
            s = s.substring(0, posicion);

        } else {
            s = "";
        }
        return s;
    }

}
