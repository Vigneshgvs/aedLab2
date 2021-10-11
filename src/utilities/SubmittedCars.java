/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Car;

/**
 *
 * @author vigneshguna
 */
public class SubmittedCars {
    
    public static ArrayList<Car> loadCarsFullList() {
        ArrayList<Car> result = new ArrayList<Car>();
        
        Car c1 = new Car();
        c1.setCarSerialNumber(101);
        c1.setCurrentCity("Boston");
        c1.setIsAvailabile(true);
        c1.setManufacturer("Toyota");
        c1.setManufYear(2005);
        c1.setNumOfSeats(4);
        c1.setModelNum("T201");
        c1.setIsExpiredMaintCerti(false);
        c1.setCreationTime(new Date());
        c1.setUpdationTime(null);
        
        Car c2 = new Car();
        c2.setCarSerialNumber(102);
        c2.setCurrentCity("Cambridge");
        c2.setIsAvailabile(true);
        c2.setManufacturer("Renault");
        c2.setManufYear(2005);
        c2.setNumOfSeats(4);
        c2.setModelNum("R001");
        c2.setIsExpiredMaintCerti(true);
        c2.setCreationTime(new Date());
        c2.setUpdationTime(null);
        
        Car c3 = new Car();
        c3.setCarSerialNumber(103);
        c3.setCurrentCity("Boston");
        c3.setIsAvailabile(true);
        c3.setManufacturer("Toyota");
        c3.setManufYear(2021);
        c3.setNumOfSeats(6);
        c3.setModelNum("T202");
        c3.setIsExpiredMaintCerti(false);
        c3.setCreationTime(new Date());
        c3.setUpdationTime(null);
       
        Car c4 = new Car();
        c4.setCarSerialNumber(104);
        c4.setCurrentCity("Boston");
        c4.setIsAvailabile(true);
        c4.setManufacturer("Tesla");
        c4.setManufYear(2005);
        c4.setNumOfSeats(5);
        c4.setModelNum("T202");
        c4.setIsExpiredMaintCerti(true);
        c4.setCreationTime(new Date());
        c4.setUpdationTime(null);
        
        Car c5 = new Car();
        c5.setCarSerialNumber(105);
        c5.setCurrentCity("Boston");
        c5.setIsAvailabile(false);
        c5.setManufacturer("Toyota");
        c5.setManufYear(2005);
        c5.setNumOfSeats(6);
        c5.setModelNum("T201");
        c5.setIsExpiredMaintCerti(false);
        c5.setCreationTime(new Date());
        c5.setUpdationTime(null);
        
        Car c6 = new Car();
        c6.setCarSerialNumber(106);
        c6.setCurrentCity("Ottawa");
        c6.setIsAvailabile(true);
        c6.setManufacturer("Tesla");
        c6.setManufYear(2005);
        c6.setNumOfSeats(4);
        c6.setModelNum("E201");
        c6.setIsExpiredMaintCerti(false);
        c6.setCreationTime(new Date());
        c6.setUpdationTime(null);
        
        result.add(c1);
        result.add(c2);
        result.add(c3);
        result.add(c4);
        result.add(c5);
        result.add(c6);
        
        return result;
    }
    
}
