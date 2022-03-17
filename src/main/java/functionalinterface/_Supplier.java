package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println("Imperative approach");
        System.out.println(getDatabaseConnectionUrl());
        System.out.println("Functional -Supplier approach");
        System.out.println(getDatabaseConnectionUrlSupplier.get());
    }

    //Getting a database url
    //Imperative Approach
    static String getDatabaseConnectionUrl(){
        return "http://localhost:80";
    }

    //Functional Approach - Supplier
    static Supplier<String> getDatabaseConnectionUrlSupplier = () ->  "http://localhost:80";
}
