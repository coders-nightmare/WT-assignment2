public class Assignment {
    public static void main(String[] args) {
        Shape triangle = new Triangle(2, 3);
        triangle.area();
        Shape circle = new Circle(10);
        circle.area();
        Shape rectangle = new Rectangle(4, 5);
        rectangle.area();
    }
}

abstract class Shape {
    public abstract void area();
}

class Triangle extends Shape {
    private int b, h;

    public Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public void area() {
        System.out.println("Triangle Area is : " + 0.5 * b * h);
    }
}

class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Circle Area is : " + Math.PI * r * r);
    }
}

class Rectangle extends Shape {
    private int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Rectangle area is : " + l * b);
    }
}