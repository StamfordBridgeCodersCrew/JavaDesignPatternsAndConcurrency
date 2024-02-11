package BuilderDesignPattern;

import java.util.List;

public class PersonBuilderDemo {
    public static void main( String[] args ) {
        Person person1 = new Person.PersonBuilder("Varsha", "Female")
                .setAge(23)
                .setProfession("Associate Solutions Architect - AWS")
                .setHobbies( List.of("reading", "cooking", "backbitching"))
                .build();

        System.out.println(person1.toString());

        Person person2 = new Person.PersonBuilder("Ben Foakes", "Male")
                .setAge(25)
                .setProfession("Professional cricketer")
                .build();

        System.out.println(person2.toString());

        Person person3 = new Person.PersonBuilder("Harry Kane", "Male")
                .setProfession("Professional footballer")
                .build();
    }
}
