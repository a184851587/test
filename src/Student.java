/**
 * Created by Administrator on 2018/3/13.
 */
public class Student {

    private int no;
    private String name;
    private String sex;
    private float height;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Student(int no, String name, String sex, float height) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("no=").append(no);
        sb.append(", name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
