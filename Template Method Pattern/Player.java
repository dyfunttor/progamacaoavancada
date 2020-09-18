public abstract class Player
{
  Player()
  {

  }

  public void playVideo()
  {
    carregarArquivo();
    System.out.println(decodificar());
    iniciaPlayer();
  }

  protected void carregarArquivo()
  {
    for(int i = 0; i < 15; i++)
    {
      System.out.print(".");
    }
      System.out.print(" Arquivo carregado: ");
  }

  protected abstract String decodificar();

  protected void iniciaPlayer()
  {
    System.out.print("Player iniciado");
  }

}
