import javafx.print.Printer;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;
import org.w3c.dom.ranges.Range;

public class javaTest {
    public static void main(String[] args) {
    int i = 0;
    outer:
       for(;true;){
            inrss:
            for (; i <10 ; i++) {
                System.out.println("i = "+i);
                if (i==2){
                    System.out.println("contine");
                    continue ;
                }
                if (i==3){
                    System.out.println("break");
                    i++;
                    break ;
                }
                if (i == 7) {
                    System.out.println("contiune outer");
                    i++;
                    continue  outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int j = 0; j <5 ; j++) {
                    if (j==3){
                        System.out.println("continer inner");
                        continue  inrss;
                    }
                }

            }

        }
        System.out.println("迭代结束");
    }
}
