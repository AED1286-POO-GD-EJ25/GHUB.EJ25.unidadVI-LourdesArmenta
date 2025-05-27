package miPrincipal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManejoArchivoNIO {
        public static void main(String[] args) {
        Path rutaArchivo = Paths.get("archivo.txt");

        // Escribir en un archivo
        try {
            Files.write(rutaArchivo, "Hola, mundo!\nEste es un ejemplo de escritura.".getBytes());
            System.out.println("Datos escritos en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde un archivo
        try {
            List<String> lineas = Files.readAllLines(rutaArchivo);
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
