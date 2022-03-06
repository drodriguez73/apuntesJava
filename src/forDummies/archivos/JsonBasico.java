package forDummies.archivos;

import java.util.stream.*;
import java.util.Set;

import java.io.File;

import org.json.*;


public class JsonBasico {

    public static Set<String> leerCarpeta(String dir) {
        return Stream.of(new File(dir).listFiles())
            .filter(file -> !file.isDirectory())
            .map(File::getName)
            .collect(Collectors.toSet());
    }


    public static void main(String[] args) {

        System.out.println("Carpeta:" + leerCarpeta("C:/temp"));


    }

}