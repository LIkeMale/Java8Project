import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ylfeng
 * @date 2022年01月07日 11:27
 */
public class Demo01 {
    static {
        System.out.println("主方法被加载！");
    }
    public static void main(String[] args) {
        String a = "hello world";
        String[] b = new String[] {"a", "c", "b"};
        List L = new ArrayList(100);
        //lambda表达式使用：
        Arrays.asList(b).forEach(s -> Person.eat(s));
        //静态方法引用：
        Arrays.asList(b).forEach(Person::eat);
    }
}
class Person{
    private int num =1;

    public Person(int num) {
        this.num = num;
    }
    public static void eat(String s){
        System.out.println("person的静态方法");
    }
}