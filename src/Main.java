public class Main {
    public static void main(String[] args) {
        int[] sales = {500, 25, 150, 490, 725};

        SalesManager manager = new SalesManager(sales);
        System.out.println("max: " + manager.max());

    }
}

