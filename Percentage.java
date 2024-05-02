class Percentage
{

    public static void main(String [] args)
    {
        double per,total,Maths=90,OOP=95,FL=80,FCC=85,DMDW=90;

        System.out.println("Maths :"+Maths);
        System.out.println("OOP :"+ OOP);
        System.out.println("FL :"+FL);
        System.out.println("FCC : "+FCC);
        System.out.println("DMDW :"+DMDW);

        total=Maths+OOP+FL+FCC+DMDW;
        per=(total/5);

        System.out.println("Total :"+total);
        System.out.println("Persentage :"+per);



    }
    
}