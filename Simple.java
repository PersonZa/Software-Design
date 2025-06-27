import java.util.Scanner;

public class Simple{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);    
    System.out.println("Welcome to GitHub");
    
     System.out.println("What age : ");
     
     String age = scanner.nextLine();
     System.out.println("Age : " + age);

    Index("PersonZa",3);
     
    
  }


  public static void Index(String a1,int a2){
    System.out.println("Name : " + a1);
    System.out.println("Year : " + a2);
  }

}
