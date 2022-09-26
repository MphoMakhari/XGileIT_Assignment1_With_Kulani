package com.xgileit.animal;

/**
 * @author Mpho Makhari
 * 24/09/2022
 * Java Intern 2022
 */


public class Animal {



    private String typeOfAnimal;

    /**
     * Default constructor
     * I have set Mammal as an initial value since Dog is a given example
     *
     */
    public Animal() {
     this("Mammal");
    }

    /**+
     * Overloaded constructor to change value typeofAnimal
     * @param typeOfAnimal new value
     */
    public Animal(String typeOfAnimal) {
        setTypeOfAnimal(typeOfAnimal);
    }

    /**
     * Change the type of animal object
     * @param typeOfAnimal The new value that will be sent to the overloaded constructor
     */
    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    /**
     * Returns the new value
     * @return The new Type of Animal
     */
    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    @Override
    public String toString() {
        return "Type Of Animal: " + typeOfAnimal ;
    }
}