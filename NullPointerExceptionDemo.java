public class NullPointerExceptionDemo{
public static void main(String args[]){
String str = null;
try{
int length = str.length();
System.out.println("Length of the String:"+length);
}catch(NullPointerException e){
System.out.println("Null Pointer Exception: String is null!");
}
}
}