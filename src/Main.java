import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int points = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Okey , we are going to start the game");

        String Question1 = ("Who is the trivia creator");
        String Options1 = (" A) Pedro  B) Vege  C) Pedro");
        String Sol1 = ("B)");
        String Fail1 = ("A)" + "C)");

        System.out.println(Question1);
        System.out.println(Options1);

        String Answer = scanner.next();

        if (Answer.equals(Sol1)) {
            points++;
            System.out.println("Congrats");
        } else if (Answer.equals(Fail1)) {
            System.out.println("Oh.. You fail, the answer was the B) Vege");

        }

        String Question2 = ("What is 5+9");
        String Options2 = (" A) 10  B) 15 C) 14 ");
        String Sol2 = ("C)");
        String Fail2 = ("A)" + "B)");

        System.out.println(Question2);
        System.out.println(Options2);

        String answer2 = scanner.next();

        if (answer2.equals(Sol2)) {
            points++;
            System.out.print("Congrats");
        } else if (answer2.equals(Fail2)) {
            System.out.println("Oh.. You fail, the answer was the C) 14");

        }

        String Question3 = ("In what country is Madrid");
        String Options3 = ("A) Spain B) Italy C) USA");
        String Sol3 = ("A)");
        String Fail3 = ("B)" + "C)");

        System.out.println(Question3);
        System.out.println(Options3);

        String answer3 = scanner.next();

        if (answer3.equals(Sol3)) {
            points++;
            System.out.print("Congrats");
        } else if (answer3.equals(Fail3)) {
            System.out.println("Oh.. You fail, the answer was the A) Spain");

        }







        System.out.println("The trivia has finished, your score is " + points);







    }

}

















