public class Test16_Rectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.getLength());
        System.out.println(rect.getArea());

    }
}

class Rectangle {
    private int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return (width + height) * 2;
    }

    public int getArea() {
        return width * height;
    }
}