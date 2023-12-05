package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "취준생1";
        student1.age = 55;
        student1.grade = 30;

        Student student2 = new Student();
        student2.name = "취준생1";
        student2.age = 77;
        student2.grade = 50;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

    }
}
