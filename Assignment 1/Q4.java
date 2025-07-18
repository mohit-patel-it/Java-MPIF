class Q4{
    public static void main(String[] args) {
     int Lengthoftheplot = 300;

     int Breadthoftheplot = 150;

     int Tilingcost100SquareMeter = 6;

     int Area=Lengthoftheplot*Breadthoftheplot;
     System.out.println("Area of Plot : "+ Area);
     //6$ rate of 100 square meter 
     int areaInUnit=Area/100;
     System.out.println("Area in Unit ="+areaInUnit);
     int cost=areaInUnit*Tilingcost100SquareMeter;
     System.out.println("Total cost= "+cost);
        
    }
}