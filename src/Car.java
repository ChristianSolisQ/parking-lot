public class Car extends Vehicle  
{  
	// constructor of the class Car  
	public Car(String idVehicle, String ownerName)  
	{  
		slotsNeeded = 1;  
		siz = VSize.CarSize;  
		this.idVehicle = idVehicle;  
		this.ownerName = ownerName;  
	}  

	/*
	 * This method returns a boolean if the spot is suitable for a car 
	 */

	public boolean canFitInSlot(ParkingSlot spot)  
	{  
		return spot.getSize() == VSize.CarSize;  
	}  
}  