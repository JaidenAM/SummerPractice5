import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int color;
        String tColor;
        System.out.println("Enter a traffic light color");
        color = sc.nextInt();
        if (color == 1){
            tColor = "Green";
            if (tColor == "Green"){
                System.out.println("Next Traffic light is " + tColor);
            }
        }else if(color == 2){
            tColor = "Red";
            if (tColor == "Red"){
                System.out.println("Next Traffic light is " + tColor);
            }
        }else if(color == 3){
            tColor = "Yellow";
            if (tColor == "Yellow"){
                System.out.println("Next Traffic light is " + tColor);
            }
        }else{
            System.out.println("Invalid Color");
        }
    }

}

