package chapter_01.exercises;

/*
 * Practise 04 Creating a table ???
 */

public class Table {

  public static void main(String[] args) {
    String[][] data = {
      {"aa^2a^3a^4"}, 
      {"1 1   1 1 "}, 
      {"2 4  8  16 "}, 
      {"3 9   27 81 "}, 
      {"4 16 64  256 "}
    };

    // chatGpt helped here lmao 
    for (int i = 0; i < data.length; i++) {


      
      for (int j = 0; j < data[i].length; j++) {
          System.out.printf("%-20s ", data[i][j]);
      }
      System.out.println();
  }
  }
}
