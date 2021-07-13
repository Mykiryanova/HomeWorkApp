public class Cat extends Animal{

    Cat(String name, String color, int age){
        super(name, color, age);
    }
    @Override
    void run (int distance){
        if (distance < 200){
            System.out.println(name + " пробежал" +" "+  distance + " метров");
        }else {
            System.out.println("Недопустимое расстояние! Введите значение меньше 200 метров.");
        }
    }
    @Override
    void swim (int distance) {
       {
            System.out.println("Кот не умеет плавать!");
        }
    }

}
