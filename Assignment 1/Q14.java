class Q14 {
    /*14. The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field.*/
    public static void main(String[] args) {
        double d = 46, h1 = 13, h2 = 10;
        double area = 0.5 * d * (h1 + h2);
        System.out.println("Area of the field: " + area + " square meter");
    }
}
