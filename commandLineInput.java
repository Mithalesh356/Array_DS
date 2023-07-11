public class commandLineInput {
    public static void main(String[] args) {
        // System.out.println("name="+args[0]);
        // System.out.println("Roll= "+args[1]);
        // System.out.println("Batch = "+args[2]);
        // 

        // find greatest

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);

        int greatest=(a>b && a>c )?a:(b>c)?b:c;

        System.out.println("Greatest = "+greatest);
    }
}
