package exceptiontest;

public class test {

    public static void main(String[] args) {

        int a =10 ;
        System.out.println("-----");
        for (int i = 0; i <10 ; i++) {
            try {
                System.out.println(a/i);
            }catch (Exception e){
                System.out.println("异常");
                continue;
            }
        }
    }
}
