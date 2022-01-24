import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ylfeng
 * @date 2022年01月10日 17:06
 */
class TestUmsPermission {
    public static void main(String[] args) {
        List<UmsPermission> permissionList = new ArrayList<>();
        //为集合创建串行流对象
        Stream<UmsPermission> stream = permissionList.stream();
        //为集合创建并行流对象
        Stream<UmsPermission> parallelStream = permissionList.parallelStream();
        permissionList.stream().forEach(System.out::println);
        permissionList.stream().filter(umsPermission -> umsPermission.getType()==0)
                .collect(Collectors.toList());
        permissionList.stream().map(umsPermission -> umsPermission.getId())
                .collect(Collectors.toList());
        permissionList.stream().limit(5).collect(Collectors.toList());
        permissionList.stream().filter(umsPermission -> umsPermission.getType()==0)
                .count();
        permissionList.stream().map(umsPermission -> umsPermission.getType());
    }
}
class TestGc{
    public static void main(String[] args) {
        System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");    //系统的最大空间
        System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");  //系统的空闲空间
        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");  //当前可用的总空间
    }
}
