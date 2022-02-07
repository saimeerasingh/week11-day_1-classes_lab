public class Calculator {
    private int a;
    private int b;


    public Calculator(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int addNumbers(int a, int b){
        return a + b;
    }

    public int subtractNumbers(int a, int b){
        return a - b;
    }

    public int multiplyNumbers(int a, int b){
        return a * b;
    }

    public double divideNumbers(int a , int b){
        return a / b;
    }


}
