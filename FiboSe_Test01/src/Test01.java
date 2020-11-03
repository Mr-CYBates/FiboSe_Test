import java.util.Scanner;

public class Test01 {
        public static void main(String[] args) {
//斐波那契数列：
            int i = 1;
            int j = 1;
            Scanner input = new Scanner(System.in);
            System.out.print("请输入斐波那契数列的项数：");
            int n = input.nextInt();
            if(n == 0){
                System.out.println("小朋友不要捣乱哦！请重新输入! ");
            }
            else if (n % 2 ==0){
                n /= 2;
                for(int os = 1; os <= n; os++){
                    System.out.print(i + " " + j + " ");
                    i = i+j;
                    j = i+j;
                }
            }else if(n == 1){
                System.out.print(i);
            }
            else{
                System.out.print(i + " " + j + " ");
                for(int js = 1; js < n / 2; js++){
                    i = i+j;
                    j = j+ i;
                    System.out.print(i + " " + j + " ");
                }
                System.out.print(i + j);
            }
        }
    }

