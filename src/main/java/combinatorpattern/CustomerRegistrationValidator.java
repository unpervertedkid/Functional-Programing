package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidation.*;
import static combinatorpattern.CustomerRegistrationValidation.ValidationResult.*;

public interface CustomerRegistrationValidation extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidation isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidation isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("07") && customer.getPhoneNumber().length() == 10 ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidation isAnAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidation

    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT

    }
}
