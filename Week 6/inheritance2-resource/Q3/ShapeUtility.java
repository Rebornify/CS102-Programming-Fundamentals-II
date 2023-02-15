import java.util.*;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        if (shapeList == null || shapeList.isEmpty()) {
            return null;
        }

        Shape largest = null;

        for (Shape s : shapeList) {
            if (s instanceof Octagon && (largest == null || s.getArea() > largest.getArea())) {
                largest = s;
            }
        }

        return (Octagon) largest;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
        ArrayList<Shape> allNonRectangleShapeList = new ArrayList<>();

        if (shapeList == null || shapeList.isEmpty()) {
            return allNonRectangleShapeList;
        }

        for (Shape s : shapeList) {
            if (s instanceof Square || s instanceof Octagon) {
                allNonRectangleShapeList.add(s);
            }
        }

        return allNonRectangleShapeList;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {
        ArrayList<Square> allSquareWithMinArea = new ArrayList<>();

        if (shapeList == null || shapeList.isEmpty()) {
            return allSquareWithMinArea;
        }

        for (Shape s : shapeList) {
            if (s instanceof Square && s.getArea() >= minArea) {
                allSquareWithMinArea.add((Square) s);
            }
        }

        return allSquareWithMinArea;
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {
        ArrayList<Shape> allRectangleWithMinLength = new ArrayList<>();

        if (shapeList == null || shapeList.isEmpty()) {
            return allRectangleWithMinLength;
        }

        for (Shape s : shapeList) {
            if (s instanceof Rectangle && ((Rectangle) s).getLength() >= length) {
                allRectangleWithMinLength.add(s);
            }
        }

        return allRectangleWithMinLength;
    }
}
