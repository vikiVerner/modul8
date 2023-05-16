import Draw.ShapeDrawing;
import Draw.StarShapeDrawing;
import GeometricShape.Rectangle;
import GeometricShape.Shape;
import NameReader.KeyboardNameReader;
import NameReader.ShapeNameReader;
import ShowShapeName.NameOfShape;

import java.awt.*;


public class Main {
  public static void main(String[] args) {
    ShapeNameReader shapeName = new KeyboardNameReader();
    String input = shapeName.readName();
    ShapeDrawing draw = new  StarShapeDrawing();
    draw.newDraw(input);
    Rectangle rect = new Rectangle();
    NameOfShape.showName(rect);
    }
}


