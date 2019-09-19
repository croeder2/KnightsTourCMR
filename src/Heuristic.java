//imports
import java.io.FileWriter;
import java.util.Random;

/**
 * 
 * @author claire roeder
 * @version Sep 9, 2019
 * Fall 2019
 */
public class Heuristic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Instance variables for the Hueristic version
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
		int accessibility = 0;
		
		/**
		 * This nested if statement defines the accessibility level as 4 for the corner spaces on the board, otherwise they will be set to 8
		 */
		if(x == 0 && y == 0) {
			accessibility = 4;
		}
		else if(x == 7 && y == 7) {
			accessibility = 4;
		}
		else if(x == 0 && y == 7) {
			accessibility = 4;
		}
		else if(x == 7 && y == 0) {
			accessibility = 4;
		}
		else {
			accessibility = 8;
		}
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
		
	}while(numTours <= 64);
	
	/**
	 * This transfers the output data into the Results file
	 */
	public FileWriter(String ResultsHeuristic.txt) throws IOException;
	
	}//end main

}//end class