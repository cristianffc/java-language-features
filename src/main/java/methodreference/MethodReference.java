package methodreference;

public class MethodReference {

    public static void Main(String[] args) {

        Integer value = 10;
        System.out::println(Integer::parseInt);


    }
}
