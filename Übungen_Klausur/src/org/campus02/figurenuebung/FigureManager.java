package org.campus02.figurenuebung;

import java.util.ArrayList;

public class FigureManager {
ArrayList<Figure> arrListFigMgr = new ArrayList<>();

public FigureManager(ArrayList<Figure> arrListFigMgr) {
	super();
	this.arrListFigMgr = arrListFigMgr;
}

public void addFigure(Figure f)
{
	arrListFigMgr.add(f);
}

public double getMaxPerimeter()
{
	double MaxPerimeter = 0;
	for (Figure figure : arrListFigMgr) {
		if(MaxPerimeter <= figure.getPerimeter())
		{
			MaxPerimeter = figure.getPerimeter();
		}
	}
return MaxPerimeter;
}
}
