package hw5;



public class Animal {
    private String animalTypeName;
    protected  int runDistanceLimit, swimDistanceLimit, jumpHeightLimit;

    public Animal(String animalTypeName, int runDistanceLimit, int swimDistanceLimit,  int jumpHeightLimit) {
        this.animalTypeName = animalTypeName;
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
        this.jumpHeightLimit = jumpHeightLimit;
    }

    public String run(int distance){
        return String.format("%s пробежал %d", this.animalTypeName, Math.min(distance, this.runDistanceLimit));
    };

    public String swim(int distance){
        return String.format("%s проплыл %d", this.animalTypeName, Math.min(distance, this.swimDistanceLimit));
    };

    public String jumpOver(int height){
        if (height>this.jumpHeightLimit){
            return String.format("%s не перепрыгнул", this.animalTypeName);
        } else {
            return String.format("%s перепрыгнул", this.animalTypeName);
        }
    };
}
