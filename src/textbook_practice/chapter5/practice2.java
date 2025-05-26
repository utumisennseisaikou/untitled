package textbook_practice.chapter5;

public class practice2 {
    public static void main(String[] args) {
        String title = "Java Programming";
        String address = "473927";
        String text = "Java Programming";
        email(title,address,text);
    }
    public static void email(String title,String address,String text){
        System.out.println(title+"に、以下のメールを送信しました。");
        System.out.println("件名:"+address);
        System.out.println("本文:"+text);

    }

}
