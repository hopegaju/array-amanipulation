import java.util.Arrays;

public class GradeManager {
    public void printGrade(int[] grades) {
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public int[] addGrades(int[] grades, int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Invalid grade! Grade cannot be negative.");
        }
        int[] newGrades = Arrays.copyOf(grades, grades.length + 1);
        newGrades[grades.length] = grade;
        return newGrades;
    }

    public void sortGrades(int[] grades) {
        Arrays.sort(grades);
    }

    public int searchGrades(int[] grades, int target) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int getGrades(int[] grades, int index) {
        try {
            return grades[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
            return -1;
        }
    }

    public int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
