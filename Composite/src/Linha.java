import java.util.*;

public class Linha {
  private List<Celula> celulas = new ArrayList<Celula>();
 
  public void print() {
    int celulasCount = celulas.size();

    int size = (celulas.size() * 17) + (celulasCount + 1);
    char[] line = new char[size];
    java.util.Arrays.fill(line, '-');
  
    System.out.println(" " + new String(line));

    for (Celula c : celulas) {
      c.print();
    }

    System.out.println(" |");
  }
 
  public void add(Celula c) {
    celulas.add(c);
  }
}
