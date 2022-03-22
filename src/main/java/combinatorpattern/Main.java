package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "0759746394",
                LocalDate.of(2001,10,01)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
