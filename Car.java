public class Car {

    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    public static String companyName = "JUST Rentals";
    public static int totalCars;

    public Car() {
    }

    public Car(String plateNumber, String model, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = model;
        this.dailyRate = dailyRate;
        this.rent = false;
        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rent;
    }

    public void setDailyRate(double rate) {
        this.dailyRate = rate;
    }

    public void rent() {
        rent = true;
    }

    public void returnCar() {
        rent = false;
    }

    public void displayInfo() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Model: " + carModel);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Rented: " + rent);
    }

    public static void displayCompanyName() {
        System.out.println("Company: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }
}

