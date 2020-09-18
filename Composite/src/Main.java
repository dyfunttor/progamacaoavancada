public class Main {
  public static void main(String[] args) {
    Linha l1 = new Linha();
    l1.add(new Celula("João Paulo"));
    l1.add(new Celula("Ana Clara"));
    l1.add(new Celula("Sílvio"));

    Linha l2 = new Linha();
    l2.add(new Celula("8.3"));
    l2.add(new Celula("9.7"));
    l2.add(new Celula("8"));

    Tabela tab = new Tabela();
    tab.add(l1);
    tab.add(l2);
    tab.print();
  }
}
