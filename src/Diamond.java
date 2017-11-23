public class Diamond {
    public static void main(String args[]){
        int x,y;
        for (y = 1; y <= 5; y++) {
            for (x = 0; x < 5 - y; x++) {
                System.out.print(' ');
            }
            for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
        for (y = 4; y >= 1; y--) { //reverse here
            for (x = 0; x < 5 - y; x++)
                System.out.print(' ');
            for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++)
                System.out.print('*');
            System.out.print('\n');
        }
    }
}
