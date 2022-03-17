package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //Imperative
        int increment = incrementByOne(1);
        System.out.println(increment);
        //Using a function
       int increment2 =  incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyby10Function.apply(increment2);
        System.out.println(multiply);

        //Chain the functions
        Function<Integer, Integer> addByOneAndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyby10Function);

        System.out.println(addByOneAndThenMultiplyBy10.apply(4));

    }

    //Function
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyby10Function = number -> number * 10;

    //Method to increment number by 1
    static int incrementByOne(int number) {
        return number + 1;
    }
}
