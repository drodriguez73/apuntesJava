package forDummies.archivos;


import java.util.Arrays;

import java.io.File;



public class ListarSimple {

    public static File[] leerCarpeta(String dir) {
        File[] archivos = new File(dir).listFiles();
        return archivos;
        
    }


    public static void main(String[] args) {

        System.out.println("Carpeta:" + Arrays.toString(leerCarpeta("C:/temp")));


    }

}