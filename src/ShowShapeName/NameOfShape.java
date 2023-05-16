package ShowShapeName;

import GeometricShape.Shape;

import java.awt.*;

public class NameOfShape {

    public static void showName(Shape shape) {
        if (shape == null) {
            System.out.println("Shape doesn't exist");
        } else {
            String value = shape.getClass().getSimpleName();
            System.out.println("Shape is " + value);
        }
    }
}
