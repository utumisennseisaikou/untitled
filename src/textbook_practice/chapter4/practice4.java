package textbook_practice.chapter4;

public class practice4 {
    public static void main(String[] args) {
        int [] numbers = {3,4,9};
        System.out.print("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int n:numbers){
            if(n == input){
                System.out.println("アタリ!");
            }
        }
    }
}
