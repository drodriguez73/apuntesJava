package forDummies.streams;

import java.util.stream.*;
import java.util.Set;
import java.util.Arrays;
import java.util.function.Supplier;



public class MapExample {


    public static Stream<String> crearStreams() {       
        Stream<String> masletras = Stream.of("a", "b", "c");
        return masletras;
    }


    public static Stream<String> mapearStream(Stream<String> letras) {
        return letras.map(letra -> letra + "-");

    }


    public static void main(String[] args) {

        Stream<String> letras = crearStreams();
        Stream<String> mapeado = mapearStream(letras);

        System.out.println("Carpetas: " + mapeado);

    }
}

