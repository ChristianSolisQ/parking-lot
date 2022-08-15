/* 
 * This is the creation of father class for inherit in car, van and motorcycle  
 */ 
import java.util.ArrayList;  
public abstract class Vehicle  
{  
// list of adding the slots that has been filled  by vehicles
protected ArrayList<ParkingSlot> parkingSlots = new ArrayList<ParkingSlot>();  
  
// id of vehicles of the vehicle  
protected String idVehicle;  
  
// field for the slot required by a vehicle  
protected int slotsNeeded;  
  
// size of the vehicle which is determined by the type of the vehicle  
protected VSize siz;  
  
// The owner of the vehicle
protected String ownerName;  
  
// to get the slot required by a vehicle  
public int getSlotsNeeded()  
{  
return slotsNeeded;  
}  
  
// the method adds the filled slot to the parkingSlots list  
public void parkInSlot(ParkingSlot s)  
{  
parkingSlots.add(s);  
}  
  
// get the size of vehicle  
public VSize getSize()  
{  
return siz;  
}  
 
  
// an abstract method that has to be defined by the child classess  
public abstract boolean canFitInSlot(ParkingSlot spot);  
}  