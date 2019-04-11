package 笔试;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @ClassName:TestUtils.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/17 22:20
 * @Version 1.0
 */
public class TestUtils {
    public static int sumOfDivisor(int N) throws Exception{
        int sum = 0;
        for (int i=1;i<=N;i++){
            if (N%i==0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String s = br.readLine();
        int a = parseInt(s);
        int b = sumOfDivisor(a);
        System.out.println(b);
    }
}
