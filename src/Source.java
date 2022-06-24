public class Source {
    public static void main(String[] args) {
        int [] n = new int[] {1,2,2};
        System.out.println(squareSum(n)==9);
    }
    public static int squareSum(int[] n)    {
        int result = 0;
        for (int a: n ) {
            result+=Math.pow(a,2);
        }
        return result;
    }
}
