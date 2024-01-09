import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Product> productList = new ArrayList<>();
        ProductManager productManager = new ProductManager();
//        System.out.println("Nhập tên file");
//        String fileName = sc.nextLine();
        String fileName = "product";
//        productManager.addProductToFile(inputData(),fileName);
        productManager.printDataFormFile("product");
        productManager.findProductFromFile("product","2");
    }
    public static Product inputData(){

        System.out.println("Id");
        String id = sc.nextLine();
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("Manufacture");
        String manufacture = sc.nextLine();
        System.out.println("describe");
        String describe = sc.nextLine();
        System.out.println("Price");
        int price = sc.nextInt();
        return new Product(id,name,manufacture,describe,price);
    }
}