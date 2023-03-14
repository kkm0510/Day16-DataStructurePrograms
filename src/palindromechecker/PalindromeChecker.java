package palindromechecker;

public class PalindromeChecker {

    public static void main(String[] args) {
        Dequeue<Character> dequeue=new Dequeue<>();
        String s="racecar";
        for(int i=0; i<s.length(); i++){
            dequeue.addRear(s.charAt(i));
        }
        StringBuilder str=new StringBuilder();
        while(!dequeue.isEmpty()){
            str.append(dequeue.removeRear());
        }
        if(str.toString().equals(s)) System.out.println("is palindrome");
        else System.out.println("not palindrome");
    }
}
