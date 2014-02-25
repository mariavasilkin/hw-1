package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Actor {
    public Jumper() {
	super();
    }
    public void act(){
	if(canMove()) {
	    move();
	    if (canMove())
		move();
	    else {
		move();
		act();
	    }
	}
	else {
	    move();
	    act();
	}
    }
}
