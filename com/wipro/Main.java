import com.wipro.addt.Add;
import com.wipro.div.Div;
import com.wipro.mul.Mul;
import com.wipro.sub.Sub;
import com.wipro.varb.Var;

public class Main {
    public static void main(String[] args) {
        Var v=new Var();
        v.getA();
        v.getB();
        int s=Add.add();
        int r=Sub.sub(20,10);
        int i=Mul.mul(2,3);
        int d=Div.div(2,3);
        System.out.println(s+" "+r+" "+i+" "+d);
        System.out.println("hi");
        


    }
    
}
