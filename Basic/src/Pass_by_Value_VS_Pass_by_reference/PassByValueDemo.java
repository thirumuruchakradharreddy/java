package Pass_by_Value_VS_Pass_by_reference;

//Example 2: Objects

public class PassByValueDemo {

    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println("Before: " + point); // Output: Before: (2, 3)
        modifyPoint(point);
        System.out.println("After: " + point); // Output: After: (20, 30)
    }

    public static void modifyPoint(Point point) {
        point.setX(point.getX() * 10);
        point.setY(point.getY() * 10);
        System.out.println("Modified: " + point); // Output: Modified: (20, 30)
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
//In this example, when we pass the point object to the modifyPoint() method, 
//only a copy of the object's reference value (memory address) is passed.
//The original object is modified in the method, resulting in the change being reflected in the output. However,
//it's crucial to understand that the object's reference itself is passed by value, meaning the object's memory address cannot be changed.
