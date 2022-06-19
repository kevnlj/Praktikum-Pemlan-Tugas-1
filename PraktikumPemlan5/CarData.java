package PraktikumPemlan5;

import java.util.ArrayList;

public class CarData {
    private static ArrayList<Car> carList = new ArrayList<>();

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true));
    }

    public void listOfCar(){

        System.out.println("=====================================");
        System.out.println("            DAFTAR MOBIL");
        System.out.println("=====================================");

        for (Car data : carList) {
            System.out.println("  TIPE MOBIL  : " +data.getCarType());
            System.out.println("  NO. POLISI  : " +data.getPolNum());
            System.out.println("  MERK MOBIL  : " +data.getMerk());
            System.out.println("-------------------------------------");
        }
    }
}
