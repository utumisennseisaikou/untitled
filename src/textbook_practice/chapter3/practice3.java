package textbook_practice.chapter3;

public class practice3 {
    public static void main(String[] args) {
        int isHungry = 1;
        String food = "ラーメン";
        System.out.println("こんにちは");
        if (isHungry == 0){
            System.out.println("お腹がいっぱいです。");
        }else if (isHungry == 1){
            System.out.println("腹ペコです。");
            System.out.println(food+"をいただきます。");
            System.out.println("ごちそうさまでした。");
        }
    }
}
