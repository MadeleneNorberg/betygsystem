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

    public int countstudents() {
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

        public int u_student(){
            int count = 0;
            for( int i = 0; i< grade.length; i++){
                if(grade[i] < 25){
                    count++;
                }

            }
            return count;
        }
        

}

