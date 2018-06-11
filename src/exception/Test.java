
package exception;

public class Test {

    public static void main(String[] args) {


        String agent = "Mozilla/5.0 (Linux; Android 8.1.0; CLT-AL00 Build/HUAWEICLT-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/64.0.3282.137 Mobile Safari/537.36 mtscrm/android";




        System.out.println( agent!=null &&
                (agent.toLowerCase().indexOf("micromessenger")>0
                        ||agent.toLowerCase().indexOf("clubhd")>0
                        ||agent.toLowerCase().indexOf("mtscrm")>0
                        ||agent.toLowerCase().indexOf("clubproject")>0));
    }
}