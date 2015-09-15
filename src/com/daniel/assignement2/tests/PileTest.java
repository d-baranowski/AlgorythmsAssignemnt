package com.daniel.assignement2.tests;

import org.junit.Test;

import com.daniel.assignement2.algorythms.objects.Box;
import com.daniel.assignement2.algorythms.objects.Pile;


public class PileTest {
	Box[] test1 = {
					new Box(1,6,3),
					new Box(2,5,4),
					new Box(3,4,3),
					};
	
	Pile piletest1 = new Pile(10,test1[0]);
	
	Box[] test2 = {
			new Box(1,5,3),
			new Box(2,5,5)
	};
	
	Pile piletest2 = new Pile(10,test2[0]);
	
	
	//Test if the variables are updated correctly
	public void test() {
		System.out.println(test1[0].getY() + "\t " + piletest1.max.getH());
		for (int i = 1; i < test1.length; i++){
			piletest1.put(test1[i]);
			System.out.println(test1[i].getY() + "\t " + piletest1.max.getH());
		}
	}
	
	@Test
	//Test if the getDifference works correctly
	public void test2(){
		for (int i = 1; i < test2.length; i++){
			piletest2.put(test2[i]);
		}
	}

}
