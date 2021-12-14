package snakeandladder;

public class UseCase3 {
    public static int new_pos = 0;
    public static final int NO_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Player one started game played at position"+ position);
        int option = 0;

        int player1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The player1 Rolls Die get Number is " + player1);
        option = (int) Math.floor(Math.random() * 10) % 3;
        switch (option)
        {

            case NO_Play:
                new_pos= 0;
                System.out.println("NO play");
                break;

            case Ladder:
                new_pos = player1;
                System.out.println("Ladder");
                break;

            case Snake:
                new_pos= -player1;
                System.out.println("Snake");
                break;


        }
    }

}

