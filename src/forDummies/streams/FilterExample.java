package forDummies.streams;

import java.util.stream.*;
import java.util.Set;
import java.util.Arrays;
import java.util.function.Supplier;

public class FilterExample {

    public static Stream<String> crearStreams() {
        Stream<String> masletras = Stream.of("a", "b", "c");
        return masletras;
    }

    public static Stream<String> filtrarStream(Stream<String> letras) {
        return letras.filter(letra -> letra.contains("a"));
    }


    public static void main(String[] args) {

        Stream<String> letras = crearStreams();

        Stream<String> filtrado = filtrarStream(letras);

        System.out.println("Carpetas: " + filtrado);

    }
}

