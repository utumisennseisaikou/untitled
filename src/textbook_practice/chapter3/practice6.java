package textbook_practice.chapter3;
import java.io.*;
public class practice6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("【数あてゲーム】");
        double s = Math.random()*10;
        int ans = (int)s;
        for(int i=0; i<5; i++){
            System.out.print("0~9の数字を入力してください");
            int num = Integer.parseInt(br.readLine());
            if(ans == num ){
                System.out.println("アタリ!");
            }else{
                System.out.println("違います");
            }

        }
        System.out.println("ゲームを終了します");
    }
}
