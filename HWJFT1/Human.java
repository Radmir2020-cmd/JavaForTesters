package HWJFT1;

public class Human {
    public String name;
    public float canRun;
    public float canJump;

    public Human(String name, float canRun, float canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;

    }

    public void jump() {
        System.out.println("Кожаный подпрыгнул");
    }

    public void run() {
        System.out.println("Кожаный побежал");
    }

    public float run(Treadmill treadmill) {
        System.out.println("Я кожаный я бегу");
        System.out.println("Затратил " + treadmill.getLength()/canRun);
        return treadmill.getLength()/canRun;
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", canRun=" + canRun +
                ", canJump=" + canJump +
                '}';
    }
}

