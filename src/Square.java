public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }


    public void Square(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setHeight(double height) {
        this.setSide(height);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side *= percent;
    }
}
