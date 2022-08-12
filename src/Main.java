public class Main   
{  
// main mehtod  
public static void main(String argvs[])   
{  
// creating an object of the class ParkingLot  
ParkingLot pl = new ParkingLot(8);  

System.out.print("When the parking lot is empty: "); 
System.out.println(pl.availableParks());
 
  
// car1 has license number 1234 and the company name is Microsoft  
Car car1 = new Car("1234", "Microsoft");  
  
// m1 has license number 4016 and the company name is Microsoft  
Motorcycle m1 = new Motorcycle("4016", "Microsoft");  
  
// car2 has license number 1609 and the company name is Google  
Car car2 = new Car("1609", "Google");  
  
// m2 has license number 1389 and the company name is Google  
Motorcycle m2 = new Motorcycle("1389", "Google");  
  
// car3 has license number 1809 and the company name is Microsoft  
Car car3 = new Car("1809", "Microsoft");  

Van van1 = new Van("4040", "Wilmar");
Van van2 = new Van("4041", "Christian");




//  parking the vehicles  
pl.parkVehicle(car1);  
pl.parkVehicle(m1);
pl.parkVehicle(van1);
pl.parkVehicle(car2);

  
// for displaying the list of vehicles that has company name Microsoft  
//pl.ComapnyParked("Microsoft");  
pl.ComapnyParked("Wilmar"); 
  
// for displaying the list of vehicles that has company name Google  
pl.ComapnyParked("Google");  
  
pl.leave(m1,0); // Note that m1 is from Microsoft  
  
  
// for displaying the list of vehicles that has company name Microsoft  
pl.ComapnyParked("Microsoft");  
  
  
pl.parkVehicle(m2);  
pl.parkVehicle(car3);
pl.parkVehicle(van2);


  
System.out.print("How many spots are remaining: ");
System.out.println(pl.availableParks());

}  
}  