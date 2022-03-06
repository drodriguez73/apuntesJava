package forDummies.colecciones;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

import java.util.stream.*;

public class SetStruc {

    public static void crearSet() {

        Object[][] a = {
            {"cero", 0}, 
            {"uno", 1}, 
            {"dos", 2}
        };

        for (Object[] o : a) {
            for (Object u : o) {
                System.out.print(u + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println(Arrays.deepToString(a));
        System.out.println();
        System.out.println();

        Set<Object[]> setA = new HashSet<>(); // or LinkedHashSet if you need a similar order than the array
        for(Object[] inner : a) {
            setA.add(inner);
        }
        System.out.println("SetA:" + setA);
        System.out.println();
        System.out.println();


    }



    public static void main(String[] args) {

        crearSet();


    }
}