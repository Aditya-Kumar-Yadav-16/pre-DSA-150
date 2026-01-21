// Checking for Prime Numbers
// Difficulty: Easy
// Topics: Basic Programming, Number Theory

import java.util.*;
public class QuestionTwo{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int num =sc.nextInt();
    boolean isPrime=true;
    for (int i=2;i<=Math.sqrt(num);i++){
        if (num%i==0){
            isPrime=false;
            break;
        }
    }
    if (isPrime){
        System.out.println("prime number");
    }else{
        System.out.println("not a prime number");
    }

    //method two
    
    for (int n = 2; n < 100; n++) {
        boolean isPrimen = true;

        for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            isPrimen = false;
            break;
        }
    }

        if (isPrimen) {
        System.out.print(n + " ");
    }
}

}
}
