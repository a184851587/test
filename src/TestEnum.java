import java.security.PrivateKey;

public enum TestEnum {

    S_CZFS_GD("固定规则");




    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    TestEnum(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        System.out.println(TestEnum.S_CZFS_GD);
        System.out.println(TestEnum.S_CZFS_GD.getName());
    }
}
