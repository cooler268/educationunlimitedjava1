package car1;

public class Car1 {

    String make, model, nickname, color;
    int year, yearsOwned;
    boolean isOn;
    double miles;

    public String getNickname() {
        return nickname;
    }

    public String getColor() {
        return color;
    }

    public int getYearsOwned() {
        return yearsOwned;
    }

    public double getMiles() {
        return miles;
    }

    public Car1(String newMake, String newModel, int newYear, String newNickname, String newColor, int newYearsOwned, double newMiles) {
        make = newMake;
        model = newModel;
        year = newYear;
        nickname = newNickname;
        color = newColor;
        yearsOwned = newYearsOwned;
        miles = newMiles;
        isOn = false;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The car is now on!");
    }

    public void turnOff() {
        if (isOn == true) {
            isOn = false;
            System.out.println("The car is now off!");
        } else {
            System.out.println("The car is already off!");
        }

    }
}
