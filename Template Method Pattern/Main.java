import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Qual o tipo de vídeo: ");
    Scanner tipo = new Scanner(System.in);

    String decoder = tipo.nextLine();

    Player decode = null;

    if(decoder.indexOf("avi") >= 0){
      decode = new AviPlayer();
    }else if(decoder.indexOf("mkv") >= 0){
      decode = new MkvPlayer();
    }else if(decoder.indexOf("mp4") >= 0){
      decode = new Mp4Player();
    }else {
      System.out.println("Tipo de arquivo não suportado");
      return;
    }

    decode.playVideo();

  }
}
