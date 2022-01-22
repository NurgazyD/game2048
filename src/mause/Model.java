package mause;

public class Model {

    private int cellsNumber;
    private int x;
    private int y;
    private int widht;
    private int height;

    public Model(int x, int y, int widht, int height, int cellsNumber) {
        this.x = x;
        this.y = y;
        this.widht = widht;
        this.height = height;
        this.cellsNumber = cellsNumber;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void moveUp(){
        y = (y -1 < 0) ? (cellsNumber - 1) : (y - 1);
    }

    public void moveDown(){
        y = (y + 1 >= cellsNumber) ? 0 : (y + 1);
    }

    public void moveRight(){
        x = (x + 1 >= cellsNumber) ? 0 : (x + 1);
    }

    public void moveLeft(){
        x = (x - 1 < 0) ? (cellsNumber - 1) : (x - 1);
    }
}
