package animal;

public class Dog extends Animal {
    
   private String sound;

   public Dog(String breed, String behavior, int lifespan, double price) {
            super(breed, behavior, lifespan, price);
            //super.setBreed("Bulldog");
        }

    public String getSound() {
        return "Woof";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    /*private String breed;
    private int lifespan;
    private String behavior;
    private double price;

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }*/

}
