class Instancevariable 
{
    int instancevar;
    public Instancevariable(int instancevalue)
{
        this.instancevar=instancevalue;
    }
    public void displyInstancevariable()
{
        System.out.println("Instance variable"+instancevar);
    }
        public static void main(String args[])
{
            Instancevariable instanceObj =new Instancevariable(20);

            instanceObj.displyInstancevariable();

            instanceObj.instancevar=30;

            instanceObj.displyInstancevariable();
      }

}
