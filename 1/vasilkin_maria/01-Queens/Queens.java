//Maria Vasilkin
//PD1
//2013.02.23
class Queens {
    private int queens = 0;
    private int boardSize;
    private int[][] board;
    private boolean solved = false;
    public static Queens (int size) {
	boardSize = size;
	board = new int[boardSize][boardSize];
	for (int i = 0; i < boardSize; i++) {
	    for (int j = 0; j < boardSize; j++) {
		board[i][j] = 0;
	    }
	}
    }
    public static boolean freeSpace(int x, int y) {
	boolean space = true;
	for (int j = 0; j < boardSize; j++) {
	    if (board[x][j] == 1) 
		space = false;
	}   	
	for (int i = 0; i < boardSize; i++) {
	    if (board[i][y] == 1)  
		space = false;
	}
	//check diagonals
	if (queens >=  boardSize)
	    space = false;
	return space;
    }

    public void solve(int x, int y) {
	if (queens >= boardSize)
	    solved = true;
	    
	else if (freespace(x,y)) {
	    board[x][y] = 1;
	    queens ++;
	    if (!solved) 
		solve(x+1,0);
	    if (!solved)
		solve(
		      //the other queens could all be really far away, so you can't just look in the surounding spots

	}
    }
	    
    public String toString() {
	String s = "";
	for (int i = 0; i < boardSize; i++) {
	    for (int j = 0; j < boardSize; j++) {
		s += board[i][j];
		s += " ";
	    }
	    s += "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	Quenns q = new Queens(8);
	System.out.println(q);
	q.solve(0,0);
	System.out.println(q);
    }
}
  
    
	
    
