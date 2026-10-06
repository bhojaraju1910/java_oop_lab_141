import java.util.Scanner;
import java.util.Arrays;
import java.lang.String; 
class Student {
    String USN; 
    String name;

    void accept() {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter the USN: ");
        USN = s.next(); 
        s.nextLine(); 
        System.out.print("Enter the Name: ");
        name = s.nextLine(); 
    }

    void display() {
        System.out.println("USN : " + USN);
        System.out.println("NAME : " + name);
    }


    public static void main(String[] args) {
            Student s[] = new Student[3];
            for(int i =0;i<3;i++){
                s[i] = new Student();
                s[i].accept();
            }
            
            for(int i =0;i<3;i++){
                s[i].display();
            }
            
            Student s1 = new Student();
            s1.accept();
            s1.display();
        
    } 
}
