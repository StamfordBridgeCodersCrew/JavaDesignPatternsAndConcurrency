package BuilderDesignPattern;

import java.util.List;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String profession;
    private List<String> hobbies;

    private Person( String name, String gender, int age, String profession, List<String> hobbies ) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    static class PersonBuilder {
        private String name;
        private String gender;
        private int age;
        private String profession;
        private List<String> hobbies;

        // Constructor for compulsory parameters(name, gender)
        public PersonBuilder( String name, String gender ) {
            this.name = name;
            this.gender = gender;
        }

        // Setters for optional parameters(age, profession, hobbies)
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public PersonBuilder setHobbies(List<String> hobbies) {
            this.hobbies = hobbies;
            return this;
        }

        public Person build() {
            return new Person(name, gender, age, profession, hobbies);
        }
    }
}
