package com.xgileit;

/**
 * @author Mpho Makhari
 * XGileIT Intern 2022
 * Sep 2022
 */
public class Dog extends   Mammals{

    //Instance variables
    private String breed;

    /**
     * Default Constructor
     */
    public Dog() {
        this("Mammal", "Dog", "Bull Dog");
    }

    /**
     * Overloaded Constructor
     * @param typeOfAnimal new value
     * @param typeOfMammal new value
     * @param breed new value
     */
    public Dog(String typeOfAnimal, String typeOfMammal, String breed) {
        super(typeOfAnimal, typeOfMammal);
        setBreed(breed);
    }

    /**
     * Change the value of the breed
     * @param breed the new value
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Return the new value
     * @return breed value
     */
    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType of breed: " + breed ;
    }
}
