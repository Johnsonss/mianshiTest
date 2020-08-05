import java.time.Clock;
import java.util.Arrays;
import java.util.Random;

/**
 * 这是第一题的答案
 * 第二题的答案请看文件two.txt
 */
public class RandomTest {

    public static void main(String[] args) {
        long start = Clock.systemDefaultZone().millis();
        aa(500000,100000);
        long end = Clock.systemDefaultZone().millis();
        System.out.println("生成随机数所花的时间："+(end-start));
    }



    public static void aa(int n,int m){
        int[] x = new int[n];
        for(int i = 0; i < n; i++)
        {
            x[i] = i;
        }
        Random r = new Random();
        for(int i = 0; i < n; i++)
        {
            int in = r.nextInt(n - i) + i;
            int t = x[in];
            x[in] = x[i];
            x[i] = t;
        }
        int[] y = new int[m];
        for(int i = 0; i < m; i++)
        {
            y[i] = x[i];
        }

        System.out.println(Arrays.toString(y));
    }
}
