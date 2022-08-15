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
  
public boolean canFitInSlot(ParkingSlot slot)   
{  
// checks if the slot is a compact, motorcycle or a large van  
  
return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle;  
}  
}  