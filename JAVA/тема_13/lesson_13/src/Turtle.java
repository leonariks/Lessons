public class Turtle extends Animal{
    private boolean likesWater;

    public Turtle(String name, boolean likesWater) {
        super(name);
        setLikesWater(likesWater);
    }

    public boolean isLikesWater() {
        return likesWater;
    }

    public void setLikesWater(boolean likesWater) {
        this.likesWater = likesWater;
    }

    @Override
    public void print() {
        System.out.println(getName() + " черепаха водная " + isLikesWater());
    }

    @Override
    public String toString() {
        return getName() + " черепаха водная " + isLikesWater();
    }
}
