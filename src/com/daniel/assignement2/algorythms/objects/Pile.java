package com.daniel.assignement2.algorythms.objects;
import java.util.Stack;


public class Pile {
	public Stack<Box> boxes;
	public Box max;
	int H;
	
	public Pile(int H, Box first){
		this.H = H;
		boxes = new Stack<Box>();
		boxes.push(first);
		first.setY(first.getH());
		max = new Box(-1,first.getW(),H - first.getH());
	}
	
	public void put(Box box){
		box.setY(boxes.peek().getY() + box.getH());
		boxes.push(box);
		max = new Box(-1,box.getW(), H - box.getY());
	}
			
	public boolean canHold(Box input){
		return (max.getW() >= input.getW() && max.getH() >= input.getH());
	}
	
	public void print(){
		for (int i = 0; i < boxes.size(); i++){
			System.out.println(boxes.get(i).getW() + "\t " + boxes.get(i).getY());
		}
		System.out.println(" ");
	}
}
