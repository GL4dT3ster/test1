public class Phone {
    long SSID;
    int cameraNumber;
    int batteryCapacity;
    boolean amoledDisplay;
    boolean ipsDisplay;
    String processorName;
    String model;
    public Phone(long SSID, int cameraNumber, int batteryCapacity, boolean amoledDisplay, boolean ipsDisplay, String processorName, String model) {
        this.SSID = SSID;
        this.cameraNumber = cameraNumber;
        this.batteryCapacity = batteryCapacity;
        this.amoledDisplay = amoledDisplay;
        this.ipsDisplay = ipsDisplay;
        this.processorName = processorName;
        this.model = model;
    }
    public void printInfo(){
        System.out.println("SSID: " + SSID);
        System.out.println("Camera Number: " + cameraNumber);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Amoled Display: " + amoledDisplay);
        System.out.println("IPS Display: " + ipsDisplay);
        System.out.println("Processor Name: " + processorName);
        System.out.println("Model: " + model);
    }
}