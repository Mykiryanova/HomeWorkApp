public class HungryCat{
    private String name;
    private int appetite;
    private boolean hungry;

    public HungryCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        // 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
        // Если коту удалось покушать (хватило еды), сытость = true.
        this.hungry = false;
    }

    //public void eatFrom(Plate plate){
    //    plate.decreaseFood(appetite);
    //}


    // 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
    // то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    public void isCatHungry(){
        if(hungry=true) {
            System.out.println("Котик " + name +" хочет кушать!");
                    } else {
            System.out.println("Котик " +name + " сытый");
        }
    }

    public  void isCatWantsToEat(Plate plate){
    if ((hungry) && (appetite <= plate.food)) {
            plate.decreaseFood(appetite);
            hungry = true;
            System.out.println("Котик " +name + " сытый");
               }else {
        hungry = false;
        plate.decreaseFood(appetite);
        System.out.println("Котик " + name +" голодный");
    }
    }
    }









