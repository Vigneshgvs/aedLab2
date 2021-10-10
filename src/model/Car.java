/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author vigneshguna
 */
public class Car {
    
    private int carSerialNumber;
    private String city;
    private boolean isAvailabile;
    private String manufacturer;
    private int manufYear;
    private int numOfSeats;
    private String modelNum;
    private Date creationTime;
    private Date updationTime;
    private String currentCity;
    private boolean isExpiredMaintCerti;

    public int getCarSerialNumber() {
        return carSerialNumber;
    }

    public void setCarSerialNumber(int carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public boolean isIsAvailabile() {
        return isAvailabile;
    }

    public void setIsAvailabile(boolean isAvailabile) {
        this.isAvailabile = isAvailabile;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufYear() {
        return manufYear;
    }

    public void setManufYear(int manufYear) {
        this.manufYear = manufYear;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdationTime() {
        return updationTime;
    }

    public void setUpdationTime(Date updationTime) {
        this.updationTime = updationTime;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public boolean isIsExpiredMaintCerti() {
        return isExpiredMaintCerti;
    }

    public void setIsExpiredMaintCerti(boolean isExpiredMaintCerti) {
        this.isExpiredMaintCerti = isExpiredMaintCerti;
    }
    
    
    
    
}
