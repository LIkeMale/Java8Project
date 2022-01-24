import java.time.LocalDate;

/**
 * @author ylfeng
 * @date 2021年12月16日 15:29
 */
public class Person {
    String name;
    LocalDate birthday;

    //构造方法
    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    //birthday的get方法
    public LocalDate getBirthday() {
        return birthday;
    }

    //静态方法可以直接访问
    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    //toString方法
    @Override
    public String toString() {
        return this.name;
    }
}
