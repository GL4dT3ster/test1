public class Main {
    public static void main(String[] args) {
        Xiaomi poco = new Xiaomi(68412342,5,5500,true,
                false, "Snapdragon 778g","POCO X5 Pro 5G");
        Samsung galaxy = new Samsung(8433840,5,5000,true,
                false,"Snapdragon 8gen2","Galaxy S23+");
        iPhone iphone = new iPhone(4213850,3,4900,true,
                false,"Apple A15 Bionic","iPhone 14");
        poco.printInfo();
        System.out.println();
        System.out.println();
        galaxy.printInfo();
        System.out.println();
        System.out.println();
        iphone.printInfo();
    }
}
