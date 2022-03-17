package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Adding Customers
        Customer faith = new Customer("Faith", "078001284");
        //Imperative
        greetCustomer(faith);

        //Functional
        greetCustomerConsumer.accept(faith);



    }
    //Method to greet Customer
    //Imperative Approach

    public static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    }

    //Functional Approach - Consumer function
    static Consumer<Customer> greetCustomerConsumer = customer ->  System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);


    //Customer Class
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
