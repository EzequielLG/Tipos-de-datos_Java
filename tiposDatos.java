// Autor: LozanoSoft

import java.io.*;

class tiposDatos
{

    public static void main(String args[])
    {

        // Números enteros

        byte numB = 127; // Entero, 1 byte con signo (-128 a 127)
        short numS = 32767; // Entero, 2 bytes con signo (-32,768 a 32,767)
        int numI = 2147483647; // Entero, 4 bytes con signo (-2,147,483,648 a 2,147,483,647)
        long numL = 9223372036854775807L; // Entero, 8 bytes con signo (-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)

        System.out.println("\n" + numB);
        System.out.println(numS);

        System.out.println(
          numI + "\n" +
          numL + "\n"
        );

        // Números flotantes (con punto decimal)

        float numF = 3.4E38F; // Real, IEEE 754, 32 bits (±1.5 x 10^-45 a ±3.4 x 10^38)
        double numD = 1.7E308D; // Real, IEEE 754, 64 bits (±5,0 × 10^−324 a ±1,7 × 10^308)

        System.out.println(
          numF + "\n" +
          numD + "\n"
        );

        // Cadenas de caracteres

        char letra = 'L'; // Caracter Unicode, 2 bytes
        String mensaje = "Hola mundo"; // Cadena de caracteres Unicode

        System.out.println(
          letra + "\n" +
          mensaje + "\n"
        );

        // Booleanos (true / false)

        boolean BooleanoT = true; // 1 bit -> 1
        boolean BooleanoF = false; // 1 bit -> 0

        System.out.println(
          BooleanoT + "\n" +
          BooleanoF + "\n"
        );

    }

}
