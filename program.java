import java.util.Scanner;


public class program {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter num u want to check even or odd :");
        int num = s.nextInt();

        if(num%2==0){
            System.out.println("the number you entered is even");
        }else {
            System.out.println("the number you entered is odd");
        }

        int a = 5;
        int fac=1;

        for(int i=1;i<a;i++){
            fac=fac*i;
        }
        System.out.println("the factorial is " + fac);

        
    }
}
