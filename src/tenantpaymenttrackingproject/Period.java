/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenantpaymenttrackingproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author batuh
 */
public class Period {
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Period(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Period{" + "date=" + date + '}';
    }
    
    public static List<Period> getdatePeriods() {
        List<Period> list = new ArrayList<>();
        list.add(new Period("04-2025"));
        list.add(new Period("03-2025"));
        list.add(new Period("02-2025"));
        list.add(new Period("01-2025"));
        list.add(new Period("12-2024"));
        list.add(new Period("11-2024"));
        list.add(new Period("10-2024"));
        list.add(new Period("09-2024"));
        list.add(new Period("08-2024"));
        list.add(new Period("07-2024"));
        list.add(new Period("06-2024"));
        list.add(new Period("05-2024"));
        list.add(new Period("04-2024"));
        list.add(new Period("03-2024"));
        list.add(new Period("02-2024"));
        list.add(new Period("01-2024"));
        
        return list;
    }
    
}
