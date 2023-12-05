package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 55;

        Student student2 = new Student();
        student2.name = "학생1";
        student2.age = 15;
        student2.grade = 55;

        // 배열 선언
        Student[] students = new Student[]{student1, student2};

        // for 문 적용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" +
                    students[i].age + " 성적:" + students[i].grade);
        }

        // 향상된 for문
        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
