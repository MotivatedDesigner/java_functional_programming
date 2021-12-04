package imperativeDeclarative;

import java.util.ArrayList;
import java.util.List;

import static imperativeDeclarative.Main.Gender.*;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("mina", Female ),
                new Person("amal", Female),
                new Person("oma", Male),
                new Person("kamal", Male)
                );

        // Imperative
        List<Person> females = new ArrayList<>();

        for (Person person : people)
            if(Female.equals(person.gender)) females.add(person);
        for (Person person : females) System.out.println(person);
    }

    record Person(String name, Gender gender) { }

    enum Gender {
        Male,
        Female
    }
}
