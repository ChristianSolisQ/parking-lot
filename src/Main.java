public class Main   
{  
// main mehtod  
public static void main(String argvs[])   
{  
// creating an object of the class ParkingLot  
ParkingLot pl = new ParkingLot(10);  

System.out.print("When the parking lot is empty: "); 
System.out.println(pl.parkingEmpty() + " slots");
 
  
// car1 has license number 1234 and the company name is Microsoft  
Car car1 = new Car("1234", "Microsoft");  
  
// m1 has license number 4016 and the company name is Microsoft  
Motorcycle m1 = new Motorcycle("4016", "Microsoft");  
  
// car2 has license number 1609 and the company name is Google  
Car car2 = new Car("1609", "Google Car");  
  
// m2 has license number 1389 and the company name is Google  
Motorcycle m2 = new Motorcycle("1389", "Google");  
Motorcycle m3 = new Motorcycle("1390", "Toca"); 
Motorcycle m4 = new Motorcycle("1391", "Toca Colombia"); 
  
// car3 has license number 1809 and the company name is Microsoft  
Car car3 = new Car("1809", "Microsoft");  
Car car4 = new Car("1810", "Fresia"); 
Car car5 = new Car("1811", "Fresia v2"); 

Van van1 = new Van("4040", "Wilmar");
Van van2 = new Van("4041", "Christian");
Van van3 = new Van("4042", "Wilson");
Van van4 = new Van("4043", "Dan");



//  parking the vehicles  
pl.parkVehicle(car1);  //0
//pl.parkVehicle(m1); //1
pl.parkVehicle(van1); //4
//pl.parkVehicle(car2); //5

  
// cambio
  
//pl.parkVehicle(m2);  //6
///pl.parkVehicle(car3); //7
pl.parkVehicle(van2); //10 aqui ya no corre
pl.parkVehicle(van3);//13



  
System.out.print("How many spots are remaining: ");
System.out.println(pl.availableParks());

pl.parkVehicle(van4);//16

pl.parkVehicle(car4);
pl.parkVehicle(m3);
pl.parkVehicle(car5);
pl.parkVehicle(m4);

if(pl.availableParks() < 3 && pl.availableParks() > 1) {
	System.err.println("You can't park vans in the parking lot ");
}else if(pl.availableParks() < 1) {
	System.err.println("You can't park any vehicles in the parking lot ");
}else {
	System.out.println("You can park motorcycles and cars in the parking lot ");
}

System.out.print("How many spots are remaining: ");
System.out.println(pl.availableParks());

//how many spots vans are taking up
System.out.print("How many spots vans are taking up: ");
System.out.println(Lvl.vansQuantity);

}  
}  