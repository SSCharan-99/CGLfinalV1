import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javafx.scene.shape.Rectangle;


/**
 * **Conways Game Of Life***** Initially, there is a board with some lifels
 * which may be alive or dead. Task is to generate the next generation of lifels
 * based on the following rules:
 * 
 * Rule 1: Any live lifel with fewer than two live neighbors dies, as if caused
 * by under population. Rule 2:Any live lifel with two or three live neighbors
 * activelives on to the next generation. Rule 3: Any live lifel with more than
 * three live neighbors dies, as if by overpopulation. Ruele 4: Any dead lifel
 * with exactly three live neighbors becomes a live lifel, as if by
 * reproduction.
 * 
 * Step 1 => find the no Of Neighbours that are alive; Step 2 => apply rules of
 * game to get next genration by use the if conditions to check all neighbors
 * exluding it self as given video lecture
 * 
 * *Rules of Life*** Lonely lifel will die ==> aliveNeighbours < 2 ; lifel will
 * die due to overpopulation ==> aliveNeighbours > 3 A new lifel will born ==>
 * if currently dead lifel have aliveNeighbours == 3
 * 
 *
 * @author <S S Charan and 20031J0059>
 * @version Version2.3
 */

public class Board {
	private Cell board[][];
	public int bW;
	public int bH;
	
	
	public Board() {
		
	}

	public Board(int bW, int bH) {
		this.bW = bW;
		this.bH = bH;
		board = new Cell[bW][bH];
		
	}
	public Board(int bW, int bH, String Fname) throws FileNotFoundException {
		this.bW = bW;
		this.bH = bH;
		board = new Cell[bW][bH];
		File sb= new File(Fname);//read the file and the store the data in sb
		Scanner sc = new Scanner(sb);//scans the content  in the file
		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
		int l[][] = new int[5][2];
		int i = 0;
		
		while (sc.hasNextInt()) {
			String s = sc.nextLine();
			String[] st = s.split(" ");
			l[i][0] = Integer.parseInt(st[0]);
			
			l[i++][1] =Integer.parseInt(st[1]);
		}
		System.out.println(Arrays.deepToString(l));
		System.out.println("Test case Board passed");
		createBoard(l);
		sc.close();
	}

	public void createBoard(int l[][]) {
		System.out.println("Test Case create passed");
		
		for (int row = 0; row < bW; row++)
			for (int col = 0; col < bH; col++)
				board[row][col] = new Cell(row, col);
		int x, y;
		for (int m = 0; m < l.length; m++) {
			x = l[m][0];
			y = l[m][1];
			board[x][y].setLive(true);
			System.out.println("Test Case create board passed");
		}
	}

	public Cell[][] getBoard() {
		return board;
	}

	public void setBoard(Cell[][] board) {
		this.board = board;
	}

	public String printBoard() {
		StringBuffer sb = new StringBuffer();
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[r].length; c++) {
				if (board[r][c].isLive())
					sb.append("*");
				else
					sb.append(".");

			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		return (sb.toString());

	}
	
  
	public String newGen() {
		Cell[][] nextGen = board;
		int p = 0;
		while(p!=100) {
		for (int l = 1; l < bW - 1; l++) {
			for (int m = 1; m < bH - 1; m++) {
				int alive = 0;
				for (int i = -1; i <= 1; i++)
					for (int j = -1; j <= 1; j++)
						if (board[l + i][m + j].isLive())
							alive += 1;
				if (board[l][m].isLive())
					alive -= 1;
				if ((board[l][m].isLive()) && (alive < 2))
					nextGen[l][m].setLive(false);
				else if ((board[l][m].isLive()) && (alive > 3))
					nextGen[l][m].setLive(true);
				else if ((!board[l][m].isLive()) && (alive == 3))
					nextGen[l][m].setLive(true);
				else
					nextGen[l][m] = board[l][m];
				p++;

			}
					}
		
		return printBoard();
	}
		return "";
	}
}