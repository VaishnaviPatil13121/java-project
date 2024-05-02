public class NumberFormatExceptionDemo{
public static void main(String args[]){
try {
String str = "Hello";
int num = Integer.parseInt(str);
System.out.println("Parsed number:"+num);
} catch (NumberFormatException e){
System.out.println("NumberFormatException occured:"+e.getMessage());
e.printStackTrace();
}
}
}