package person2;

public class PhoneBook {
    Person2[] PB;
    int length;
    
    public PhoneBook(){
        length=0;
        PB = new Person2[100];
    }
    public void addPerson(Person2 P)
    {
        PB[length]= P;
        length++;
    }
    public void printEntries()
}
