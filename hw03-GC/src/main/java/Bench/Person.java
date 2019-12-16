package Bench;

public class Person {
    String name;
    String seName;
    int age;

    public Person(String name, String seName, int age, String sex, Cat cat) {
        this.name = name;
        this.seName = seName;
        this.age = age;
        this.sex = sex;
        this.cat = cat;
    }

    String sex;
    Cat cat = new Cat();

}
