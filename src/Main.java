import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentMarks = new ArrayList<>();
        studentMarks.add(new Student("Иванов", 4.5));
        studentMarks.add(new Student("Петров", 3.7));
        studentMarks.add(new Student("Сидоров", 4.2));
        studentMarks.add(new Student("Козлов", 5.0));
        studentMarks.add(new Student("Горелов", 4.9));
        studentMarks.add(new Student("Вятский", 3.75));
        studentMarks.add(new Student("Орлов", 3.1));
        studentMarks.add(new Student("Магаданов", 4.23));

        for (Student studentMark : studentMarks) {
            System.out.println(studentMark.getName() + " " + studentMark.getMark());
        }

        Student empty;

        System.out.println("-------------");

        for (int i=0; i < (studentMarks.size()-1); i++){
            for (int j=0; j < (studentMarks.size()-1); j++) {
                if ((studentMarks.get(j)).getMark() > (studentMarks.get(j + 1)).getMark()) {
                    empty = studentMarks.get(j);
                    studentMarks.set(j, studentMarks.get(j + 1));
                    studentMarks.set(j + 1, empty);
                }
            }
        }

        for (Student studentMark : studentMarks) {
            System.out.println(studentMark.getName() + " " + studentMark.getMark());
        }
    }
}