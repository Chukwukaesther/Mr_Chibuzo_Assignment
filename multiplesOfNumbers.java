public class multiplesOfNumbers{
public static void main(String...args){

int multiple = 0;

for(int i = 1; i <= 20000; i++){
if(i % 10 == 0){
System.out.println(i);

multiple += i;
}
}
System.out.print("The multiple 0f ten is " + multiple);
}
}   
