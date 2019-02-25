/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busniess;

import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDict;
    
    public CustomerDirectory() {
        customerDict = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDict() {
        return customerDict;
    }
    
    public Customer addCustomer() {
        Customer c = new Customer();
        customerDict.add(c);
        return c;
    }
    
    public void removeCustomer(Customer c) {
        customerDict.remove(c);
    }
    
    public Customer searchCustomer(int id) {
        for(Customer c : customerDict) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
