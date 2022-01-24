/**
 * @author ylfeng
 * @date 2021年12月15日 19:43
 */
public class LambdaTest {
    public static void main(String[] args) {
        int num =1;
        LambdaTest lambdaTest = new LambdaTest();
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

//-------------------------------------------------------------------------------
        //Java8之前的写法，将接口作为参数传进去必须要实现接口的方法先
        lambdaTest.operate(1,2, new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return 0;
            }
        });
        //完整版这样写
        System.out.println("10 + 5 = " + lambdaTest.operate(10, num, (int a, int b) -> a + b ));
        //将接口拿出来写就是这种格式
        System.out.println("10 + 5 = " + lambdaTest.operate(10, 5, addition));
//-------------------------------------------------------------------------------
        System.out.println("10 - 5 = " + lambdaTest.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + lambdaTest.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambdaTest.operate(10, 5, division));


//--------------------------------------------------------------------------------
        //java8之前，实现接口就要实现接口中的方法
        GreetingService greetService0 = new GreetingService() {
            @Override
            public void sayMessage(String message) {
                System.out.println("Hello " + message);
            }
        };
        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    //接口一
    interface MathOperation {
        int operation(int a, int b);
    }
    //接口二，加上注解表示该接口只能有一个函数式接口
    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }

    //operate方法将mathOperation作为了参数，所以有人调用该方法就要实现接口中的方法
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
