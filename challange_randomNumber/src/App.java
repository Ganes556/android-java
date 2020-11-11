import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Message");
        System.out.println("Please input your name");
        Scanner in = new Scanner(System.in);

        System.out.print("Name : ");
        String name = in.nextLine();
        System.out.println("Hello " + name);

        // number yg dituju
        
        boolean answer = true;

       
        while(answer){            
            System.out.println("Shall we start ?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print(">> ");
            int start = in.nextInt();
            answer = start == 1;  
            if (!answer){
                break;
            }       
            runs(in);
            
        }
    }
    private static void runs(Scanner in){
        
        Random random = new Random();
        int x = random.nextInt(19) + 1;
        System.out.println("Please Input Number Guess");
        int input = in.nextInt();

        boolean hasWon = false;
        boolean shouldFinish = false;
        int timesUp = 0;
        while(!shouldFinish){
            timesUp++;
            if(timesUp < 5){
                if (x == input) {
                    shouldFinish = true;
                    hasWon = true;
                }else{
                    System.out.println("Guess lower");                    
                    input = in.nextInt();
                }
            }else{
                shouldFinish = true;
            }

            

        }
        if(hasWon){
            System.out.println("Congratulation you won with "  + timesUp);
        }else{
            System.out.println("Game Over");
            System.out.println("The Number Was " + x);
        }

    }
}
