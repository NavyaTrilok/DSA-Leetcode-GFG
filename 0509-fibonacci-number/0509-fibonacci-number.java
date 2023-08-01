class Solution {
    public int fib(int n) {
        int num1=0;
        int num2=1;
        int counter = 0;
        int num3=0;
        while(counter!=n){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        return num1;
    }
}