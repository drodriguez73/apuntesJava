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


    public static void main(String[] args) {

        System.out.println("Carpetas: " + listFilesUsingJavaIO("C:/temp"));

    }
}

