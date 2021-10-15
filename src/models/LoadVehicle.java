/*
 * File: LoadVehicle.java
 * Created Date: 2021-10-15
 * Author: Katona Valentin
 * Original: Sallai Andras
 * Github: https://github.com/djvalee
 * Class: Szoftverfejleszto/Nappali/II
 * -----
 * Last Modified: 2021-10-15
 * Modified By: Katona Valentin
 * -----
 * Copyright (c) 2021 Katona Valentin
 * 
 * GNU GPL v2
 */

package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadVehicle {
    ArrayList<String> vehicles;

    public LoadVehicle() {
        initVehicleList();
    }

    private ArrayList<Vehicle> tryLoad() throws FileNotFoundException {
        FileReader fileReader = new FileReader("data.txt");
        Scanner scanner = new Scanner(fileReader);
        ArrayList<Vehicle> vehicleList = fillList(scanner);
        return vehicleList;
    }

    private void initVehicleList() {
        vehicles = new ArrayList<>();

    }

    public ArrayList<Vehicle> load() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        try {
            vehicleList = tryLoad();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! Nem található a fájl!");
        }
        return vehicleList;
    }

    private ArrayList<Vehicle> fillList(Scanner scanner) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        while (scanner.hasNext()); {
            String line = scanner.nextLine();
            Vehicle vehicle = initVehicle(line);
            vehicleList.add(vehicle);
        }
        scanner.close();
        return vehicleList;
    }

    private Vehicle initVehicle(String line) {
        String[] lineArray = line.split(":");
        Vehicle vehicle = new Vehicle();
        vehicle.ordinal = lineArray[0];
        vehicle.brand = lineArray[1];
        vehicle.year = lineArray[2];
        return vehicle;
    }
}
