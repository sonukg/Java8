package lambda;

public class LambdaWithSingleParameter {

    public static void main(String[] args){
       Printable withLambda = msg -> System.out.println(msg);
        withLambda.print("Hello World");
    }
}

interface Printable{
    public void print(String str);

}
