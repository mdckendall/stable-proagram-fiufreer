//Create the Horse class here.
//Create the Horse class here.

public class Horse{
    public String nameOfHorse;
    public double weightOfHorse;
    public boolean isHorseTame;

    public Horse(String nameOfHorse, double weightOfHorse, boolean isHorseTame) {
        this.nameOfHorse = nameOfHorse;
        this.weightOfHorse = weightOfHorse;
        this.isHorseTame = isHorseTame;
    }

    public String toString(){
        return "Name: " + this.nameOfHorse + " Weight: " + this.weightOfHorse + " Tame: " + this.isHorseTame;
    }
}