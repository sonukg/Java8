package lambda;

public class LambdaWithNoParameter {

        public static void main(String[] args){
            lambda.Speaker speaker = new lambda.Speaker() {
                @Override
                public String Speak() {
                    return "Speak Something";
                }
            };
            System.out.println(speaker.Speak());

            lambda.Speaker withLambda = () -> "Speak Something";
            System.out.println(withLambda.Speak());
        }
    }

    interface Speaker{
        public String Speak();

    }

