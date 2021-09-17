package com.app.vehicles;

public class Vehicles {


	private String registrationNo;
	private String color;
	private double price;
	

	
	/**
	 * @param registrationNo
	 * @param color
	 * @param price
	 */
	public Vehicles(String registrationNo, String color, double price) {
		super();
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
}

/* machine genrated code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((registrationNo == null) ? 0 : registrationNo.hashCode());
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
		Vehicles other = (Vehicles) obj;
	 if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
		if (registrationNo == null) {
			if (other.registrationNo != null)
				return false;
		} else if (!registrationNo.equals(other.registrationNo))
			return false;
		return true;
		
		*/
	
	
//self method	
	public boolean equals(Vehicles anotherVehicles)
	{
		System.out.println("in veicles equals");
		return registrationNo.equals(anotherVehicles.registrationNo);
	}
	
	
	}
