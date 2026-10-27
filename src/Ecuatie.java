import java.util.*;

public class Ecuatie {
    private int a;
    private int b;
    private int c;
    private double x1,x2;

    public Ecuatie(){
        Scanner in = new Scanner(System.in);

        System.out.print("a=");
        a = in.nextInt();

        while(a == 0){
            System.out.println("a it not must be 0");
            System.out.print("a=");
            a = in.nextInt();
        }

        System.out.print("b=");
        b = in.nextInt();

        System.out.print("c=");
        c = in.nextInt();

        System.out.println("The delta is: "+caldelta());

        if(caldelta() == 0){
            x1=x2=(-b)/(2*a);
            System.out.println("The result is: "+getResult1());
        }
        if(caldelta() > 0){
            x1= (((-b)+Math.sqrt(caldelta()))/(2*a));
            x2= (((-b)-Math.sqrt(caldelta()))/(2*a));
            System.out.println("The result is: "+getResult2());
            System.out.println("The result is: "+getResult3());
        }
        if(caldelta() < 0 ){
            System.out.println("There are no real solutions !");
        }
    }

    //calculate delta
    private int caldelta(){
        return (b*b)-4*a*c;
    }

    //result if delta == 0
    public double getResult1(){
        return x1;
    }

    //the result if delta > 0
    public double getResult2(){
        return x1;
    }
    public double getResult3(){
        return x2;
    }
}
