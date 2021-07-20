package HWJFT1;

public class Robot {
    private String name;
    private float canRun;
    private float canJump;

    public Robot(String name, float canRun, float canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public void jump() {
        System.out.println("Консервная банка подпрыгнула");
    }

    public void run() {
        System.out.println("Консервная банка побежал");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", canRun=" + canRun +
                ", canJump=" + canJump +
                '}';
    }
}
