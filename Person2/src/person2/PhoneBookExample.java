/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person2;

/**
 *
 * @author Education Unlimited
 */
public class PhoneBookExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person2 P1 = new Person2("Alix", "Feinsod", "5105555555");
       Person2 P2 = new Person2("Aaron", "Wofford", "2014385664");
       Person2 P3 = new Person2("Darrel", "Sanders", "3128059839");
       Person2 P4 = new Person2("Jody", "Barnes", "2345678907");
       Person2 P5 = new Person2("Jesse", "Rauscher", "8318542948");
       PhoneBook PB = new PhoneBook();
       PB.addPerson(P1);
       PB.addPerson(P2);
       PB.addPerson(P3);
       PB.addPerson(P4);
       PB.addPerson(P5);
       PB.printEntries();
    }
    
}
