// &&, ||, ! are logical operators
// && Returns true if both the operands are true
// || Returns true if at least one of the operands is true
// ! Returns true if the operand is false
public class LogicalOperators {
    public static void main(String[] args) {
       int a = 1 + (int)(Math.random() * 1000);
       System.out.println("a = " + a);

       if(a%3 == 0 && a%5 == 0){
           System.out.println("a is divisible by both 3 and 5");
       } else if(a%3 == 0 || a%5 == 0){
           System.out.println("a is divisible by either 3 or 5");
       } else if(!(a%3 == 0) && !(a%5 == 0)){
           System.out.println("a is not divisible by either 3 or 5");
       }
    }
}
