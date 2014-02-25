//Maria Vasilkin
//PD 1
//2014.02.23
//Knight's Tour
//SWEET IT WORKS
public class Knights {
    private int[][] board;
    private int knights = 1;
    private boolean solved = false;
    private int boardSize;
    public Knights (int b) {
	boardSize = b;
	board = new int[boardSize][boardSize];
	for (int i = 0; i < boardSize; i++) {
	    for (int j = 0; j < boardSize; j++) {
		board[i][j] = 0;
	    }
	}
    }
    public boolean blankSpace(int x, int y) {
        if (x >= 0 && 
	    x < boardSize &&
	    y >=0 && 
	    y < boardSize && 
	    board[x][y] == 0) {
	    return true;
	}
	else return false;
    }
    public boolean full(int[][] x) {
	boolean full = true;
	for (int i = 0; i < boardSize; i++) {
	    for (int j = 0; j < boardSize; j++) {
		if (board[i][j] == 0) full = false;
	    }
	}
	return full;
    }
    public void solve(int x, int y) {
	if (full(board)) {
	    solved = true;
	}
	else if (blankSpace(x,y)) {
		board[x][y] = knights;
		knights ++;
	    if (!solved)
		solve(x+1,y+2);
	    if (!solved )
		solve(x+1,y-2);
	    if (!solved)
		solve(x+2,y+1);
	    if (!solved)
		solve(x+2,y-1);
	    if (!solved)
		solve(x-1,y+2);
	    if (!solved)
		solve(x-1,y-2);
	    if (!solved)
		solve(x-2,y+1);
	    if (!solved)
		solve(x-2,y-1);
	}
	else return;
    }   
    public String toString() {
	String s = "";
	for (int i = 0; i < boardSize; i++) {
	    for (int j = 0; j < boardSize; j++) {
		s += board[i][j];
		s += " ";
		if (board[i][j] < 100) 
		    s += " ";
		if (board[i][j] < 10)
		    s += " ";
	    }
	    s += "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	Knights k = new Knights(5);
	System.out.println(k);
	k.solve(0,0);
	System.out.println(k);
    }
}


	    
	    
