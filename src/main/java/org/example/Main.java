public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Отрицательного радиуса нет. Вы ввели: " + radius);
        }
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

public class Rectangle {
    private double heigth, width;

    public Rectangle(double heigth, double width) {
        if (width < 0) {
            throw new RuntimeException("Отрицательной ширины нет. Вы ввели: " + width);
        } else if (heigth < 0) {
            throw new RuntimeException("Отрицательной высоты нет. Вы ввели: " + height);
        }
        this.heigth = heigth;
        this.width = width;
    }

    public double area() {
        return heigth * width;
    }

    public double perimeter() {
        return 2 * (heigth + width);
    }
}

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new RuntimeException("Сторона не может быть отрицательной. Вы ввели: " + a + b + c);
        } else if ((c + b < a) || (c + a < b) || (b + a < c)) {
            throw new RuntimeException("Треугольника с такими сторонами не существует");
        } else {
        this.a = a;
        this.b = b;
        this.c = c;
        }
    }

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4,5,3);
        Rectangle rectangle1 = new Rectangle(6,2);
        Circle circle1 = new Circle(3);

        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());

        System.out.println(rectangle1.perimeter());
        System.out.println(rectangle1.area());

        System.out.println(triangle1.perimeter());
        System.out.println(triangle1.area());
    }
}
