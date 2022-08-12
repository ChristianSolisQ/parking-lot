
public class Van extends Vehicle  
{  
	// constructor of the class Motorcycle   
	public Van(String licPlate, String companyName)  
	{  
	slotsNeeded = 3;  
	siz = VSize.Van;  
	this.licPlate = licPlate;  
	this.companyName = companyName;  
	}  
	  
	public boolean canFitInSlot(ParkingSlot slot)   
	{  
	// checks if the slot is a compact, motorcycle or a large  
	  
	return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle || slot.getSize() == VSize.Van;  
	}  
	}  