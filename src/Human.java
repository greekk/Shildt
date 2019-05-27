import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private String middle_name;
    private String date_of_birth;

    public Human(){
        System.out.println("I'm a Human");
    }

    public Human(String name, String surname, String middle_name, String date_of_birth) {
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.date_of_birth = date_of_birth;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() {return surname; }

    public void setSurname(String surname) { this.surname = surname;}

    public String getMiddle_name() { return middle_name;}

    public void setMiddle_name(String middle_name) { this.middle_name = middle_name;}

    public String getDate_of_birth() { return date_of_birth; }

    public void setDate_of_birth(String date_of_birth) { this.date_of_birth = date_of_birth;}

    public Human withName(String name){
        this.name = name;
        return this;
    }

    public Human withSurname(String surname){
        this.surname = surname;
        return this;
    }

    public Human withMiddlename(String middle){
        this.middle_name = middle;
        return this;
    }

    public Human withDateOfBirth(String date_of_birth){
        this.date_of_birth = date_of_birth;
        return this;
    }


    @Override
    public String toString() {
        return "Class: Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                '}';
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())return false;
        Human human = (Human)o;
        return name.equals(human.name) && surname.equals(surname);
    }
}
