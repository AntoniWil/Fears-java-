public class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final int age;
    private final String fear;

    

    public Person(String firstName, String middleName, String lastName, int age, String fear) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.fear = fear;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getFear() {
        return fear;
    }

    @Override
    public String toString() {
       // return String.format("[firstName=%s] [middleName=%s] [lastName=%s] ([age=%i])", this.firstName, this.middleName, this.lastName, this.age);
        return this.firstName + " " + this.middleName + " " + this.lastName + " " + this.age;
    }
}