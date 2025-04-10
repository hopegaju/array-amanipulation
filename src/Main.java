public class Main {
    public static void main(String[] args) {
        int[] grades = new int[0];
        GradeManager gradeManager = new GradeManager();

        grades = gradeManager.addGrades(grades, 12);
        grades = gradeManager.addGrades(grades, 18);
        grades = gradeManager.addGrades(grades, 25);
        grades = gradeManager.addGrades(grades, 33);
        grades = gradeManager.addGrades(grades, 47);
        grades = gradeManager.addGrades(grades, 56);
        grades = gradeManager.addGrades(grades, 64);
        grades = gradeManager.addGrades(grades, 71);
        grades = gradeManager.addGrades(grades, 83);
        grades = gradeManager.addGrades(grades, 90);

        System.out.println("\n--- All Grades ---");
        gradeManager.printGrade(grades);

        System.out.println("\n--- Adding Invalid Grade ---");
        try {
            grades = gradeManager.addGrades(grades, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Sorted Grades ---");
        gradeManager.sortGrades(grades);
        for (int grade : grades) {
            System.out.print(grade + " ");
        }

        System.out.println("\n\n--- Searching for Grade 90 ---");
        int index = gradeManager.searchGrades(grades, 90);
        System.out.println("Grade 90 found at index: " + index);

        System.out.println("\n--- Searching for Grade 100 ---");
        index = gradeManager.searchGrades(grades, 100);
        if (index == -1) {
            System.out.println("Grade 100 not found.");
        }

        System.out.println("\n--- Average Grade ---");
        System.out.println("Average grade: " + gradeManager.calculateAverage(grades));

        System.out.println("\n--- Highest and Lowest Grades ---");
        System.out.println("Highest grade: " + gradeManager.findHighestGrade(grades));
        System.out.println("Lowest grade: " + gradeManager.findLowestGrade(grades));

        System.out.println("\n--- Accessing Invalid Index ---");
        gradeManager.getGrades(grades, 100);  // This triggers try-catch in method
    }
}
