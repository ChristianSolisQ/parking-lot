// represents a level in the parking lot  
public class Lvl  
{  
	//private int floor;  
	private ParkingSlot[] slots;    // number of slots in each level, including large, compact and motorcycle size  
	private int availableSlots = 0; // number of free slots  
	public static int vansQuantity = 0;//count of Vans in  the parking

	// in each row at max there can be 10 slots  
	private static final int SLOT_PER_ROW = 10;  


	public Lvl( int numberSlots)  
	{  
		availableSlots = numberSlots;  
		slots = new ParkingSlot[numberSlots];  
		int largeSlots = numberSlots / 4;  
		int bikeSlots = numberSlots / 4;  
		int compactSlots = numberSlots - largeSlots - bikeSlots;  

		for (int j = 0; j < numberSlots; j++)  
		{  
			VSize siz = VSize.Motorcycle;  
			if (j < largeSlots + compactSlots)  
			{  
				siz = VSize.CarSize;  
			}  
			int row = j / SLOT_PER_ROW;  
			slots[j] = new ParkingSlot(this, row, j, siz);  
		}  
	}  


	/*
	 * This method returns an integer with available slots
	 */
	public int availableSlots()  
	{  
		return availableSlots;  
	}  
	/*
	 * parkVehicle(Vehicle vh) this method receive an vehicle by param
	 * This return a boolean if we can park follow the availability of the spots
	 */
	public boolean parkVehicle(Vehicle vh)  
	{  
		//find a place to park this vehicle, return false if failed  
		if (availableSlots() < vh.getSlotsNeeded())  
			return false;  

		int slotNumber = findAvailableSlots(vh);  
		if (slotNumber < 0)  
			return false;  
		System.out.print(", Slot Number " + slotNumber);  
		return parkStartingAtSlot(slotNumber, vh);  
	}  

	/*
	 * This method parkStartingAtSlot receives an integer is for the quantity total of spots and vehicle to insert
	 * Validate the quantity of solt and continues tills vehicles size
	 */
	private boolean parkStartingAtSlot(int num, Vehicle vh)  
	{  

		boolean success = true;  
		for (int j = num; j < num + vh.slotsNeeded; j++)  
		{  
			success &= slots[j].park(vh);  
		}  
		availableSlots = availableSlots - vh.slotsNeeded;  
		if(vh.slotsNeeded == 3) {
			vansQuantity = vansQuantity + 1;
		}
		return success;  
	}  

	/* 
	 * This method return an integer with quantity of slots or -1 if not found any spot.
	 *   If the slot is equal to vehicle size
	 */
	private int findAvailableSlots(Vehicle vh)  
	{  
		int slotsNeeded = vh.getSlotsNeeded();  
		int lastRow = -1;  
		int slotsFound = 0;  

		for (int j = 0; j < slots.length; j++)  
		{  
			ParkingSlot spot = slots[j];  
			if (lastRow != slots[j].getLane())  
			{  
				slotsFound = 0;  
				lastRow = slots[j].getLane();  
			}  
			if (slots[j].canFitVehicle(vh))  
			{  
				slotsFound = slotsFound + 1;  
			}  
			else  
			{  
				slotsFound = 0;  
			}  
			if (slotsFound == slotsNeeded)  
			{ 

				if(vh.siz == VSize.CarSize) { 
					System.out.print("It is a Car parked in ");  
				}
				else  if(vh.siz == VSize.Motorcycle) {
					System.out.print("It is a Motorcycle parked in "); 
				}else {
					System.out.print("It is a Van parked in ");
				}

				System.out.print("Lane Number  " + lastRow);  
				return j - (slotsNeeded - 1);  
			}  
		}  
		return -1;  
	}  



}  