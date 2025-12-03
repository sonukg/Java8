package lambda;

interface Drawable {
    void draw();
}

public class SimpleLambdaExpression {
    public static void main(String[] args) {
        int width = 10;

        Drawable withLambda = () -> {
            System.out.println("Drawing: " + width);
        };

        withLambda.draw();
    }
}
