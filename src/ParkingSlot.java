public class ParkingSlot   
{   
	private Vehicle vh;  
	private VSize siz;  
	private int lane;  
	private int slotNumber;  
	private Lvl l;  


	public ParkingSlot(Lvl lvl, int r, int num, VSize vs)   
	{  
		l = lvl;  
		lane = r;  
		slotNumber = num;  
		siz = vs;  
	}  


	public boolean isAvailable()   
	{  
		return vh == null;  
	}  
	/*
	 * This method canFitVehicle receives  a vehicle as a param to enter a vehicle in the slot
	 * It checks the spot is big enough and is available  
	 */
	public boolean canFitVehicle(Vehicle vh)   
	{  
		return isAvailable() && vh.canFitInSlot(this);  
	}  

	public boolean park(Vehicle vObj)   
	{  
		if (!canFitVehicle(vObj))  
		{  
			return false;  
		}  

		vh = vObj;  
		vh.parkInSlot(this);  
		return true;  
	}  

	// getter of the lane in park 
	public int getLane()   
	{  
		return lane;  
	}  

	//getter of the slot in park 
	public int getSlotNumber()   
	{  
		return slotNumber;  
	}  

	// Getter size of vehicle
	public VSize getSize()   
	{  
		return siz;  
	}  

	/*
	 * This method returns a boolean
	 * Validate the fields empty of the parking slot
	 */
	public boolean isEmpty() {
		for(int i = 0; i<slotNumber; i++) {
			System.out.println();
		}
		return false;
	}

}
