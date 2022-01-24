import java.util.Comparator;

/**
 * @author ylfeng
 * @date 2021年12月15日 19:43
 */
public class LambdaTest02 {
    public static void main(String[] args) {
        Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length());  //编译会出错
    }



}
