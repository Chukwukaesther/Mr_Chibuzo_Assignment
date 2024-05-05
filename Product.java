import java.util.Scanner;
public class Product{
public static void main(String... args){
Product product = new Product();
product.productName();
};

Scanner scanner = new Scanner(System.in);
String productName;
public void productName(){
System.out.print("Enter product name: ");
productName = scanner.nextLine();
System.out.print(productName);



};
};