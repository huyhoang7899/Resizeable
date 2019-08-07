public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", true, 6);
        shapes[1] = new Rectangle("red", true, 15, 10);
        shapes[2] = new Square("yellow", false, 15);
        System.out.println("Trước khi thay đổi kích thước : ");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }


        System.out.println("Sau khi thay đổi kích thước : ");
        for (Shape shape : shapes) {
            double percent = Math.floor(Math.random() * 100);
            shape.resize(percent);
            System.out.println(shape.toString());
        }
    }
}
