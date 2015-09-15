package com.daniel.assignement2.tests;
import org.junit.Before;
import org.junit.Test;

import com.daniel.assignement2.algorythms.objects.Box;
import com.daniel.assignement2.algorythms.objects.Pile;
import com.daniel.assignement2.algorythms.objects.Truck;


public class BFTruckPileTest {
	Truck truck = new Truck(new Box(1,6,3));
	
	static Box[] test1 = {
		new Box(1,7,2),
		new Box(2,5,4),
		new Box(3,8,4),
		new Box(4,5,10),
		};
	
	@Before
	public void initialise() {
		truck.storage.get(0).put(new Box(1,5,3));
		truck.startPile(new Box(1,3,4));
		truck.storage.add(new Pile(10,new Box(1,1,10)));
	}
	
	@Test
	public void test(){
	/*	for (int i = 0; i < truck.storage.size(); i++){
			truck.storage.get(i).print();
		}*/
		

		System.out.println(truck.remWidth);
	}

}
