/*
 * This class is used to get the length of the van
 */
public class Van extends Vehicle  
{  

	public Van(String idVehicle, String ownerName)  
	{  
		slotsNeeded = 3;  
		siz = VSize.Van;  
		this.idVehicle = idVehicle;  
		this.ownerName = ownerName;  
	}  
	/*
	 * This method returns a boolean if the spot is suitable for a car 
	 */
	public boolean canFitInSlot(ParkingSlot slot)   
	{  
		return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle || slot.getSize() == VSize.Van;  
	}  
}  