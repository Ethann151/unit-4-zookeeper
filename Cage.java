import java.util.ArrayList;

public class Cage {

    // ===== Instance Variables =====
    private ArrayList<Animal> animals;

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: create animals list
     * REQUIRED: add at least 1 random Animal
     */
    public Cage() {
        // TODO: instantiate animals
        // TODO: add at least one new Animal() to the list
        Animal animal = new Animal();
        animals = new ArrayList<Animal>();
        animals.add(animal);
    }

    /**
     * Parameterized constructor:
     * REQUIRED: create animals list
     * REQUIRED: add the provided animal to the list
     */
    public Cage(Animal animal) {
        // TODO: instantiate animals
        // TODO: add provided animal
        animals = new ArrayList<Animal>();
        animals.add(animal);
    }

    // ===== Getters / Setters (careful!) =====
    public int getNumAnimals() {
        // TODO: return the number of animals in the cage
        return animals.size();
    }

    public Animal getAnimalAtIndex(int index) {
        // TODO: return the animal at index (or null if invalid)
        if(animals.size() >= index) {
        return animals.get(index);
        }
        return null;
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: add an animal;
     */
    public void addAnimal(Animal animal) {
    animals.add(animal);
    }

    /**
     * REQUIRED: remove an animal if it exists; return true if removed.
     */
    public void removeAnimal(Animal animal) {
      for(int i = 0; i < animals.size(); i++) {
         if(animal.equals(animals.get(i))) {
         animals.remove(i);
         }
      }
    }

    @Override
    public String toString() {
        // TODO: return a friendly description including all animals
        // Example: "Cage with 3 animals: [Animal{...}, Animal{...}]"
        String result = "";
        for(int i = 0; i < animals.size(); i++) {
        result += animals.get(i);
        }
        return "Cage with "+animals.size()+" animals: "+result;
    }
}