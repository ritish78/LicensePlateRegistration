public class Main {

    public static void main(String[] args) {
        VehicleRegistry vr = new VehicleRegistry();
        vr.add(new LicensePlate("FI","AAA-111"), "Arto");
        vr.add(new LicensePlate("FI", "BBB-222"), "Pekka");
        vr.add(new LicensePlate("BI", "CCC-333"), "Miner");
        vr.add(new LicensePlate("BE", "DDD-444"), "Miner");
        vr.printLicensePlates();
       
    }
}
