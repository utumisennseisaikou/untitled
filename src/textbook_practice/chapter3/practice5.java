package textbook_practice.chapter3;
import java.io.*;
public class practice5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[メニュー]1:検索2:登録3:削除4:変更>");
        int selected = Integer.parseInt(br.readLine());
        switch(selected){
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("更新します");
                break;
            default:
        }
    }
}
