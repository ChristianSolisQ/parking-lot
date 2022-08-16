// important import statements  
import java.util.ArrayList;  
import java.util.*;  
import java.util.HashMap;  


// Creates a Parking Lot with the Number of levels and the slots in each of the given   
// levels.  
public class ParkingLot  
{  
	private Lvl[] lvls;  
	private final int NUM_LVLS = 1;  
	private int numberSlots;  

	// key contains the owner name and   
	// value is the vehicles present in the list  
	Map<String, ArrayList<String>> CompanytoVeh;  


	public ParkingLot(int numberSlots)  
	{  
		this.numberSlots = numberSlots;  
		this.CompanytoVeh = new HashMap<String, ArrayList<String>>();  
		lvls = new Lvl[NUM_LVLS];  

		System.out.println("How many total spots are in the parking lot?");  
		for (int j = 0; j < 1; j++)  
		{  
			lvls[j] = new Lvl(numberSlots);

			System.out.println("Parking long has been created with " + numberSlots + " " +  "slots");
		}
	}  


	// a method for handling the scenario when a vehicle is parked  
	public boolean parkVehicle(Vehicle vh)  
	{  
		System.out.println(" ------------------------------------ ");  

		for (int i = 0; i < lvls.length; i++)  
		{  
			if (lvls[i].parkVehicle(vh))   
			{  
				System.out.println(" Level " + i + " with Vehicle Number " + vh.idVehicle + " from " + vh.ownerName);  
				if (this.CompanytoVeh.containsKey(vh.ownerName))   
				{  
					ArrayList<String> regNoList = this.CompanytoVeh.get(vh.ownerName);  
					this.CompanytoVeh.remove(vh.ownerName);  
					regNoList.add(vh.idVehicle);  
					this.CompanytoVeh.put(vh.ownerName, regNoList);  
				}   
				else   
				{  
					ArrayList<String> regNoList = new ArrayList<String>();  
					regNoList.add(vh.idVehicle);  
					this.CompanytoVeh.put(vh.ownerName, regNoList);  
				}  
				return true;  
			}  
		}  
		System.out.println("PARKING IS FULL");  
		return false;  
	}  


	// This method return a number of free slots in parkig lot
	public int parkingEmpty() {
		int availableSlots = 0;
		for (int i = 0; i < lvls.length; i++)  
		{  
			availableSlots = lvls[i].availableSlots();  
		}

		return availableSlots;
	}

	//This method return a number of free slots in parking lot
	public int availableParks() {
		int availableSlots = 0;
		for (int i = 0; i < lvls.length; i++)  
		{  
			availableSlots = lvls[i].availableSlots();  
		}

		return availableSlots;
	}

}