import java.util.Random;

public class GarbageCreator {
    public static void main(String[] args) {
        Random ran = new Random();
        long start = System.currentTimeMillis();
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        String s5 = "e";
        for(int i = 0; i < 999999; i++) {
            s1 += ran.nextInt(2);    
        }
        
        for(int i = 0; i < 99999; i++) {
            s2 += ran.nextInt(2);    
        }
        for(int i = 0; i < 99999; i++) {
            s3 += ran.nextInt(2);    
        }
        for(int i = 0; i < 99999; i++) {
            s4 += ran.nextInt(2);    
        }
        for(int i = 0; i < 99999; i++) {
            s5 += ran.nextInt(2);    
        }

        System.out.println(System.currentTimeMillis() - start);
    }

}
