package HWJFT1;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Кожаный", 1200,1);
        Cat cat = new Cat("Шерстяной гавнюк", 500, 2);
        Robot robot = new Robot("Консервная банка", 1000,0);

        System.out.println(human);
        System.out.println(cat);
        System.out.println(robot);

        human.jump();
        human.run();

        cat.jump();
        cat.run();

        robot.jump();
        robot.run();

        Treadmill treadmill = new Treadmill(2000);

        

        Wall wall = new Wall(5);

    }
}
