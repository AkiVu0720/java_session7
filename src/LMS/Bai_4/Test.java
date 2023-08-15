package LMS.Bai_4;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Trc khi thay doi:");
        student.getName();
        student.getClassRoom();
        student.setName("Yamaha");
        student.setClassRoom("C03");
        System.out.println("Sau khi thay doi");
        student.getName();
        student.getClassRoom();
    }
}
