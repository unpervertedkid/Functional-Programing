package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("MAria", FEMALE),
                new Person("Ilhan", FEMALE),
                new Person("Sancho", MALE),
                new Person("Joan", FEMALE)
                );
        //Finding number of female
        //Imperative Approach
        List<Person> females = new ArrayList<>();

        //Count number of females
        for(Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        //Print out females
        for(Person female : females){
            System.out.println(female);
        }


    }
    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,FEMALE
    }
}
