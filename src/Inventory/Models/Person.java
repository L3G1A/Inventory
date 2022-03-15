package Inventory.Models;

public class Person {
    private String FirstName;
    private String LastName;
    private int Id;

    public Person(int Id, String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int GetId(){
        return Id;
    }
}
