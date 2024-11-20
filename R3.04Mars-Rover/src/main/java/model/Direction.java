package model;

public enum Direction {
	N(0, 1), 
    S(0, -1),
    E(1, 0),  
    W(-1, 0); 

    private final int dx; // Déplacement en x
    private final int dy; // Déplacement en y


    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}
