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
    
    //private static CarCatalog obj;
    private boolean isFirstTime = true;
   
    private Date lastUpdated;
    private int totalCars=0;
    private int availableCars=0;
    private int unAvailableCars=0;
    private List<Car> carsFullList = new ArrayList<Car>();
    private List<Car> carsCityList = new ArrayList<Car>();
    private List<Car> carsFilterList = new ArrayList<Car>();
    private List<Car> carsTableList = new ArrayList<Car>();
    //private Set<Car> carsPrevFilterList = new HashSet<Car>();
    
    //singleton class - coz only values of lastupdated, carsfulllist need to be holding record from starting
    //no need of singleton class (private cons) - coz we are gonna call this cons only during mainjframe initialisation
    public CarCatalog(){
        
    }
    /*public static CarCatalog getObj(){
        if (obj==null) {
            obj = new CarCatalog();
        }
        return obj;
    }*/
    
    public Car addNewCar() {
        Car car = new Car();
        carsFullList.add(car);
        return car;
    }
    
    public void doIfFirstTime(){
        if(isFirstTime){
            carsFilterList = new ArrayList<Car>(carsCityList);
        }
    }
    public void cancelFilter(){
        isFirstTime = true;
    }
    

    public List<Car> addFilterCity(String city){
        carsCityList = new ArrayList<Car>();
        carsFilterList = new ArrayList<Car>();
        carsTableList = new ArrayList<Car>();
        
        for (Car car : carsFullList) {
            if(car.getCurrentCity().equals(city)){
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

    public boolean isIsFirstTime() {
        return isFirstTime;
    }

    public void setIsFirstTime(boolean isFirstTime) {
        this.isFirstTime = isFirstTime;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getTotalCars() {
        return totalCars;
    }

    public void setTotalCars(int totalCars) {
        this.totalCars = totalCars;
    }

    public int getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(int availableCars) {
        this.availableCars = availableCars;
    }

    public int getUnAvailableCars() {
        return unAvailableCars;
    }

    public void setUnAvailableCars(int unAvailableCars) {
        this.unAvailableCars = unAvailableCars;
    }

    public List<Car> getCarsFullList() {
        return carsFullList;
    }

    public void setCarsFullList(List<Car> carsFullList) {
        this.carsFullList = carsFullList;
    }

    public List<Car> getCarsCityList() {
        return carsCityList;
    }

    public void setCarsCityList(List<Car> carsCityList) {
        this.carsCityList = carsCityList;
    }

    public List<Car> getCarsFilterList() {
        return carsFilterList;
    }

    public void setCarsFilterList(List<Car> carsFilterList) {
        this.carsFilterList = carsFilterList;
    }

    public List<Car> getCarsTableList() {
        return carsTableList;
    }

    public void setCarsTableList(List<Car> carsTableList) {
        this.carsTableList = carsTableList;
    }
    
    
    
    
    
}
