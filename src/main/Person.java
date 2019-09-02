package main;
public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder l = new StringBuilder();
        l.append("Hello my name is " + getName() + ". ");
        if (getGender() == 'M') {
            l.append("i am a man ");
        } else {
            l.append("i am a woman ");
        }
        l.append("and i am " + getAge() + " years old.");
        return l.toString();
    }

}
