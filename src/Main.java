import java.util.ArrayList;

public class Main {

    public static void bubblesort(ArrayList<Student> arrList) {
        Student empty;

        for (int i = 0; i < arrList.size() - 1; i++) {
            for (int j = 0; j < (arrList.size() - 1); j++) {
                if ((arrList.get(j)).getMark() > (arrList.get(j + 1)).getMark()) {
                    empty = arrList.get(j);
                    arrList.set(j, arrList.get(j + 1));
                    arrList.set(j + 1, empty);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Иванов", 4.5));
        studentList.add(new Student("Петров", 3.7));
        studentList.add(new Student("Сидоров", 4.2));
        studentList.add(new Student("Козлов", 5.0));
        studentList.add(new Student("Горелов", 4.9));
        studentList.add(new Student("Вятский", 3.75));
        studentList.add(new Student("Орлов", 3.1));
        studentList.add(new Student("Магаданов", 4.23));

        for (Student studentMark : studentList) {
            System.out.println(studentMark.getName() + " " + studentMark.getMark());
        }

        System.out.println("-------------");

        bubblesort(studentList);

        for (Student studentMark : studentList) {
            System.out.println(studentMark.getName() + " " + studentMark.getMark());
        }
    }
}