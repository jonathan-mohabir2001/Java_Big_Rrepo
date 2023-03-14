package chapter_01.exercises;

/*
 * Writing a program to compute expression 
 */

public class ComputeExpression {

  // in order to solve this question evaluate the expressions as their own and
  // then store it as a double

  // both expressions declared and will follow BEDMAS

  public static void main(String[] args) {

    double result1 = 7.5 * 6.5 - 4.5 * 3;
    double result2 = 47.5 - 5.5;

    System.out.println(result1);
    System.out.println(result2);

    // print the first results

    double computationResult = result1 / result2;
    // store the variable with the operation

    System.out.println(computationResult);

  }

}
