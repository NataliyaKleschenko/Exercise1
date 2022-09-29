package by.itacademy.exercise2.triangle;

import by.itacademy.exercise2.abstractShape.AbstractShape;
import by.itacademy.exercise2.abstractShape.Shape;
import by.itacademy.exercise2.exception.TriangleException;

public class Triangle extends AbstractShape implements Shape {
  private final double firstSide;
  private final double secondSide;
  private final double thirdSide;

    public Triangle(final double a, final double b, final double c) throws TriangleException {
        if ((a + b > c && a + c > b && b + c > a) && a > 0 && b > 0 && c > 0) {
            this.firstSide = a;
            this.secondSide = b;
            this.thirdSide = c;
        } else {
            throw new TriangleException("Such a triangle cannot exist");
        }
    }

    @Override
    public final double getArea() {
        double p = (firstSide + secondSide + thirdSide) / 2.0;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public final double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
