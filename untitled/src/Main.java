import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("We are looking for more students you will have to complete some questions about your high school gpa");
        System.out.println("If your gpa is above 4.0 you get apcepted");

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        if(age<18) {
            System.out.print( "stop you are too young for college");
            System. exit(0);
        }

        System.out.print("Enter your gpa:");
        float gpa = scanner.nextFloat();

        if(gpa>=4) {
            System.out.print( name +  " You are apccepted. Expect an email");
        }
        else{
            System.out.print( name +  " Sorry: we exepected more from your gpa");
        }

    }

}
