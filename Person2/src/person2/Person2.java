package person2;

public class Person2 {

        int age ;
        double height ;
        String firstName ;
        String lastName ;
        boolean isAStudent ;     

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
        String phoneNumber ; 
        public Person2(String firstName, String lastName, String phoneNumber) {
            firstName = firstName;
            lastName = lastName;
            phoneNumber = phoneNumber;
           }
        
}
