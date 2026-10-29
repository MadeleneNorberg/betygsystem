public class Student {
    String[] student = {"Anna ", "Erik", "Sara", "Johan", "Emma", "Ali", "Lisa", "Oskar"};
    int[] grade = {34, 18, 42, 27, 39, 12, 31, 24};

    public Student() {

    }

    public String[] getStudent() {
        return student;
    }

    public void setStudent(String[] student) {
        this.student = student;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public void printStudentAndGrade() {
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i] + ": " + grade[i] + " " + results(grade[i]));
        }
    }

    public String results(int points) {
        if (points >= 40) {
            return "Väl godkänd";
        } else if (points >= 25) {
            return "Godkänd";
        } else {
            return "Underkänd";
        }

    }

    public int countStudents() {
        return student.length;

    }

    public int g_Students() {
        int count = 0;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] >= 25) {
                count++;
            }

        }
        return count;
    }

    public int u_Student() {
        int count = 0;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < 25) {
                count++;
            }

        }
        return count;
    }

    public String highestStudent() {
        int highestIndex = 0;

        for (int i = 1; i < grade.length; i++) {
            if (grade[i] > grade[highestIndex]) {
                highestIndex = i;
            }
        }

        return student[highestIndex] + " " +
                grade[highestIndex] + " poäng ("+
                results(grade[highestIndex])+ ")";

    }
    public String lowestStudent(){
      int lowestindex = 0;
      for (int i = 1; i < grade.length; i++){
          if (grade[i] < grade[lowestindex]){
              lowestindex = i;
          }
      }
      return student[lowestindex] + " " +
              grade[lowestindex] + " poäng ( "+
              results(grade[lowestindex])+")";
    }
    public double averageGrade(){
        int sum = 0;
        for( int i = 0; i < grade.length; i++ ){
            sum += grade[i];
        }
        return (double) sum / grade.length;
    }
    public void printSummary() {

        System.out.println("\nSAMMANFATTNING");
        System.out.println("Antal elever: " + countStudents());
        System.out.println("Godkända elever: " + g_Students());
        System.out.println("Underkända elever: " + u_Student());
        System.out.println("Högsta resultat: " + highestStudent());
        System.out.println("Lägsta resultat: " + lowestStudent());
        System.out.printf("Medelpoäng: %.1f%n", averageGrade());
    }
}

