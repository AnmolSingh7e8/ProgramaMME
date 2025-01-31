import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numVegades = scan.nextInt();
        for(int i = 0; i < numVegades; i++){
            int num = scan.nextInt();
            if(num >=0){
                System.out.println(num-1);
            } else {
                System.out.println(num);
            }
        }
    }
}