import java.util.Scanner;

public class kazuate{
    public static void main(String[] args){
        int num = 25;//正の2桁の整数
        final int chance = 5;//最大試行回数

        Scanner scanner = new Scanner(System.in);

        int ans = 0;

        for(int i=chance - 1; i >= 0; i--){

            System.out.print("2桁の整数を入力してください:");
            ans = scanner.nextInt(); 

            if(ans == num){
                System.out.println("正解です！");
                break;
            }
            if(Math.abs(ans - num) >= 20){
                System.out.println("20以上の差があります");
            }
            if(ans > num){
                System.out.println("正解より大きいです");
            }
            else if(ans < num){
                System.out.println("正解より小さいです");
            }

            System.out.println("残りのチャンスは"+ i + "回です");
        }

        System.out.println("ゲームを終了します");
        scanner.close();

    }

}