package miPrincipal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class ManejoArchivosCommonsIO {
        public static void main(String[] args) {
        File archivo = new File("archivo.txt");

        // Escribir en un archivo
        try {
            FileUtils.writeStringToFile(archivo, "Hola, mundo!\nEste es un ejemplo de escritura.", "UTF-8");
            System.out.println("Datos escritos en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde un archivo
        try {
            String contenido = FileUtils.readFileToString(archivo, "UTF-8");
            System.out.println("Contenido del archivo:\n" + contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
