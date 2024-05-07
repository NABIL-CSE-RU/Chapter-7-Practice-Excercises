public class RangeInputRunner {
    public static void main(String[] args) {
        RangeInput passenger1, passenger2, driver1;
        passenger1 = new RangeInput(40, 50);
        passenger2 = new RangeInput(30, 40);
        driver1 = new RangeInput();
        System.out.println(passenger1.getCurrentTemperature());
        System.out.println(passenger2.getCurrentTemperature());
        System.out.println(driver1.getCurrentTemperature());
    }

}
