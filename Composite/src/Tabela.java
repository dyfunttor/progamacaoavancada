import java.util.*;

public class Tabela {
  private List<Linha> linhas = new ArrayList<Linha>();
  
  public void add(Linha l) {
    linhas.add(l);
  }

  public void print() {
    for (Linha l : linhas) {
      l.print();
    }
  }
}
