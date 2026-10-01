import java.util.Scanner;

class Student {
    private long studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public Student() {}

    public long getStudentId() {
        return studentId;
    }
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getFormattedPhoneNumber() {
        String str = Long.toString(this.phoneNumber);

        if (str.length() == 10) {
            str = "0" + str;
        }

        String prefix = str.substring(0, 3);
        String mid = str.substring(3, 7);
        String last = str.substring(7);

        return prefix + "-" + mid + "-" + last;
    }
}

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            String idStr = scanner.next();
            String name = scanner.next();
            String major = scanner.next();
            String phoneStr = scanner.next();

            Student student = new Student();
            student.setStudentId(Long.parseLong(idStr));
            student.setName(name);
            student.setMajor(major);
            student.setPhoneNumber(Long.parseLong(phoneStr));

            students[i] = student;
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.printf("%d번째 학생: %d %s %s %s\n",
                    (i + 1),
                    s.getStudentId(),
                    s.getName(),
                    s.getMajor(),
                    s.getFormattedPhoneNumber());
        }

        scanner.close();
    }
}