import java.util.Random;

public class Main {

    public static void main(String[] args) {
        garden(10);
    }
        public static void garden ( int range){

            int[][] garden = new int[range][range];
            Random random = new Random();
            for (int i = 0; i < garden.length; i++) {
                for (int j = 0; j < garden.length; j++) {
                    garden[i][j] = random.nextInt(2);
                }
            }
                
            // iterates over every index, as well as i+1 and if condition sets all to 0 (eaten)
        
            int leaps = 0;
            for (int i = 0; i < garden.length - 1; i++) {
                for (int j = 0; j < garden.length - 1; j++) {
                    if (garden[i][j] < garden.length) {
                        if (garden[i][j] == 1 && garden[i][j + 1] == 1 &&
                                garden[i + 1][j] == 1 && garden[i + 1][j + 1] == 1) {
                            garden[i][j] = 3;
                            garden[i][j+1] = 3;
                            garden[i+1][j] = 3;
                            garden[i+1][j+1] = 3;
                            leaps++;
                        }
                    }
                }
            }        
            
            
            // draw - " | " where carrots are, " X " where carrots where eaten
            for (int i = 0; i < garden.length; i++) {
                for (int j = 0; j < garden.length; j++) {
                    if (garden[i][j] == 1) {
                        System.out.print(" | ");
                    } else if(garden[i][j]==3){
                        System.out.print(" X ");
                    } else {
                        System.out.print(" O ");
                    }
                }
                System.out.println();
            }


            System.out.println("Number of leaps: " + leaps);
        }
    }
