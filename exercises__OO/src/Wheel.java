public class Wheel {
    int size;
    String model;
    String color;
    String material;

    public Wheel(int size, String model, String color, String material) {
        this.size = size;
        this.model = model;
        this.color = color;
        this.material = material;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
