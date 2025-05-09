/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenantpaymenttrackingproject;

/**
 *
 * @author batuh
 */
import java.util.ArrayList;
import java.util.List;
public class Property {
 private String name;

    public Property(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<Property> getSampleProperties() {
        List<Property> list = new ArrayList<>();
        list.add(new Property("Apartment A"));
        list.add(new Property("House B"));
        list.add(new Property("Studio C"));
        list.add(new Property("Office D"));
        return list;
    }
}
