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
        Student st = new Student(1014, "Mario", "Rossi", 2013);
        System.out.println(st.toString());

        Student stLuca = new Student(1015, "Luca", "Paolillo", 2024);
        System.out.println(stLuca.toString());

        stLuca.printGrades();
        
        int LucasGrades[] = new int[]{28, 30, 27};
        
        stLuca.addGrade(29);
        stLuca.printGrades();
        
        //stLuca.addGrade(24);
        //stLuca.printGrades();
        
        System.out.println(stLuca.addGrades(LucasGrades) + " new grade(s) added.");
        //stLuca.addGrades(LucasGrades);
        stLuca.printGrades();

        System.out.println(stLuca.addGrades(LucasGrades) + " new grade(s) added.");
        //stLuca.addGrades(LucasGrades);
        stLuca.printGrades();

    }

}