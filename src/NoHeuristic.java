//imports
import java.util.*;
import java.io.FileWriter;
/**
 * Knights Tour - No Hueristic. This class represents the Non Hueristic version of a Knight's to
 * @author claireroeder
 *@version Sep 9, 2019
 *Fall 2019
 */
public class NoHeuristic {
	
	/**
	 * This is the main method for the program
	 * @param args
	 * @return
	 */
	public static void main(String[] args) {
		
		/**
		 * Instance variables for the NonHueristic version
		 */
		Random r = new Random();
		Random r2 =  new Random();
		int x = 0;
		int y = 0;
		int numMoves = 0;
		int numTours = 0;
		int[][] board = new int[8][8];
		String start = "";
		String finish = "";
		
	/**
	 * This is a do while loop that sets a random starting point, executes each type of move that a knight can make at random using a nested if statement, and resets after 1000 tours 
	 */
	do {
		int move = r.nextInt(7);
		
		x = r.nextInt(7);
		y = r2.nextInt(7);
		
		start = "[" + x + "," + y + "]";
		
		if(move == 0) {
			x = x+1;
			y = y+2;
			numMoves++;
			board[x][y] = 1;
		}//end if
		else if(move == 1) {
			x = x - 1;
			y = y + 2;
			numMoves++;
			board[x][y] = 1;
		}//end else if
		else if(move ==2 ) {
			x = x + 1;
			y = y - 2;
			board[x][y] = 1;
		}//end else if
		else if(move == 3) {
			x = x - 1;
			y = y - 2;
			numMoves++;
			board[x][y] = 1;
		}//end else if
		else if(move == 4) {
			x = x + 2;
			y = y + 1;
			numMoves++;
			board[x][y] = 1;
		}//end else if
		else if(move == 5) {
			x = x + 2;
			y = y - 1;
			numMoves++;
			board[x][y] = 1;
		}//end else if
		else if(move == 6) {
			x = x - 2;
			y = y + 1;
			numMoves++;
			board[x][y] = 1;
		}//end else if
		else if (move == 7) {
			x = x - 2;
			y = y - 1;
			numMoves++;
			board[x][y] = 1;
		}//end else if
		
		finish = "[" + x + "," + y + "]";
		
		if(x < 0 || x > 8 || y < 0 || y > 8) {
			System.out.println(start + ", " + numMoves + ", " + finish);
			numTours++; 
			numMoves = 0;
		}//end if
		
	}while(numTours <= 1000);
	
	/**
	 * This transfers the outputs from this program into the Results file for No Heuristic
	 */
	public FileWriter(String ResultsNoHeuristic.txt) throws IOException;	 

	}//end main
		
	
}//end class
