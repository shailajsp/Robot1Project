public class Robot {
    private String name;
    private int batteryLevel;
    private String color; // New field
    private int weight;   // New field

    // Updated constructor to initialize name, color, and weight
    public Robot(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.batteryLevel = 100; // Initial battery level
    }

    public void move(int steps) {
        if (batteryLevel >= steps) {
            System.out.println(name + " moved " + steps + " steps.");
            batteryLevel -= steps;
        } else {
            System.out.println(name + " has insufficient battery to move " + steps + " steps.");
        }
    }

    public void recharge() {
        batteryLevel = 100;
        System.out.println(name + " is fully recharged.");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    // New method to display robot information
    public void displayInfo() {
        System.out.println("Robot Info:");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
    }
}
