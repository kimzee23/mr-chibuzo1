import java.time.LocalDate;
import java.util.Scanner;
public class MbtiPersonalityTest {
public static void main(String[] args) {
    
    LocalDate Date = LocalDate.now();
System.out.println("Date" + Date);
    String[] questions ={
        "Question 1 : How do you usually spend your free time?(A) Relaxing at home with a book or movie  (B) Going out and socializing with friends",
        "Question 2 : When working on a task, whats your approach? (A)Plan everything in advance and stick to the plan (B) Go with the flow and adapt as you go",
        "Question 3 : Whats your preferred way of making decisions? (A)Logical reasoning and facts (B) Trusting your intuition and feelings  ",
        "Question 4 : How do you recharge after a long day? (A) Spending time alone  (B) Spending time with others",
        "Question 5 : How do you handle conflict? (A)Avoid it and try to keep the peace  (B)Face it head-on and resolve it ",
        "Question 6 : Which best describes your energy levels? (A) Steady and consistent  (B) Bursts of energy followed by downtime  ",
        "Question 7 : Whats your approach to making plans? (A)Stick to a structured schedule (B)Keep things flexible and spontaneous",
        "Question 8 : Do you prefer to: (A) Stick to traditions and familiar routines  (B)  Explore new ideas and experiment ",
        "Question 9 : When meeting new people, are you: (A)  Reserved and cautious (B) Open and enthusiastic  ",
        "Question 10 : What motivates you more?(A) Accomplishing pratical goals (B) Pursuing personal passions ",
        "Question 11 : How do you usually process information? (A) Focus on details and concrete facts (B) Look for patterns and underlying meanings",
        "Question 12 : In a group project, do you prefer to: (A)Take charge and lead (B) Support others from the backgroud",
        "Question 13 : How do you prefer to celebrate achievements? (A)Quietly reflect on your success (B) Throw a party or share it widely",
        "Question 14 : What type of environment helps you focus best? (A) A quiet, organized space (B) A lively, stimulating atmospher",
        "Question 15 : When faced with a challenge, do you: (A) Analyze and plan your way through it (B) Act quickly and improvise",
        "Question 16 : Which one do you prefer (A) Smoking e.g loud e.t.c(B) Alcohol e.g Tequila e.t.c",
        "Question 17 : How do you perfer to spend your vacations? (A)Relaxing and unwinding (B) Oblee",
        "Question 18 : How do you respond to change? (A)Prefer stability and predictability  (B)  Excited by new opportunities",
        "Question 19 : What do you value more in friendships? (A) Reliability and loyalty  (B) Fun and spontaneity",
        "Question 20 : Whats more important to you in life? (A) Achieving success and security  (B)Finding meaning and fulfillment  " 
                    
         
    
    };
    char[]responses = new char[20];// this perticular array store  user responeses 
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to MBTI personality Test!/!");
    System.out.println("plz kindy answer the following (20) questions, Just pick 'A' or 'B'.\n");

    for(int i = 0; i < questions.length; i++){
        System.out.println(questions[i]);
        char responese;
        while (true) {
            System.out.println("your answer (A or B):");
            responese = input.next().toUpperCase().charAt(0);
            if (responese == 'A'|| responese == 'B') {
                responses [i] = responese;
                break;

                
            } else{
                System.out.println("Invalid input. please enter 'A' or 'B' ");

          
            }
            
        }
        
        
    }
    String personality = determinePersonality(responses);
        System.out.println("\nYour MBTI Personality Type be: " + personality);
    
    
}
private static String determinePersonality(char[] responses) {
    // Example logic (customize this based on MBTI scoring)
    int a = 0;
    int b = 0;
        for (char response : responses) {
        if (response == 'A') {
        a++;

        
    }else if (response == 'B'){
        b++;
    }
        }
        if (a > b ){
            return "You be Extrovert";
}else if (b > a){
    return "You be Introvert";
}else{
    return " you are normal";
}
}
}
