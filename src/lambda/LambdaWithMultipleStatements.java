package lambda;

public class LambdaWithMultipleStatements {
    public static void main(String[] args){
        Average withLambda = (withLambdaArray) ->{
        double sum = 0;
        int arraySize= withLambdaArray.length;
        System.out.println("arraySize: " +arraySize);

        for (int i=0; i< withLambdaArray.length; i++){
            sum=sum+withLambdaArray[i];
        }
        System.out.println("sum: " +sum);
        return sum/arraySize;

        };

        int[] withLambdArray ={10,20,30,40};
        System.out.println(withLambda.average(withLambdArray));
    }
}

interface Average{
    double average(int[] array);
}
