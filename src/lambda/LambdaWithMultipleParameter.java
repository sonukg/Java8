package lambda;

public class LambdaWithMultipleParameter {
    public static void main(String[] args){

        // Multiple parameters in lambda expression
        Addable withLambda = (a, b) -> (a + b);
        System.out.println(withLambda.add(10,20));

        // Multiple parameters with data type in lambda expression
        Addable withLambdaMultiLine = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(withLambdaMultiLine.add(100,200));
    }

}

interface Addable{
    public int add(int a, int b);

}

