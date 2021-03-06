import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;



public class Jumper extends Actor{
    public Jumper(){
	setColor (Color.BLUE);
    }
    public Jumper(Color jumpercolor){
	setColor(jumpercolor);
    }

    public void act(){
	if (canJump()){
	    jump();
	}
	else{
	    turn();
	}
    }
    
    public boolean canJump(){
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	Location next= loc.getAdjacentLocation(getDirection());
	Location next2 = next.getAdjacentLocation(getDirection());
	if (!gr.isValid(next) || !gr.isValid(next2)){
	    return false;
	}
	Actor neighbor = gr.get(next);
	Actor neighbor2 = gr.get(next2);
	return ((neighbor== null) || (neighbor instanceof Flower) || (neighbor instanceof Rock)) && (neighbor2== null);
    }
    
    public void jump(){
	Grid <Actor> gr = getGrid();
	if (gr == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation (getDirection());
	Location next2 = next.getAdjacentLocation(getDirection());
	if(gr.isValid(next) && gr.isValid(next2)){
	    moveTo(next2);
	}else{
	    // removeSelfFromGrid();
	}
    }

    public void turn(){
	setDirection(getDirection() + Location.HALF_RIGHT);

    }
}