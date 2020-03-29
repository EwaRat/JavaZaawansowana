package edu.sda.java.advanced.task3;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SafeNotepad {

    // kod skopiowany ze slacka character stream

    public static void main(String[] args) throws IOException { // throws bo wyj. kontrolowany!!

        FileReader inputStream = null; //czytanie
        FileWriter outputStream = null; //pisanie

        try {
            inputStream = new FileReader("test.txt"); //otworz plik
            outputStream = new FileWriter("out.txt"); //plik wyjsciowy

           // System.out.println(new File(".").getCanonicalFile());

            int c;
            int offset=5;
            while ((c = inputStream.read()) != -1) { //do c przyrownujemy input i do tego -1 przyrownujemy !!!
                // System.out.print(c + " "); // zamienia litery na znaki ASCII
                //char sign = (char) c;// rzutowanie z int na char


                if (c == 32) {      // bo mamy spacje=32 przed przesunieciem o 5 w tabeli ASCII
                    outputStream.write(c);
                    System.out.print((char) c);
                } else {
                    int translated = (((c - 65) + offset) % 26) + 65; // czyli jesli nie jest spacja zrob to
                    outputStream.write(translated);
                    System.out.print((char) translated);

                }
            }

        } catch (IOException e) {
            System.err.println("Problem z plikiem" + e.getMessage()); // System.err jak sout ale typowo dla drukowania bledow
            // e.printStackTrace();  //drukuje stos wywolanych funkcji
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();

            }
        }
    }

}
