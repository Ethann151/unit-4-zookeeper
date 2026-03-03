import java.util.Random;

public class Animal {

    // creat a private instance variable to store the animal type (e.g. "Tiger" or "Bear" or any other type of animal)
   private String animalType;
    // create Static/class variable to track how many Animal objects have been created
   public static int getCount() {
   return 1;
   }
    // No-argument constructor:
    // - Creates a random animal type using the randomAnimalType() method you should write in this class
   public void randomAnimalType() {
   
   }
    // Write a constructor that takes an animal type parameter
   public Animal(String animalType) {
   Animal a1 = new Animal("Poison Dart Frogs");
   Animal a2 = new Animal("Boa Constrictor");
   Animal a3 =  new Animal("Tropical Fish");
   }
   
    // Create a getter/accessor method that returns the static variable that counts how many
    // animals have been instatiated


    // Create a getter/accessor method for returning the animal type

    // Create a getter/ accessor method for updating the animal type

    // Creat a speak() method that uses the animal type and returns
    // a sound based on the animal type. You can just return a String with the animal noise


    // Create the speakBackward() method that calls speak() and returns the reversed String


    // Create the toString() method which returns friendly description of the animal

    // Create a static method called "randomAnimalType" that returns a random
    // animale type
    // HINT: Decide how many animal types you want to be able to create, pick a random number
    // and then use if/else/if statements to determine what the animal should say

}
