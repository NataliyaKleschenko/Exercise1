package by.itacademy.exercise2.rectangle;


import by.itacademy.exercise2.abstractShape.AbstractShape;
import by.itacademy.exercise2.abstractShape.Shape;
import by.itacademy.exercise2.exception.RectangleException;

public class Rectangle extends AbstractShape implements Shape {
    private final double aSide;
    private final double bSide;

    public Rectangle(final double aSide, final double bSide) throws RectangleException {
        if (aSide > 0 && bSide > 0) {
            this.aSide = aSide;
            this.bSide = bSide;
        } else {
            throw new RectangleException("Value cannot be negative");
        }
    }

    @Override
    public final double getArea() {
        return aSide * bSide;
    }

    @Override
    public final double getPerimeter() {
        return 2.0 * (aSide + bSide);
    }
}
