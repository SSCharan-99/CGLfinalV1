import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CGLgame {
	Board board;

	public CGLgame() throws FileNotFoundException {

		File sb= new File("./input001.txt");//read the file and the store the data in sb
		Scanner sc = new Scanner(sb);//scans the content  in the file
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l[][] = new int[m][2];
		int i = 0;
		while (sc.hasNextInt()) {
			l[i][0] = sc.nextInt();
			l[i++][1] = sc.nextInt();
		}
		System.out.println(n);
		board = new Board(n);
		board.createBoard(n, l);
		sc.close();
	}
	public String printoutput() throws FileNotFoundException {
		return board.newGen();

	}

	public String printInput() throws FileNotFoundException {
		return board.printBoard();

	}
	
	
}