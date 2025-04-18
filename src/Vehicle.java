public class Vehicle{
    //instance variables
    private long vehicleID; //vehicleId - a long (ex: 101121)
    private String makeModel; //makeModel - a string (ex: Ford Explorer)
    private String color;//color - a string (ex: Red)
    private long odometerReading;//odometerReading - an int (ex: 32775)
    private double price;//price - a float (ex: 12250.00) (no Lamborghini's here!)

    //constructor
    Vehicle(long vehicleID,
            String makeModel,
            String color,
            long odometerReading,
            double price){

         this.vehicleID = vehicleID;
         this.makeModel = makeModel;
         this.color = color;
         this.odometerReading = odometerReading;
         this.price = price;
    }

    public String toString(){
        return String.format("%d %s %s %d $%.2f",
                this.vehicleID,
                this.makeModel,
                this.color,
                this.odometerReading,
                this.price);
    }

    //GETTERS
    public long getVehicleID() {
        return this.vehicleID;
    }
    public String getMakeModel(){
        return this.makeModel;
    }
    public String getColor(){
        return this.color;
    };
    public long getOdometerReading(){
        return this.odometerReading;
    }
    public double getPrice(){
        return price;
    }
    //Setters
    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }
    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }
    public void setColor(String color){
        this.color = color;
    };
    public void setOdometerReading(long odometerReading){
         this.odometerReading = odometerReading;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
