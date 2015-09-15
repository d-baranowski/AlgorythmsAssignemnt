package com.daniel.assignement2.algorythms.objects;

public class Box {
	private int id;
	private int w;
	private int h;
	private int x;
	private int y;
	
	public Box(int id,  int w,int h){
		this.id = id;
		this.w = w;
		this.h = h;
	}
	
	public int getId() {
		return id;
	}

	
	public int getW(){
		return w;
	}
	
	public int getH(){
		return h;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getDimensions(){
		return h * w; 
	}
}
