public class Dog extends Animal {
    public String color;

    public Dog(String name, String color) {
        super(name);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getColor());
    }
}
