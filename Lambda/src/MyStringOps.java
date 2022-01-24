import java.util.Collections;

/**
 * @author ylfeng
 * @date 2021年12月16日 17:49
 */
public class MyStringOps {
    //静态方法： 反转字符串
    public static String strReverse(String str) {
        Collections.max()
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
