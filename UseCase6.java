package snakeandladder;

public class UseCase6 {


        public static void main(String[] args) {

            System.out.println("welcome to snake and ladder game");
            int ladder1=1;
            int ladder2=4;
            int ladder3=8;
            int ladder4=21;
            int ladder5=28;
            int ladder6=50;
            int ladder7=71;
            int ladder8=80;
            int snake1=32;
            int snake2=36;
            int snake3=48;
            int snake4=62;
            int snake5=88;
            int snake6=95;
            int snake7=97;


            int position=0;



            int count=0;
            while(position<=100)
            {
                int dice=(int) Math.floor(Math.random()*10)%7;

                int dice1=(dice==0?1:dice);  //used ternary operator
                count++;
                System.out.println("dice number is:"+dice1);
                position=dice1+position;

                System.out.println("position is:"+position);


                if(position==100)
                {
                    System.out.println("you won the game");
                    System.exit(0);


                }
                else if(position==1) {         //for ladders
                    position=position+37;
                    System.out.println("you got the ladder");


                }
                else if(position==4) {
                    position=position+10;
                    System.out.println("you got the ladder");


                }
                else if(position==8) {
                    position=position+22;
                    System.out.println("you got the ladder");


                }
                else if(position==21) {
                    position=position+21;
                    System.out.println("you got the ladder");


                }
                else if(position==28) {
                    position=position+51;
                    System.out.println("you got the ladder");


                }
                else if(position==50) {
                    position=position+17;
                    System.out.println("you got the ladder");


                }
                else if(position==71) {
                    position=position+21;
                    System.out.println("you got the ladder");


                }
                else if(position==80) {
                    position=position+19;
                    System.out.println("you got the ladder");


                }
                else if(position==32) {            //for snakes
                    position=position-22;
                    System.out.println(" oops you got the snake");


                }
                else if(position==36) {
                    position=position-30;
                    System.out.println(" oops you got the snake");


                }
                else if(position==48) {
                    position=position-22;
                    System.out.println(" oops you got the snake");


                }
                else if(position==62) {
                    position=position-44;
                    System.out.println(" oops you got the snake");


                }
                else if(position==88) {
                    position=position-64;
                    System.out.println(" oops you got the snake");


                }
                else if(position==95) {
                    position=position-39;
                    System.out.println(" oops you got the snake");




                }

                else if(position==97) {
                    position=position-79;
                    System.out.println(" oops you got the snake");




                }

                else if((position ==96) && (dice1>=5))

                {


                    position=position - dice1;
                    System.out.println("hurayyyy you won the game");


                }


                else if((position ==98) && (dice>=2))
                {
                    position = position - dice1;
                    System.out.println("please try again");
                }



                else if ((position ==99 ) && (dice1>=1))
                {

                    position = position - dice1;
                    System.out.println("hurayyyy you won the game");
                    //for terminate the game
                }




            }
            System.out.println("the dice is thrown at "+count+"times");
        }
    }



