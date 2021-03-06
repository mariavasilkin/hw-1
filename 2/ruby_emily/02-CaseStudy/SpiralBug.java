import info.gridworld.actor.Bug;

public class SpiralBug extends Bug{
    private int steps, sidelength;

    public SpiralBug(int length){
	steps=0;
	sidelength=length;
    }
    
    public void act(){
	if (steps < sidelength && canMove()){
	    move();
	    steps++;
	}
	else{
	    turn();
	    turn();
	    steps=0;
	    sidelength = sidelength+1;
	}
    }
}
