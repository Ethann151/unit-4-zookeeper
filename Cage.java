public class Cage {

    // Create a private instance variable of type Animal. Don't instantiate the variable, only declare it
   private Animal Animal;
    // No-arg constructor:
    // - Instantiates this cage with a random Animal.
    // Hint: Animal() can choose a random type.
   public Cage() {
   Cage cage = new Cage(Animal());
   }
    // Constructor with Animal parameter:
    // - Places that Animal into the cage.
    // - Use this.animal to avoid shadowing confusion.
   public Cage(Animal animal) {
   Cage cage1 = new Cage(this.animal);
   }
    // Write a Getter/Accessor for returning the Animal instance variable


    // Write a Setter/Mutator for editing the Animal instance variable
   public static void setAnimal(Animal animal) {
   
   }
    // toString():
    // - Friendly cage description including the animal.
   public String toString() {
   return "";
   }
}
