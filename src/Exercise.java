public class Exercise {
    public void isDivisibleBy3(int n) throws DividedByThreeException{
        if(n % 3 == 0){
            throw new DividedByThreeException("/ by three");
        }
        System.out.println(n + " is not divisible by three");
    }

    public void isDivisibleBy9(int n) throws  DividedByNineException{
        if(n % 9 == 0){
            throw new DividedByNineException(" / by nine");
        }
        System.out.println(n + "is not divisible by nine");
    }

    public void isDivisibleBy7(int n) throws DividedBySevenException{
        if(n % 7 == 0){
            throw new DividedBySevenException(" / by seven");
        }
        System.out.println(n + "is not divisible by seven");
    }
}
