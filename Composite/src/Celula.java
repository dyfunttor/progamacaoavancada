import java.util.*;

public class Celula {
  private String content;
  
  public Celula(String content) {
    this.content = content;
  }
 
  public void print() {
    String printContent = content;
    
    if (printContent.length() > 15) {
      printContent.substring(0, 15);
    }
    else {
      int emptySpace = 15 - printContent.length();
      
      for (int i = 0; i < emptySpace; i++) {
        printContent += " ";
      }
    }

    System.out.print(" | " + printContent);
  }
}
