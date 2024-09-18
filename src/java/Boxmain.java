public class Boxmain {


    public static void main(String args[]) {
            Box mybox1 = new Box(10, 20);
            Box mybox2 = new Box();
            Box square = new Box(7);

            double area;


            area = mybox1.area();
            System.out.println("area of mybox1 is " + area);


            area = mybox2.area();
            System.out.println("area of mybox2 is " + area);


            area = square.area();
            System.out.println("area of square is " + area);
        }
    }


