public class PowRecursion {

    //Recursive method to return exponent
    public int getExponent(int pow, int base){
        if(pow !=0){
            return(base * getExponent(--pow, base));
        }
        return 1;
    }

    public static void main(String[] args){
        PowRecursion obj = new PowRecursion();
        System.out.print(obj.getExponent(4, 5));
    }
}
