public class Car {
    String color;
    String chassis_model;
    String type;
    double price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setChassis_model(String chassis_model) {
        this.chassis_model = chassis_model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String color, String chassis_model, String type, double price) {
        this.color = color;
        this.chassis_model = chassis_model;
        this.type = type;
        this.price = price;
    }
}
