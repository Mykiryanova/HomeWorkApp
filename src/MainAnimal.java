public class MainAnimal {
    public static void main(String[] args){
        Animal firstCat = new Cat("Барсик", "Рыжий", 4);
        Animal secondCat = new Cat("Васька", "Серый", 2);
        Animal firstDog = new Dog ("Степа", "Черный", 7);
        Animal secondDog = new Dog ("Рекс", "Коричневый", 1);
        Animal thirdDog = new Dog ("Бетховен", "Белый", 3);




        secondCat.run(30);
        firstDog.run(1000);
        thirdDog.run(100);

        firstCat.swim(10);
        firstDog.swim(1);
        secondDog.swim(5);
        thirdDog.swim(20);



    }



}
