public class ArrayUtil{

    // Implementare un metodo per il calcolo del valor medio di un array
    public double getMediumValue(double grades[]){
        int counter = 0;
        double gradesSum = 0.0;
        for(double grade : grades){
            gradesSum += grade;
            counter += 1;    
        }
        return gradesSum / counter;
    }

    // Implementare un metodo per ordinare un array
    public void sortArray(double grades[]){
        for(int i = 1; i < grades.length; i++){
            double key = grades[i];
            int j = i-1;

            while(j >= 0 && grades[j] > key){
                grades[j+1] = grades[j];
                j = j - 1;
            }

            grades[j+1] = key;
        }
  
    }

}