/**
 * Created by jacobburley on 05/11/2017.
 */
public class Problem1{

    void start(){
        int result = 0;
        for(int i = 1; i < 1000; i++){
            if(i%3 == 0 || i%5 == 0){
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] argv) {
        new Problem1().start();
    }
}