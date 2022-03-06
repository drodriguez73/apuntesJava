package forDummies.streams;

import java.util.stream.*;
import java.util.Set;
import java.util.Arrays;
import java.util.function.Supplier;

import java.io.File;

public class ListarCarpetas {

    public static Set<String> listFilesUsingJavaIO(String dir) {
        return Stream.of(new File(dir).listFiles())
            .filter(file -> !file.isDirectory())
            .map(File::getName)
            .collect(Collectors.toSet());
    }

    public static Stream<String> crearStreams() {

        /*
        A stream() default method is added to the Collection interface 
        and allows creating a Stream<T> using any collection 
        */
        Stream<String> letras = Arrays.stream(new String[] {"a", "b", "c"});
        
        Stream<String> masletras = Stream.of("a", "b", "c");
        return masletras;
    }

    public static boolean loopStream(Stream<String> letras) {
        // Utilizando Lambda Expression
        return letras.anyMatch(letra -> letra.contains("b"));
    }

    public static Stream<String> filtrarStream(Stream<String> letras) {
        return letras.filter(letra -> letra.contains("a"));
    }

    public static Stream<String> mapearStream(Stream<String> letras) {
        return letras.map(letra -> letra + "-");

    }


    public static void main(String[] args) {

        /*
        * Para utilizar mas de una vez al strem letras tenemos
        * que hacerlo mediante Supplier para quen no nos tire
        * el error:
        *   "Stream has already been operated upon or closed"
        *
        */
        Supplier<Stream<String>> letras = () -> crearStreams();

        boolean existe = loopStream(letras.get());
        Stream<String> filtrado = filtrarStream(letras.get());
        Stream<String> mapeado = mapearStream(letras.get());


        System.out.println("Carpetas: " + listFilesUsingJavaIO("C:/Users/usuario/OneDrive/docsJava"));

    }
}

