package problem2;

public class DeviceDemo {

    public static void main(String[] args) {

        AppleDevice aD1 = new AppleDevice("IPhone 8", 599, 448456921);
        AppleDevice aD2 = new AppleDevice("Smart Watch", 379, 115896823);

        IPhone iP1 = new IPhone("IPhone 12 Pro Max", 1499, 985254763, "12 Pro Max");
        IPhone iP2 = new IPhone("IPhone 11 Pro", 999, 768584124, "11");

        System.out.println(aD1.toString());
        System.out.println(aD2);
        System.out.println(iP1.toString());
        System.out.println(iP2);
    }
}
