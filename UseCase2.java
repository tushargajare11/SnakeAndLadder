package snakeandladder;

public class UseCase2 {

        public static void main(String[] args) {
            System.out.println("welcome to snake and ladder game");
            int dice=(int) Math.floor(Math.random()*10)%7;
            int resut=(dice==0?1:dice);
            System.out.println("dice number is:"+resut);

        }

}

