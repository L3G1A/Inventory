package Inventory;

public class Person {
    private String FirstName;
    private String LastName;
    private int Id;

    public Person(int Id, String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Id = Id;
    }

    public int GetId(){
        return Id;
    }
}
