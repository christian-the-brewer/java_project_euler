//Even Fibonacci Numbers
//Find sum of all even numbers in Fibonacci sequence whose values do net exceed four million

public class Main {
    public static void main(String[] args) {
        int sum = 0, penult = 1, previous = 1, currentTerm = 0, limit = 4_000_000;
        while (currentTerm <= limit) {
            currentTerm = (penult + previous);
            penult = previous;
            previous = currentTerm;
            sum += (currentTerm % 2 == 0) ? currentTerm : 0;
        }
        System.out.println(sum);
    }
}