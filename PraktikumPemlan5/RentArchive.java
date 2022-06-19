package PraktikumPemlan5;

import java.util.ArrayList;

public class RentArchive {
    private static ArrayList <CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){
        if (car.isStatus()){
            System.out.println("  MOBIL BERHASIL DISEWA");
            rentData.add(new CarRent(rider, car, rentDur));
            car.setStatus(false);
        } else{
            System.out.println("  MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info(){

        System.out.println("=====================================");
        System.out.println("         INFORMASI PELANGGAN");
        System.out.println("=====================================");

        for (CarRent data : RentArchive.rentData) {
            System.out.println("  NAMA PEMINJAM   : " + data.getRider().getName());
            System.out.println("  TIPE MOBIL      : " + data.getCar().getCarType());
            System.out.println("  NO. POLISI      : " + data.getCar().getPolNum());
            System.out.println("  LAMA RENTAL     : " + data.getRentDur());
            System.out.println("-------------------------------------");
        }
    }
}