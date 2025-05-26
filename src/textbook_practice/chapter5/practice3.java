package textbook_practice.chapter5;

public class practice3 {
    public static void main(String[] args) {
        String title = "Java Programming";
        String text = "Java Programming";
        email(title,text);
    }
    public static void email(String title,String text){
        System.out.println(title+"に、以下のメールを送信しました。");
        System.out.println("件名:無題");
        System.out.println("本文:"+text);

    }

}
