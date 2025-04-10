import java.util.Arrays;

public class GradeMe {
    public static void main(String[] args) {}
    public double printGrade(double grade) {
        return grade;
    }
    public void sortGrades(int[] grades) {
        Arrays.sort(grades);
    }
    public void searchGrades(int[] grades, int target) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == target) {
                System.out.println(grades[i]);
            }

        }
    }
    public int getGrades(int[] grades, int index) {
        try {
            return grades[index];
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:Invalid index!");
            return -1;
        }
    }

}
