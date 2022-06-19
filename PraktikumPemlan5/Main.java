package PraktikumPemlan5;

public class Main {
    public static void main(String[] args) {
        CarRider didik = new CarRider ("Didik Julianto", 42, "081256493402");
        CarRider siti = new CarRider ("Siti Utomah", 39, "081358497238");
        CarRider kevin = new CarRider ("Kevin Leonardo", 17, "081336856970");
        CarRider naruto = new CarRider ("Naruto Uzumaki", 25, "081233495324");

        CarData data = new CarData();
        data.addCar("SUV", "AG 1234 YZ", "Toyota");
        data.addCar("MPV", "AG 5678 HGU", "Suzuki");
        data.addCar("COUPE", "AG 9101 SL", "Nissan");
        data.addCar("CONVERTIBLE", "AG 1213 CY", "Mercedes Benz");

        data.listOfCar();
        System.out.println();

        RentArchive arsip = new RentArchive();
        arsip.Rent(didik, data.getCarList().get(2), 7);
        arsip.Rent(siti, data.getCarList().get(2), 3);
        arsip.Rent(kevin, data.getCarList().get(3), 2);
        arsip.Rent(naruto, data.getCarList().get(3), 1);

        System.out.println();
        arsip.info();
    }
}