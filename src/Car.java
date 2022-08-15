public class Car extends Vehicle  
{  
// constructor of the class Car  
public Car(String licPlate, String idVehicle)  
{  
slotsNeeded = 1;  
siz = VSize.CarSize;  
this.idVehicle = idVehicle;  
this.ownerName = ownerName;  
}  
  
public boolean canFitInSlot(ParkingSlot spot)  
{  
// checks if the spot is suitable for a car  
return spot.getSize() == VSize.CarSize;  
}  
}  