package forDummies.archivos;


import java.util.Arrays;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;



public class ListarSimple {

    public static File[] leerCarpeta(String path) {
        File[] archivos = new File(path).listFiles();
        return archivos;
        
    }

    public static File[] filtrarPorNombreArchivo(File rootDir) {

    	FileFilter fileFilter = new FileFilter() {
    		@Override
    		public boolean accept(File pathname) {
    			String name = pathname.getName();
                /*
                Distintas opciones para
                    return true | false;
                    return name.endsWith(".pdf");
                */

                return name.startsWith("r") && name.endsWith(".pdf");
                
    		}
    	};

    	File[] archivos = rootDir.listFiles(fileFilter);
        return archivos;
    }

    public static File[] filtrarUltimaHora(File rootDir){

        FileFilter fileFilter = new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                /*
                1 hora = 3.6e+6 = 3600000
                */

                boolean ultima = ((System.currentTimeMillis() - pathname.lastModified()) < 3600000)
                    ? true
                    : false;
                
                return ultima;
            }
        };

        long ahora  = System.currentTimeMillis();

    	File[] archivos = rootDir.listFiles(fileFilter);
        return archivos;

    }


    // Igual a filtrarUltimaHora pero utilizando lambdas
    public static File[] filtraultima(File rootDir) {

        FileFilter fileFilter = (pathname) -> {
            boolean ultima = ((System.currentTimeMillis() - pathname.lastModified()) < 3600000)
                ? true
                : false;
            return ultima;
            };

        File[] archivos = rootDir.listFiles(fileFilter);
        return archivos;

    }

    


    public static File[] filtroPdfConLamda(File rootDir) {

        FilenameFilter pdfFilter = (f, name) -> (name.startsWith("r") && name.endsWith(".pdf"));

        File[] archivos = rootDir.listFiles(pdfFilter);
        return archivos;
    }


    public static void main(String[] args) {

        System.out.println("Carpeta:" + Arrays.toString(leerCarpeta("C:/temp")));
        
        System.out.println();

        System.out.println("Carpeta:" + Arrays.toString(filtrarPorNombreArchivo(new File("c:/temp"))));

        System.out.println();

        System.out.println("Carpeta:" + Arrays.toString(filtroPdfConLamda(new File("c:/temp"))));

        System.out.println();

        System.out.println("Carpeta:" + Arrays.toString(filtrarUltimaHora(new File("c:/temp"))));

        System.out.println();

        System.out.println("Carpeta:" + Arrays.toString(filtraultima(new File("c:/temp"))));

        

    }

}