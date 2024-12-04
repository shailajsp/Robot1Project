//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot("Robo", "orange", 65);

        // Display robot information
        myRobot.displayInfo();

        // Move and recharge as before
        myRobot.move(20);
        System.out.println("Battery level: " + myRobot.getBatteryLevel());

        myRobot.move(85); // This should show insufficient battery if over limit
        System.out.println("Battery level: " + myRobot.getBatteryLevel());

        myRobot.recharge();
        System.out.println("Battery level after recharge: " + myRobot.getBatteryLevel());
    }
}