/**
 * FizzBuzz
 * - 3で割れる数：Fizz
 * - 5で割れる数：Buzz
 * - 3と5で割れる数：FizzBuzz
 */
public class FizzBuzz {
    public String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
