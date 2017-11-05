/**
 * Created by jacobburley on 05/11/2017.
 */
public class Problem2 {
    final static int FOUR_MILLION = 4000000;
    private boolean running = true;

    void start(){
        int a = 0;
        int b = 1;
        int result = 0;
        while(running){
            int c = fibonnaci(a,b);
            if(c < FOUR_MILLION){
                if(c%2 == 0){
                    result += c;
                }
                a = b;
                b = c;
            }else{
                running = false;
            }
        }
        System.out.println(result);
    }

    int fibonnaci(int i, int j){
        return i + j;
    }

    public static void main(String[] argv) {
        new Problem2().start();
    }
}
