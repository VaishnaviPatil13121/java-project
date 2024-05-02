class Staticvariable
{
    static int staticvar=5;
    public static void displyStaticvariable()
{
        System.out.println("Static Variable:"+ staticvar);
    }


    public static void main(String args[])
{
        System.out.println("Accessing Static Variable directly:"+Staticvariable.staticvar );

        displyStaticvariable();

        staticvar=10;
        displyStaticvariable();
    }
}