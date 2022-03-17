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
    }
    //Function
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    //Method to increment number by 1
    static int incrementByOne(int number) {
        return number + 1;
    }
}
