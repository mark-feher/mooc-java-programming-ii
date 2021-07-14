public class Organism implements Movable{
    private int xPos;
    private int yPos;

    public Organism(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    @Override
    public String toString () {
        return "x: " + xPos + "; y: " + yPos;
    }

    @Override
    public void move(int dx, int dy) {
        xPos += dx;
        yPos += dy;
    }
}
