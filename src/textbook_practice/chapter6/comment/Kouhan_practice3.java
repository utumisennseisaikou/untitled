package textbook_practice.chapter6.comment;

public class Kouhan_practice3 {
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ!であえい!");
    }
    public static void showMondokoro() {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいるぬか!");
        java.lang.Thread thread = new java.lang.Thread();
        try {

            thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Zenhan.doTogame();

    }
}
