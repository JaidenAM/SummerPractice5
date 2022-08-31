import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int color;
        String tColor;
        System.out.println("Enter a traffic light color");
        color = sc.nextInt();
        switch (color) {
            case 1:
                tColor = "Green";
                switch (tColor){
                    case "Green":
                        System.out.println("Next Traffic light is " + tColor);
                        break;
                }
                break;
            case 2:
                tColor = "Red";
                switch (tColor){
                    case "Red":
                        System.out.println("Next Traffic light is " + tColor);
                        break;
                }
                break;
            case 3:
                tColor = "Yellow";
                switch (tColor){
                    case "Yellow":
                        System.out.println("Next Traffic light is " + tColor);
                        break;
                }
                break;
            default:
                System.out.println("Invalid Color");
        }
    }
}
