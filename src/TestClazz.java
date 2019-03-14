public class TestClazz {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student");
            Student student = (Student) clazz.newInstance();
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
