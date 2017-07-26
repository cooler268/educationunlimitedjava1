package car1;

public class CarTest {

    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1 = 1999;
        String nickName1 = "Bob";
        String color1 = "teal";
        int years1 = 8;
        double miles = 100000;

        Car1 car1 = new Car1(make1, model1, year1, nickName1, color1, years1, miles);

        System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear());
        System.out.println("Car 1: " + nickName1 + "is " + color1 + " and is " + years1 + " years old and has driven " + miles + " miles");

        car1.turnOn();
        car1.turnOff();
        car1.turnOff();

    }

}
