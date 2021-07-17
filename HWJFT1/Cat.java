package HWJFT1;

public class Cat {
    private String name;
    private float canRun;
    private float canJump;

    public Cat(String name, float canRun, float canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public void jump() {
        System.out.println("Шерстяной подпрыгнул");
    }

    public void run() {
        System.out.println("Шерстяной побежал");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", canRun=" + canRun +
                ", canJump=" + canJump +
                '}';
    }
}
