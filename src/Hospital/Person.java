package Hospital;

public class Person {
    private final String name;
    private final String surname;
    private short age;
    private final int id;
    
    public Person(String name, String surname, short age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public short getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setAge(short age) {
        this.age = age;
    }
    
    
}
