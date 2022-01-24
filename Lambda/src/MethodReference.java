import java.util.Arrays;

/**
 * @author ylfeng
 * @date 2021年12月16日 14:22
 */
public class MethodReference {
    public static void main(String[] args) {
        String[] stringsArray = {"1","2","3"};
        Arrays.sort(stringsArray,(s1, s2)->s1.compareToIgnoreCase(s2));
        Arrays.sort(stringsArray, String::compareToIgnoreCase);
    }
}
