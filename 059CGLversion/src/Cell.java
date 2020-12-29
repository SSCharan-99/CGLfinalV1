
public class Cell {
	int row;
	int col;
	boolean live;

	public Cell(int row, int col) {//constructor
		super();
		this.row = row;//initialization
		this.col = col;
		this.live = false;
	}

	public int getRow() {//getters and setters
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	@Override
	public String toString() {
		return "Cell [row=" + row + ", col=" + col + ", live=" + live + "]";
	}

}
