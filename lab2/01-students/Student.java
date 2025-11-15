
public class Student {

    private final String name;
    private final String surname;
    private final int id;
    private final int matriculationYear;
    private int[] grades = new int [5];
    private double mediumGrade;

    // Modellare il concetto "insieme di voti" - si assuma che il numero di voti che lo studente può 
    // ricevere è 5 - e di voto medio

    public Student(final int id, final String name, final String surname, final int matriculationYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
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

    public int addGrade(int newGrade){
        int newGradeAdded = 0;
        for(int i = 0; i < 5; i++){
            if (this.grades[i] == 0 && newGradeAdded == 0){
                this.grades[i] = newGrade;
                newGradeAdded = newGrade;
                break;
            }
        }
        return newGradeAdded;
    }
    
    public int addGrades(int newGrades[]){
        int numNewGradesAdded = 0;
        int j = 0;
        for(int i = 0; i < 5 && j < newGrades.length; i++){
            if (this.grades[i] == 0 && numNewGradesAdded == 0) {
                this.grades[i] = newGrades[j];
                j++;
            }
        }   
        numNewGradesAdded = j;
        return numNewGradesAdded;
    }

    public void printGrades(){
 /*
 if (this.grades[0] == 0) {
     System.err.println("No grades have been added.");
 }
 else{
     for(Integer grade : this.grades){
         System.out.print(grade + " ");
     }
     System.out.println();
 }
 
 */       
    for(Integer grade : this.grades){
         System.out.print(grade + " ");
     }
     System.out.println();
    }


    // Implementare un metodo per calcolare il voto medio dei voti sfruttando le classi di utility
    public double getMediumGrade(){
        ArrayUtil aU = new ArrayUtil();
        return aU.getMediumValue(this.grades);
    }

    // Implementare il toString() che contenga anche il voto medio di uno studente
    @Override
    public String toString(){
        return "Student [name=" + this.name + " " + this.surname + ", id=" + this.id + ", matriculation year=" + this.getMatriculationYear();
    }
}
