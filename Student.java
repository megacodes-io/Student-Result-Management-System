public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;
    private int total;
    private double average;
    private String grade;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        calculateResults();
    }

    private void calculateResults() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / (double) marks.length;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 40)
            grade = "D";
        else
            grade = "F";
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public String getGrade() {
        return grade;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");
    }
}
