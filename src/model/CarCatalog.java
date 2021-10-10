/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vigneshguna
 */
public class CarCatalog {
    
    private static CarCatalog obj;
    private boolean isFirstTime = true;
   
    private Date lastUpdated;
    private int totalCars=0;
    private int availableCars=0;
    private int unAvailableCars=0;
    private Set<Car> carsFullList = new HashSet<Car>();
    private Set<Car> carsCityList = new HashSet<Car>();
    private Set<Car> carsFilterList = new HashSet<Car>();
    private Set<Car> carsTableList = new HashSet<Car>();
    //private Set<Car> carsPrevFilterList = new HashSet<Car>();
    
    //singleton class - coz only values of lastupdated, carsfulllist need to be holding record from starting
    //no need of singleton class (private cons) - coz we are gonna call this cons only during mainjframe initialisation
    public CarCatalog(){
        
    }
    public static CarCatalog getObj(){
        if (obj==null) {
            obj = new CarCatalog();
        }
        return obj;
    }
    
    public void doIfFirstTime(){
        if(isFirstTime){
            carsFilterList = new HashSet<Car>(carsCityList);
        }
    }
    public void cancelFilter(){
        isFirstTime = true;
    }
    

    public Set<Car> addFilterCity(String city){
        carsCityList = new HashSet<Car>();
        carsFilterList = new HashSet<Car>();
        carsTableList = new HashSet<Car>();
        
        for (Car car : carsFullList) {
            if(car.getCity().equals(city)){
                carsCityList.add(car);
            }
        }
        isFirstTime = true;
        doIfFirstTime();
        isFirstTime = false;
        
        //counts
        totalCars = carsCityList.size();
        assignAvailCars();
        return carsCityList;
    }
    public void assignAvailCars(){
        int sumAvailable=0;
        for (Car car : carsTableList) {
            if(car.isIsAvailabile()){
                sumAvailable+=1;
            }
        }
        availableCars = sumAvailable;
        unAvailableCars = totalCars - availableCars;
    }
    /*public Set<Car> removeFilter(){
        carsFilterList = new HashSet<Car>(carsPrevFilterList);
    }*/
    
    //list of specific manufacturer
    /*public Set<Car> addFilterManuf(String manuf){
        //carsPrevFilterList = new HashSet<Car>(carsFilterList);
        for (Car car : carsFilterList) {
            if(manuf.equals(car.getManufacturer())){
                carsTableList.add(car);
            }
        }
        carsFilterList.add
        assignAvailCars();
        return carsFilterList;
    }
    
    public List<Car> removeFilterManuf(List<String> manuf){
        carsPrevFilterList;
        for (Car car : carsCityList) {
            if(manuf.contains(car.getManufacturer())){
                carsFilterList.remove(car);
            }
        }
        assignAvailCars(carsFilterList);
        return carsFilterList;
    }
    //list of specific manufactured year
    public List<Car> addFilterManufYear(int year){
        SimpleDateFormat ft = new SimpleDateFormat ("y");
        for (Car car : carsCityList) {
            if(year == Integer.valueOf(ft.format(car.getManufYear()))){
                carsFilterList.add(car);
            }
        }
        assignAvailCars(carsFilterList);
        return carsFilterList;
    }
    public List<Car> removeFilterManufYear(int year){
        SimpleDateFormat ft = new SimpleDateFormat ("y");
        for (Car car : carsCityList) {
            if(year == Integer.valueOf(ft.format(car.getManufYear()))){
                carsFilterList.remove(car);
            }
        }
        assignAvailCars(carsFilterList);
        return carsFilterList;
    }*/
    
    
    
    
    
}
