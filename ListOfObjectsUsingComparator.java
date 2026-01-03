
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOfObjectsUsingComparator {
   static class Student{
     String name;
    int score;

        public Student(String name, int score){
            this.name=name;
            this.score=score;
        }


    }
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 90));

    Comparator<Student> scoreComparator=new Comparator<Student>(){
        @Override
        public int compare(Student s1, Student s2){

            return Integer.compare(s1.score, s2.score);
        }

    };
        Collections.sort(students, scoreComparator);
  System.out.println("Sorted Students (by score descending):");
        for (Student s : students) {
            System.out.println(s.name + ": " + s.score);
        }
    }
}
