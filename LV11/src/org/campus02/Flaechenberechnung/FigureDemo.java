package org.campus02.Flaechenberechnung;

import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

public class FigureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect1 = new Rectangle(50.0, 30.4);
		Rectangle rect2 = new Rectangle(35.0, 20.2);
		Rectangle rect3 = new Rectangle(75.0, 40.7);
		
		Circle circ1 = new Circle(25);
		Circle circ2 = new Circle(45);
		Circle circ3 = new Circle(19);
		Circle circ4 = new Circle(70);
		
		FigureManager figmgr = new FigureManager(new ArrayList<Figure>());
		figmgr.add(rect1);
		figmgr.add(rect2);
		figmgr.add(rect3);
		figmgr.add(circ1);
		figmgr.add(circ2);
		figmgr.add(circ3);
		figmgr.add(circ4);
		
		Figure gg = circ1;
		
		
		/*System.out.println(figmgr.getAverageAreaSize());
		System.out.println(figmgr.getMaxPerimeter());
		System.out.println(figmgr.getAreaBySizeCategories());*/
		System.out.println(gg.getArea());
	}

}
