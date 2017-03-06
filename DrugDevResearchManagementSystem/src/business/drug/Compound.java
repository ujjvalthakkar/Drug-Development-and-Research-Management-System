/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.drug;

/**
 *
 * @author Ujjval
 */
public class Compound {

    private String name;
    private float molecularWeight;
    private double cost;
    private double quantity;
    private double quantitySold=0;
    private double AmountGenerated=0;
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(float molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getAmountGenerated() {
        return AmountGenerated;
    }

    public void setAmountGenerated(double AmountGenerated) {
        this.AmountGenerated = AmountGenerated;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(double quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
}
