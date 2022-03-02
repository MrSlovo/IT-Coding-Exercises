public class Exercise4PrintChars {
    public static void main(String[] args) {
        
        
//        char char2 = 'z';
//        for (char char1 = 'A'; char1 <= char2; char1++) {
//            System.out.print(" " + char1);
//        }

//        char char1 = 'z';
//        for (char char2 = 'A'; char1 >= char2; char2++) {
//            System.out.print("   " + char2);
//        }
//        

        for (char charNum = 32; charNum < 127; charNum++) {
            System.out.println(charNum + " " + (int)charNum);
        }
                
    }
}