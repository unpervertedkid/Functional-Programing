package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Streams.Gender.*;

public class _Streams {
    public static void main(String[] args) {
        //Person List
        List<Person> people = List.of(
           new Person("John", MALE),
           new Person("Mary", FEMALE),
           new Person("Peter", MALE),
           new Person("Aisha", FEMALE),
           new Person("Simeon", MALE),
           new Person("Austin", BI)

        );
        //Find Genders in List
        System.out.println("Genders in list :");
        people.stream()
                .map(person ->person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Find length of names in list
        System.out.println("Length of names in list :");
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        //Check if list contains only female
        System.out.print("List contains only Female : ");
        boolean b = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.print(b);

        //Check if list contains any female
        System.out.print("\nList contains any Female : ");
        boolean c = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        System.out.print(c);

        //Check if list contains no female
        System.out.print("\nList contains no Female : ");
        boolean d = people.stream()
                .noneMatch(person -> FEMALE.equals(person.gender));
        System.out.print(d);



    }
    //Person class
    static class Person{
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

    enum Gender{
        MALE,FEMALE,BI
    }

}
