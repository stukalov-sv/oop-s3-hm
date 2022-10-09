package data;
public class Human {
    private String name;
    private String surname;
    private String age;
    private String gender;

    public Human(String name, String surname, String age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;        
    }

    public String getSurname() {
        return surname;        
    }

    public String getAge() {
        return age;        
    }

    public String getGender() {
        return gender;        
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Surname: %s, Age: %s, Gender: %s",
            this.name, 
            this.surname, 
            this.age, 
            this.gender);
    }
}
