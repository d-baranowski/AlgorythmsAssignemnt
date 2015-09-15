package com.daniel.assignement2.algorythms;

import java.util.ArrayList;

import com.daniel.assignement2.algorythms.objects.Box;
import com.daniel.assignement2.algorythms.objects.Pile;
import com.daniel.assignement2.algorythms.objects.Truck;


public class NextFit {
	public ArrayList<Truck> trucks;
	
	public long run(Box[] inputs) {
		long startTime = System.currentTimeMillis();
		trucks = new ArrayList<Truck>();
		Truck currentTruck = new Truck(inputs[0]);
		Pile currentPile;
		trucks.add(currentTruck);
		
		int p = 0;
		
		for (int i = 1; i < inputs.length; i++) {
			currentPile = currentTruck.storage.get(p);
			//If box can be placed on top of the current pile 
			if (currentPile.max.getW() >= inputs[i].getW()
				&& currentPile.max.getH() >= inputs[i].getH()) {
				currentPile.put(inputs[i]);
				//Otherwise check if you can create another pile wide enough to accommodate the box
			} else if (currentTruck.remWidth >= inputs[i].getW()) {
				currentTruck.startPile(inputs[i]);
				p++;
				currentPile = currentTruck.storage.get(p);
				//Otherwise create anotehr truck
			} else {
				currentTruck = new Truck(inputs[i]);
				trucks.add(currentTruck);
				p = 0;
				currentPile = currentTruck.storage.get(p);
			}
		}
		long estimatedTime = System.currentTimeMillis() - startTime;
		return estimatedTime;
	}
	
	public int getTruckNumber(){
		return trucks.size();
	}
	
	public void printOutputs(){
		for (Truck t: trucks){
			System.out.println("\n");
			t.printContents();
		}
	}
}
