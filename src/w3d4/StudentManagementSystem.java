package w3d4;
import java.util.ArrayList;
public class StudentManagementSystem {
    private ArrayList<Student> students; // 학생 배열
    private int maxCapacity; // 최대 저장 가능한 학생 수

    public StudentManagementSystem(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        // 학생 추가 로직 구현
        if (students.size() < maxCapacity) {
            students.add(student);
            System.out.println("학생 추가: " + student.get이름());
        } else {
            System.out.println("학생 데이터베이스가 가득 찼습니다.");
        }
    }

    public void removeStudent(Student student) {
        // 학생 삭제 로직 구현
        //boolean	remove(Object o)
        //Removes the first occurrence of the specified element from this list, if it is present.
        boolean removed = students.remove(student);
        if (removed) {
            System.out.println("학생 삭제: " + student.get이름());
        } else {
            System.out.println("삭제할 학생이 데이터베이스에 존재하지 않습니다.");
        }
    }
    public void searchStudent(int studentNumber) {
        // 학생 검색 로직 구현
        for (Student student : students) {
            if (student.get학번() == studentNumber) {
                System.out.println("검색 결과: " + student.get이름());
                return;
            }
        }
        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
    }

}
