public class Student {

    private final String name;
    private final String surname;
    private final int id;
    private final int matriculationYear;
    // Modellare il concetto "insieme di voti" - si assuma che il numero di voti che lo studente può ricevere è 5 - e di voto medio

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
        System.out.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }

    // Implementare un metodo per calcolare il voto medio dei voti sfruttando le classi di utility

    // Implementare il toString() che contenga anche il voto medio di uno studente




}
