import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCGL {
   
	@Test
	public void initialInput() throws FileNotFoundException {
		String s="..........\n"
				+ "...**.....\n"
				+ "....*.....\n"
				+ "..........\n"
				+ "..........\n"
				+ "...**.....\n"
				+ "..**......\n"
				+ ".....*....\n"
				+ "....*.....\n"
				+ "..........\n";
		 CGLgame m=new CGLgame();
		 Assertions.assertEquals(s,m.printInput());// compares s and m.printInput()
	}
	@Test
	public void newGen() throws FileNotFoundException {
		String s="..........\n"
				+ "...**.....\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "..........\n"
				+ "..***.....\n"
				+ "..**......\n"
				+ "...*......\n"
				+ "..........\n"
				+ "..........\n";
		
		
		 CGLgame g=new CGLgame();
		 Assertions.assertEquals(s,g.printoutput());
	}
	

}
