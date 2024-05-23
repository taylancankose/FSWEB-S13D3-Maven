package org.example;

public class Wall {

    double width;
    double height;

    // Constructor
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // getWidth metodu
    public double getWidth() {
        return width;
    }

    // getHeight metodu
    public double getHeight() {
        return height;
    }

    // setWidth metodu
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // setHeight metodu
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getArea metodu
    public double getArea() {
        return width * height;
    }

    // Main metodu ile test
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
