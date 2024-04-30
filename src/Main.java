public class Main {
    public static void main(String[] args) {
        Exercise nine = new Exercise();
        try{
            nine.isDivisibleBy3(9);
        }catch(DividedByThreeException e){
            e.printStackTrace();
        }

        try{
            nine.isDivisibleBy7(99);
        }catch(DividedBySevenException e){
            e.printStackTrace();
        }

        try{
            nine.isDivisibleBy9(99);
        }catch(DividedByNineException e){
            e.printStackTrace();
        }

        try {
            String text = null;
            text.length();
        } catch (ArithmeticException e) {
            System.out.println("Error: / by zero");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Out of Bounds Exception");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This is the part where it ends!!!");
        }
    }
}
