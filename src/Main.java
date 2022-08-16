public class Main   
{  
	// main mehtod  
	public static void main(String argvs[])   
	{  
		// Creating an object of the class ParkingLot  
		ParkingLot pl = new ParkingLot(23);  

		System.out.print("When the parking lot is empty: "); 
		System.out.println(pl.parkingEmpty() + " slots");

		// Cars
		Car car1 = new Car("1234", "James");  
		Car car2 = new Car("1890", "Robert");   
		Car car3 = new Car("2234", "Richard");  
		Car car4 = new Car("2567", "Mary"); 
		Car car5 = new Car("2890", "Patricia"); 
		//Motorcycles
		Motorcycle m1 = new Motorcycle("1567", "John");  
		Motorcycle m2 = new Motorcycle("2345", "Michael");  
		Motorcycle m3 = new Motorcycle("2678", "William"); 
		Motorcycle m4 = new Motorcycle("2901", "David"); 
		//Vans  
		Van van1 = new Van("2123", "Linda");
		Van van2 = new Van("2456", "Barbara");
		Van van3 = new Van("2789", "Elizabeth");
		Van van4 = new Van("2012", "Jennifer");
		Van van5 = new Van("3123", "Maria");





		pl.parkVehicle(car1);  //0
		pl.parkVehicle(m1); //1
		pl.parkVehicle(van1); //4
		pl.parkVehicle(car2); //5


		// cambio

		pl.parkVehicle(m2);  //6
		pl.parkVehicle(car3); //7
		pl.parkVehicle(van2); //10
		pl.parkVehicle(van3);//13




		System.out.print("How many spots are remaining: ");
		System.out.println(pl.availableParks());


		pl.parkVehicle(car4);
		pl.parkVehicle(m3);
		pl.parkVehicle(car5);
		pl.parkVehicle(m4);
		pl.parkVehicle(van4);
		

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
		
		pl.parkVehicle(van5);

	}  
}  