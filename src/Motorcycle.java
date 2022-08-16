/*
 * This class is used to get the length of the motorcycle
 */
public class Motorcycle extends Vehicle  
{  

	public Motorcycle(String idVehicle, String ownerName)  
	{  
		slotsNeeded = 1;  
		siz = VSize.Motorcycle;  
		this.idVehicle = idVehicle;  
		this.ownerName = ownerName;  
	}  
	/*
	 * This method returns a boolean if the spot is suitable for a car 
	 */
	public boolean canFitInSlot(ParkingSlot slot)   
	{  
		return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle;  
	}  
}  