package com.daniel.assignement2.algorythms;
import java.util.ArrayList;

import com.daniel.assignement2.algorythms.objects.Box;
import com.daniel.assignement2.algorythms.objects.Pile;
import com.daniel.assignement2.algorythms.objects.Truck;
import com.daniel.assignement2.algorythms.objects.factories.BoxFactory;


public class BestFit {
	ArrayList<Truck> trucks;
	
	public long run(Box[] inputs) {
		long startTime = System.currentTimeMillis();
		trucks = new ArrayList<Truck>();
		
		Pile current = null;
		for (Box b: inputs){
			current = findMinimumInExistingPiles(b);
			if (current != null){
				current.put(b);
			} else {
				Truck truck = findMinimumInRemainingWidths(b);
				if (truck != null) {
					truck.startPile(b);
				} else {
					trucks.add(new Truck(b));
				}
			}
		}
		long estimatedTime = System.currentTimeMillis() - startTime;
		return estimatedTime;
	}
	
	public int getTruckNumber(){
		return trucks.size();
	}
	
	public Pile findMinimumInExistingPiles(Box input){
		int min = Integer.MAX_VALUE;
		Pile least = null;
		
		for (Truck t: trucks){
			for(int i = 0; i < t.storage.size(); i++){
				Pile current = t.storage.get(i);
				if (current.canHold(input)){
					if (current.max.getDimensions() - input.getDimensions() < min){
						min = current.max.getDimensions();
						least = current;
					}
				}
			}
		}
		
		return least;
	}
	
	public Truck findMinimumInRemainingWidths(Box input) {
		int min = Integer.MAX_VALUE;
		Truck least = null;

		for (Truck t : trucks) {
			if (t.remWidth >= input.getW()) {

				if (t.remWidth < min) {
					min = t.remWidth;
					least = t;
				}
			}
		}

		return least;
	}
	
	public void printOutputs(){
		for (Truck t: trucks){
			System.out.println("\n");
			t.printContents();
		}
	}
	
}
