/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenantpaymenttrackingproject;

/**
 *
 * @author batuh
 */
public class Tenant {
    private String name;
    private String propertyName;

    public Tenant(String name, String propertyName) {
        this.name = name;
        this.propertyName = propertyName;
    }

    public String getName() {
        return name;
    }

    public String getPropertyName() {
        return propertyName;
    }

    @Override
    public String toString() {
        return name + " - " + propertyName;
    }
}
