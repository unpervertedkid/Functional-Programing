package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //Imperative Approach Implementation
        System.out.println("Imperative approach");
        System.out.println(isValid("0745367382"));
        System.out.println(isValid("0873563826"));
        //Functional Approach Implementation
        System.out.println("Functional approach - Predicate");
        System.out.println(isValidPredicate.test("0745367382"));
        System.out.println(isValidPredicate.test("0873563826"));

        //Chaining predicate Functions
        System.out.println("Is phone number 0753678675 valid and contains 5: " + isValidPredicate.and(containsNumber53).test("0753678675"));
        System.out.println("Is phone number 0787678676 valid and contains 5: " + isValidPredicate.and(containsNumber53).test("0787678676"));
        System.out.println("Is phone number 0787678676 valid or contains 5: " + isValidPredicate.or(containsNumber53).test("0787678676"));

    }

    //Imperative Approach
    static boolean isValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 10;
    }

    //Functional Approach
    static Predicate<String> isValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber53 = phoneNumber -> phoneNumber.contains("5");

}
