package logicalProgram;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //1.COUNT THE DIGIT 
        int n=153, n1=n, temp=n;
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        System.out.println("COUNT IS "+c);
//2.FIND THE POWER OF EACH DIGIT
        int sum=0;
        while(n1>0){
            int rem=n1%10;

            int power=1;

            for(int i=1;i<=c;i++){
                power=power*rem;
            }
            sum=sum+power;
            n1=n1/10;

        }
        System.out.println("SUM IS : "+sum);
        //3.COMPARE SUM WITH GIVEN NUMBER
        if(sum==temp){
            System.out.println("ARMSTRONG NUMBER");
        }else{
            System.out.println("NOT ARMSTRONG NUMBER");
        }
    }
}
