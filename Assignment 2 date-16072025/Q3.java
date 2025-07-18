import java.util.Scanner;
class Q3{
  public static void main(String []args){
    /*
    3. How many tiles whose length and breadth 
    are 13 cm and 7 cm respectively are needed to 
    cover a rectangular region whose length and
     breadth are 520 cm and 140 cm? 
    */
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter length");
    int Tilelength=sc.nextInt();
    System.out.println("Enter breadth");
    int Tilebreadth=sc.nextInt();
    int tileArea=Tilelength*Tilebreadth;
    System.out.println("Enter Surface length:");
    int surlength=sc.nextInt();
    System.out.println("Enter Surface breadth:");
    int Surbreadth=sc.nextInt();
    int surArea=surlength*Surbreadth;
    int requireTiles=surArea/tileArea;
    System.out.println("Require Tiles are:"+requireTiles);

  }
}