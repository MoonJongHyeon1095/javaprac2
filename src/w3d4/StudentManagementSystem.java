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
        if(currentSize < students.length){
            students[currentSize] = student;
            currentSize++;
            System.out.println("학생 추가: " + student.get이름());
        }else{
            System.out.println("학생 데이터베이스가 가득 찼습니다.");
        }
    }

    public void removeStudent(Student student) {
        // 학생 삭제 로직 구현
    }

    public void searchStudent(int studentNumber) {
        // 학생 검색 로직 구현
    }

}
