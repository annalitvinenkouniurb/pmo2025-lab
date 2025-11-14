
public class Student {

    private final String name;
    private final String surname;
    private final int id;
    private final int matriculationYear;
    private double grades[];

    // Modellare il concetto "insieme di voti" - si assuma che il numero di voti che lo studente può 
    // ricevere è 5 - e di voto medio

    public Student(final int id, final String name, final String surname, final int matriculationYear, double grades[]) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getMatriculationYear() {
        return matriculationYear;
    }

    public void printStudentInfo() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surname);
        System.out.println("Student matriculation year: " + this.matriculationYear);
        System.out.print("Student's grades: ");
        for(double g : this.grades){
            System.out.print(g + ", ");
        }
        System.out.println("");
        System.out.print("Medium grade: " + this.getMediumGrade());
        System.out.println("\n");
    }

    public void setGrades(double grades[]){
        if (grades.length == 5) {
            System.arraycopy(grades, 0, this.grades, 0, grades.length);
        }
        else{
            System.err.println("Wrong argument length.");
        }
    }

    public double[] getGrades(){
        return grades;
    }


    // Implementare un metodo per calcolare il voto medio dei voti sfruttando le classi di utility
    public double getMediumGrade(){
        ArrayUtil aU = new ArrayUtil();
        return aU.getMediumValue(grades);
    }

    // Implementare il toString() che contenga anche il voto medio di uno studente
    @Override
    public String toString(){
        return "Student " + this.name + " " + this.surname + " id[" + this.id + "] Medium grade = " + this.getMediumGrade();
    }
}
