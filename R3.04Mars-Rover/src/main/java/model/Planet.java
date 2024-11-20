package model;

public class Planet {
	private final int xSize;
	private final int ySize;
	private int[][] planetMap;

	 
	public Planet(int xSize, int ySize) {
		super();
		this.xSize = xSize;
		this.ySize = ySize;
		this.planetMap = new int[xSize][ySize];

		setMapEmpty();
	}
	
	public void setMapEmpty() {
		for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                setPlanetMapElement(x,y,0);
            }
        }
	}
	
	public void setPlanetMapElement(int x,int y, int element) {
		// 0 being no obstacle and 1 being an obstacle
		this.planetMap[x][y] = element;
	}

	public int getxSize() {
		return xSize;
	}

	public int getySize() {
		return ySize;
	}
}
