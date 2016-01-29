package org.campus02.LogisticManager;

public class Car implements Moveable {
	private String Type;
	private String Color;
	private int Weight;
	
	
	public Car(String type, String color, int weight) {
		super();
		Type = type;
		Color = color;
		Weight = weight;
	}

	

	public String getColor() {
		return Color;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Color == null) ? 0 : Color.hashCode());
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result + Weight;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Color == null) {
			if (other.Color != null)
				return false;
		} else if (!Color.equals(other.Color))
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (Weight != other.Weight)
			return false;
		return true;
	}



	@Override
	public void move(String destination) {
		// TODO Auto-generated method stub
		System.out.println(Color+" "+Type+" moved to "+destination);
	}
}
