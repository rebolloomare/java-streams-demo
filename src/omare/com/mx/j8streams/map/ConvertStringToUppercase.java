package omare.com.mx.j8streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConvertStringToUppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omar", "Rebollo", "vazquez");
        System.out.println(stringToUppercase(names, String::toUpperCase));
    }

    private static List<String> stringToUppercase(List<String> names, Function<String, String> function) {

        List<String> appliedNames = new ArrayList<>();
        for(String name : names){
            appliedNames.add(function.apply(name));
        }

        return appliedNames;
    }


}
