/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;


public class OutsourcedEmployee extends Employee {
    
    private double additionalCharge;

    public OutsourcedEmployee(double additionalCharge, String name, Integer hours, double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    
    

    

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    
    @Override
    
    public double payment(){
    
        
        return super.payment() + additionalCharge * 1.1;
}
    
    

}
