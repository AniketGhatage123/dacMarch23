
 class question_20
{
    public static void main(String[] args)
    {

        long num=456785;
        String str=Long.toString(num);
        System.out.println("long value into String = "+str);

        Long l=Long.valueOf(num);
        System.out.println("long value into long instance = "+l);

        Long M=Long.valueOf(str);
        System.out.println("String instance into Long instance = "+M);

        System.out.println("long value into binary = "+Long.toBinaryString(num));
        System.out.println("long value into Octal = "+Long. toOctalString(num));
        System.out.println("long value into Hex = "+Long. toHexString(num));


        

    }

}