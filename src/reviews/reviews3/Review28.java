package reviews.reviews3;
import java.io.*;
public class Review28 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力>");
        String to = br.readLine();
        System.out.print("件名を入力");
        String subject = br.readLine();
        System.out.print("本文を入力>");
        String body = br.readLine();

        if(subject.equals("")){
            System.out.println("件名は空です。");
        }else{
            System.out.println("件名は"+ subject + "です。");

        }
    }
}
