public class TestStudents{

    public static void main(String[] args){
        /*
         * 1) Creare lo studente Mario Rossi, matricola 1014, anno
         * immatricolazione 2013
         * 
         * 2) Creare lo studente Luca Bianchi, matricola 1018, anno
         * immatricolazione 2010
         * 
         * 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
         * immatricolazione 2012
         * 
         * 4) Creare lo studente Luca Verdi, matricola 1020, anno
         * immatricolazione 2013
         * 
         * 5) Aggiungere i 4 studenti alla stessa struttura dati
         * 
         * 6) Per ciascuno studente aggiungere 5 voti random tra 18 e 30
         * 
         * 7) Ordinare i 4 studenti in base al voto medio
         * 
         * 8) Per verificare la correttezza dei metodi implementati
         * stampare a video le informazioni relative agli studenti comprensivo del voto medio
         * 
         * */
        double grades1[] = {0.0, 0.0, 0.0, 0.0, 0.0};
        Student s1 = new Student(1014, "Mario", "Rossi", 2013, grades1);

        double grades2[] = {18.0, 20.0, 30.0, 19.0, 20.0};
        Student s2 = new Student(1015, "Luca", "Bianchi", 2010, grades2);
        
        double grades3[] = {10.0, 0.0, 0.0, 0.0, 0.0};
        Student s3 = new Student(1016, "Peppino", "Vitiello", 2012, grades3);
        
        double grades4[] = {7.0, 16.0, 15.0, 14.0, 13.0};
        Student s4 = new Student(1017, "Luca", "Verdi", 2013, grades4);

        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        s4.printStudentInfo();

        System.out.println(s1.toString());
        

    }

}