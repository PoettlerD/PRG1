package org.campus02.Flaechenberechnung;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FigureManager {
private ArrayList<Figure> figureManager;

public FigureManager(ArrayList<Figure> figureManager) {
	super();
	this.figureManager = figureManager;
}

public void add (Figure f)
{
	figureManager.add(f);
}

public double getMaxPerimeter()
{
	double maxPerimeter = 0;
	for (Figure figure : figureManager) {
		if (figure.getPerimeter() >= maxPerimeter)
		{
			maxPerimeter = figure.getPerimeter();
		}
	}
	
	return maxPerimeter;
}

public double getAverageAreaSize()
{
	int counter = 0;
	double size = 0;
	
	for (Figure figure : figureManager) {
		counter++;
		size += figure.getArea();
	}
	
	return size/counter;


}

public HashMap<String, Double> getAreaBySizeCategories()
{
	HashMap<String, Double> AreaBySizeCategories = new HashMap<>();
	AreaBySizeCategories.put("Klein", 0.0);
	AreaBySizeCategories.put("Mittel", 0.0);
	AreaBySizeCategories.put("Groß", 0.0);
	for (Figure figure : figureManager) {
	if (figure.getArea() >= 5000.0)
	{
	AreaBySizeCategories.put("Groß", AreaBySizeCategories.get("Groß")+figure.getArea());
	}
	if (figure.getArea() >=1000 && figure.getArea() < 5000)
	{
	AreaBySizeCategories.put("Mittel", AreaBySizeCategories.get("Mittel")+figure.getArea());
	}
	if (figure.getArea() < 1000)
	{
		AreaBySizeCategories.put("Klein", AreaBySizeCategories.get("Klein")+figure.getArea());
	}
	}
return AreaBySizeCategories;
}
}


