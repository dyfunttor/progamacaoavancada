import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> alunos = new ArrayList<String>();

    /*adicionando sempre no final do ArrayList*/
    alunos.add("Ferrari");
    alunos.add("Corvete");
    alunos.add("BMW");
    System.out.println("Meus carros:"+alunos);

    /*adicionando em índices específicos*/
    alunos.add(0, "Mustang");
    alunos.add(1, "Subaru");
    System.out.println("Meus carros:"+alunos);
    
    /*Removendo elementos*/
    alunos.remove("Ferrari");
    alunos.remove("Corvete");
    System.out.println("Meus carros:"+alunos);

    /*Removendo element de um determinado índice*/
    alunos.remove(1);

    Collections.sort(alunos);

    System.out.println("Meus carros:" + alunos);
  }
}
