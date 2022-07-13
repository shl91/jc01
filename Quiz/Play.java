import java.util.Scanner; 


public class Play{
    public void play(){
    int score = 0,i;
        for (i=0;i<5;i++){
            System.out.println(Questions.questions[i]);
            
            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);
            if (choice == Answers.answers[i]){
                score++;
            }


        }
        }              
    }

