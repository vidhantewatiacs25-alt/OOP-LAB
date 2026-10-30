interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    protected String vehicleNumber;
    protected String vehicleType;
    protected int parkingHours;
    protected double totalCharge;

    VehicleParking(String number, String type, int hours) {
        this.vehicleNumber =number;
        vehicleType = type;
        parkingHours = hours;
        totalCharge = 0;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2) {
            totalCharge = parkingHours * 20;
        } else {
            totalCharge = 2 * 20 + (parkingHours - 2) * 10;
        }
    }

    public void displayParkingDetails() {
        System.out.println("\nVehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + totalCharge);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2) {
            totalCharge = parkingHours * 50;
        } else {
            totalCharge = 2 * 50 + (parkingHours - 2) * 30;
        }
    }
    
    @override
    public void displayParkingDetails() {
        System.out.println("\nVehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + totalCharge);
    }
}

public class calculateCharge {
    public static void main(String[] args) {
        TwoWheeler a=new TwoWheeler("rere", 5);
        FourWheeler b=new FourWheeler("faffafa",8);
        a.displayParkingDetails();
        b.displayParkingDetails();
        a.calculateCharge();
        a.displayParkingDetails();

    }
}
