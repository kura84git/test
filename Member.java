import java.util.Random;

import member.Mem;
public class Member{
  public static void main(String[] args){
    String[][] result = new String[2][4];
    for(int x=0;x<2;x++){
      for(int y=0;y<4;y++){
        result[x][y] = " ";
      }
    }
    Mem mem = new Mem();
    String[] member = mem.member();
    for(int i=0;i<8;i++){
      while(true){
        Random ran = new Random();
        int tate = ran.nextInt(2);
        int yoko = ran.nextInt(4);
        if(result[tate][yoko].equals(" ")){
          result[tate][yoko] = member[i];
          break;
        }
      }
    }
    System.out.println("Team Kurahashi");
    for(int n=0;n<4;n++){
      System.out.print("["+result[0][n]+"] ");
    }
    System.out.println();
    System.out.println("Team Mori");
    for(int m=0;m<4;m++){
      System.out.print("["+result[1][m]+"] ");
    }
    System.out.println();
  }
}