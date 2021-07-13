public class Dog extends Animal {

    Dog(String name, String color, int age){
        super(name, color, age);
    }



@Override
    void run (int distance){
        if (distance < 500){
        System.out.println(name + " пробежал" +" "+  distance + " метров");
    }else {
            System.out.println("Недопустимое расстояние. Введите значение меньше 500 метров.");
        }
    }
    @Override
    void swim (int distance) {
        if (distance < 10) {
            System.out.println(name + " пробежал" + " " + distance + " метров");
        } else {
            System.out.println("Недопустимое расстояние! Введите значение меньше 10 метров.");
        }
    }
}
