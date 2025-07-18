 class Q5 {
    public static void main(String[] args) {
        int totalCost = 1600;
        int ratePerMeter = 25;
        int length = 20;

        int perimeter = totalCost / ratePerMeter;
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth of the park: " + breadth + " meters");
        System.out.println("Perimeter of the park: " + perimeter + " meters");
        System.out.println("Area of the field: " + area + " square meters");
    }
}
