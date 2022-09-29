package by.itacademy.exercise2.circle;


import by.itacademy.exercise2.abstractShape.AbstractShape;
import by.itacademy.exercise2.abstractShape.Shape;
import by.itacademy.exercise2.exception.CircleException;

public class Circle extends AbstractShape implements Shape {
    private final double radius;

    public Circle(final double radius) throws CircleException {
        if (radius > 0) {
            this.radius = radius;
        } else
            throw new CircleException("Value cannot be negative");
    }

    @Override
    public final double getArea() {
        return Math.PI * (Math.pow(radius, 2.0));
    }

    @Override
    public final double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}


