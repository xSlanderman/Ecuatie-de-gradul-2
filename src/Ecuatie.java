import java.util.*;

public class Ecuatie {
    private int a;
    private int b;
    private int c;

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
    }


}
