package com.xgileit.animal.mammals.dog;

/**
 * Dog Application
 * @author Mpho Makhari
 * 24/09/2022
 */
public class DogApplication {

    public static void main(String[] args)
    {
        Dog objDog = new Dog();

        System.out.println("***************Initial values*****************"  );
        System.out.println(objDog.toString()); //Display default values

        System.out.println("***************New values*****************"  );
        objDog = new Dog("Mammal","Dog","German Shepard"); //Instatiate the object
        System.out.println(objDog.toString());  //Display new  values
    }

}
