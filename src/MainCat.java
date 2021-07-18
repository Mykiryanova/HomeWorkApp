public class MainCat{
    public static void main(String[] args){
        HungryCat firstCat = new HungryCat("Барсик",15);
        HungryCat secondCat = new HungryCat("Мурзик",8);
        Plate plate = new Plate(20);


       // 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
       // потом вывести информацию о сытости котов в консоль.


        HungryCat[] cat = {new HungryCat("Матроскин", 10), new HungryCat("Пушок", 3),
                new HungryCat("Васька", 22), new HungryCat("Гав", 6)};


        plate.showInfo();
       firstCat.isCatHungry();
       firstCat.isCatWantsToEat(plate);
        plate.showInfo();
        secondCat.isCatHungry();
        secondCat.isCatWantsToEat(plate);
        plate.showInfo();

        //Добавим в тарелку еду.
        plate.addFood(32);


        //Посмотрим информацию о котах, записанных в массиве
        System.out.println();
        System.out.println("Информация о котиках в массиве");
        plate.showInfo();
        for (int i = 0; i < cat.length; i++) {
            cat[i].isCatHungry();
            cat[i].isCatWantsToEat(plate);
            plate.showInfo();
        }


    }
}
