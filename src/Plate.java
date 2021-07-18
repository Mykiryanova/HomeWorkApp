public class Plate{
   int food;

    public Plate(int food){
        this.food = food;
    }



    public void showInfo(){
        System.out.println("В тарелке:" + food);
    }


//    2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//    (например, в миске 10 еды, а кот пытается покушать 15-20).

    public void decreaseFood(int appetite) {
        if (appetite <= food) {
            food -= appetite;
            System.out.println("Котик съел: " + appetite);
        } else if (appetite > food){
            System.out.println("В миске недостаточно еды");
        }
    }


   // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
public void addFood(int additive){
        food = food + additive;
}

}
