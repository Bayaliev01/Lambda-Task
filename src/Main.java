import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        System.out.println(sqrt().apply(11.1));
    }
    public static UnaryOperator<Double> sqrt(){

UnaryOperator<Double> unaryOperator = (a) ->Math.sqrt(a);
return unaryOperator;
    }
}