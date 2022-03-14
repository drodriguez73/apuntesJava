package forDummies.streams;

import java.util.stream.*;
import java.util.Set;
import java.util.Arrays;
import java.util.function.Supplier;


public class StreamIntroduccion {

    public static Stream<String> crearStreams() {
        Stream<String> masletras = Stream.of("a", "b", "c");
        return masletras;
    }

    public static boolean loopStream(Stream<String> letras) {
        // Utilizando Lambda Expression
        return letras.anyMatch(letra -> letra.contains("b"));
    }


    public static void main(String[] args) {

        Stream<String> letras = crearStreams();

        /*
        * Para utilizar mas de una vez al strem letras tenemos
        * que hacerlo mediante Supplier para quen no nos tire
        * el error:
        *   "Stream has already been operated upon or closed"
        *
        */
        Supplier<Stream<String>> letritas = () -> crearStreams();


        boolean existe = loopStream(letras);
        existe = loopStream(letritas.get());


    }
}

