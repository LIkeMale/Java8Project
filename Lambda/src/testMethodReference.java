import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

/**
 * @author ylfeng
 * @date 2021年12月16日 15:36
 */
public class testMethodReference {
    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016, 9, 1)),
                new Person("001", LocalDate.of(2016, 2, 1)),
                new Person("002", LocalDate.of(2016, 3, 1)),
                new Person("004", LocalDate.of(2016, 12, 1))};

        //java8之前的原生写法
        Arrays.sort(pArr, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        });

        //使用lambda表达式的写法
        Arrays.sort(pArr, (a, b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });

        //由于Person中已经写了一个
        Arrays.sort(pArr, (a, b) -> Person.compareByAge(a, b));

        //使用方法引用，引用的是类的静态方法
        Arrays.sort(pArr, Person::compareByAge);
        System.out.println(Arrays.asList(pArr));
        BiFunction<Double, Double, Double> pow = Math::pow;
        LambdaTest.GreetingService greetingService = String::valueOf;
    }
}