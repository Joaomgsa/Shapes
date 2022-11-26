package entities;

public class Circle implements Shape{

    private double readius;

    public Circle() {
    }

    public Circle(double readius) {
        this.readius = readius;
    }

    public double getReadius() {
        return readius;
    }

    public void setReadius(double readius) {
        this.readius = readius;
    }

    @Override
    public double area() {
        return Math.PI * readius * readius;
    }
}
