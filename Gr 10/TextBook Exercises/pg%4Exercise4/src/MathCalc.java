public class MathCalc {
    public static void main (String[] args) {
        double question1;
        double question2;
        double question3;
        
        question1 = (double) Math.sqrt(25.7) - Math.pow(2.2, 2);
        System.out.println("Question 1: " + question1);
        
        question2 = (double) (Math.sqrt(Math.pow(12, 2) + Math.pow(5, 2))) / 13;
        System.out.println("Question 2: " + question2);
        
        question3 = (double) Math.pow(56.75, (1D/3D)) * (Math.sqrt(100));
        System.out.println("Question 3: " + question3);
        
    }
    
}
