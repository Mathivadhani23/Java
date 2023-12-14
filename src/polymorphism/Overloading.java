package polymorphism;

public class Overloading {
    public void display (int a){
        System.out.println("ARGUMENTS ARE :"+a);
    }
    public void display (int a, int b){
        System.out.println("ARGUMENTS ARE : "+ a + b);
    }
    public void display(String a){
        System.out.println(" THE VALUE OF A : "+a);
    }
    public void display(String str, char ch){
        System.out.println(" ARGUMENTS ARE: "+ str + ch);
    }
    public static void main(String[] args) {
        Overloading o= new Overloading();
        o.display("PRIYA");
        o.display(12);
        o.display("MATHI", 'a');
        o.display(10, 20);
    }
}
