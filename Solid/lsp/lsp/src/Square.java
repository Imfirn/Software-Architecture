public class Square implements Shape {

    private int width;
    private int height;

    Square() {
       
    }

    Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSide(int side) {
        this.setHeight(side);
        this.setWidth(side); 
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

 @Override
    public int getArea() {
        return height * width;
    }
}


