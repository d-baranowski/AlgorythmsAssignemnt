package com.daniel.assignement2.algorythms.main;

import com.daniel.assignement2.algorythms.BestFit;
import com.daniel.assignement2.algorythms.NextFit;
import com.daniel.assignement2.algorythms.objects.Box;
import com.daniel.assignement2.algorythms.objects.Truck;
import com.daniel.assignement2.algorythms.objects.factories.BoxFactory;

public class Assignement2 {
	
	
	private final static int H = 10;
	private final static int W = 2 * H;
	static NextFit nf = new NextFit();
	static BestFit bf = new BestFit();
	static BoxFactory factory = new BoxFactory(1,1,5,5);
	final static int N = 100000;
	static Box[] boxes = new Box[N];
	
	public static void main(String[] args) {

		for (int i = 0; i < N; i++){
			boxes[i] = factory.getRandomBox();
		}
				
		System.out.println("Nf Time: " + nf.run(boxes));
		System.out.println("NF Trucks " + nf.getTruckNumber());
		System.out.println("BF Time: " + bf.run(boxes));
		System.out.println("BF Trucks " + bf.getTruckNumber());
		
		
	}
	
	public static void printInput(Box[] boxes){
		for (int i = 0; i < boxes.length; i++){
			System.out.print(boxes[i].getId() + " (W:" + boxes[i].getW() + ",H:" + boxes[i].getH() + "), ");
		}
	}
}
