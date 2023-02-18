import java.util.Objects;

public class Box {
    private int length;
    private int breadth;
    private int height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Object clone() {
        return new Box(length, breadth, height);
    }

    public boolean equals(Object another) {
        if (!(another instanceof Box)) {
            return false;
        }

        Box b = (Box) another;

        return length == b.length && breadth == b.breadth && height == b.height;
    }

    @Override
    public String toString() {
        return "Box [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, breadth, height);
    }
}
