package com.daniel.assignement2.algorythms.objects.factories;
import java.util.Random;

import com.daniel.assignement2.algorythms.objects.Box;

public class BoxFactory {
	int id;
	int max_w, max_h;
	int min_w, min_h;
	
	public BoxFactory(int min_w, int min_h, int max_w, int max_h){
		this.id = 0;
		this.max_h = max_h;
		this.max_w = max_w;
		this.min_w = min_w;
		this.min_h = min_h;
	}
	
	public Box getRandomBox(){
		id++;
		return new Box(id,randInt(min_w,max_w), randInt(min_h,max_h));
	}
	
	/**
	 * Retrieved from: http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
	 * Returns a pseudo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimum value
	 * @param max Maximum value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {
	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}
