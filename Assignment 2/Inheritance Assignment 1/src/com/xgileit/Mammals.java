package com.xgileit;

/**
 * @author Mpho Makhari
 * Date: 24/09/2022
 */
public class Mammals extends  Animal{

    private String typeOfMammal;

    /**
     * Default constructor
     */
    public Mammals() {
        this("Mammal","Dog");
    }

    /**
     * Overloaded constructor for Mammal Class
     * @param typeOfAnimal new value
     * @param typeOfMammal new value
     */
    public Mammals(String typeOfAnimal, String typeOfMammal) {
        super(typeOfAnimal);
        setTypeOfMammal(typeOfMammal);
    }

    /**
     * Access typeOfMammal Object
     * @return the type of mammal
     */
    public String getTypeOfMammal() {
        return typeOfMammal;
    }

    /**
     * Change typeOfMammal object
     * @param typeOfMammal new value
     */
    public void setTypeOfMammal(String typeOfMammal) {
        this.typeOfMammal = typeOfMammal;
    }

    /**
     *This methods will print the class values
     * @return Animal object and Mammals object
     */
    @Override
    public String toString() {
        return super.toString() + "\nType Of Mammal: " + typeOfMammal ;
    }
}
