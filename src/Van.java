/*
 * This class is used to get the length of the van
 */
public class Van extends Vehicle  
{  
	// constructor of the class Motorcycle   
	public Van(String idVehicle, String ownerName)  
	{  
	slotsNeeded = 3;  
	siz = VSize.Van;  
	this.idVehicle = idVehicle;  
	this.ownerName = ownerName;  
	}  
	  
	public boolean canFitInSlot(ParkingSlot slot)   
	{  
	// checks if the slot is a compact, motorcycle or a large  
	  
	return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle || slot.getSize() == VSize.Van;  
	}  
	}  