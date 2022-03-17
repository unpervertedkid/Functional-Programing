package functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        //Add new Customer
        Customer Diana = new Customer("Diana","0713005186");
        Customer Janet = new Customer("Janet","0747493639");

        //Implement biconsumer function
        greetCustomer.accept(Diana,true);
        greetCustomer.accept(Janet,false);

    }

    //Customer Class
    static class Customer{
        private String name;
        private String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    //Functional Approach - biconsumer
    static BiConsumer<Customer,Boolean> greetCustomer = (customer,showPhoneNumber) ->  System.out.println("Hello " + customer.name + ", thanks for registering phone number " + (showPhoneNumber ? customer.phoneNumber : "*********"));

}
