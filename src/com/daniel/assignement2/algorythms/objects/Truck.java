package com.daniel.assignement2.algorythms.objects;

import java.util.ArrayList;


public class Truck {
	private final int H = 10;
	private final int W = 2 * H;
	 public int remWidth = W;
	public ArrayList<Pile> storage = new ArrayList<Pile>();
	
	public Truck(Box first){
		remWidth -= first.getW();
		storage.add(new Pile(H,first));
	}
	
	public void startPile(Box box){
		remWidth -= box.getW();
		storage.add(new Pile(H,box));
	}

	
	public void printContents(){
		System.out.print("\n================================================================\n");
		System.out.println("Truck: " );
		System.out.print("================================================================\n");
		
		for (Pile p: storage){
			System.out.print("\nPile " + ": ");
			for (Box b: p.boxes){
					System.out.print("Box " + b.getId()  + ", ");

			}
		}
	}
}
