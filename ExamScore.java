import java.util.*;
public class ExamScore {
    public static void main(String args[]){
        final int Num_Student = 5;
        int[] examscore = new int[Num_Student];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student marks : ");
        for (int i =0;i<Num_Student;i++){
            System.out.print("Enter score of number : " +(i+1)+" marks : ");
            examscore[i] = scanner.nextInt();
        }
        int sum =0;
        int highscore = examscore[0];
        for(int score :examscore){
            sum += score;
            if (score > highscore){
                highscore =score;
            }
        }
        System.out.println("Exam Score Statics");
        System.out.println("Score : "+ sum);
        System.out.println("The Higih score : "+ highscore);
    }
}
