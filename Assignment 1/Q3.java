class Q3{
  public static void main(String[] args) {
    /*
    3. How many tiles whose length and breadth are 13 cm and 7 cm respectively
     are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
    */ 
    // find the area of tile 
    int lengthoftile=13;
    int breadthoftile=7;
    int AreaOfTile=lengthoftile*breadthoftile;
    //System.out.println(AreaOfTile);

    //find the of surface
    int lengthOfArea=520;
    int BreadthOfArea=140;
    int AreaofSurface=lengthOfArea*BreadthOfArea;
    // System.out.println(AreaofSurface);

    //Find the number of tiles needed
    int NumberOfTiles=AreaofSurface/AreaOfTile;
    System.out.println("Needed Tiles are : "+NumberOfTiles);

  }
}