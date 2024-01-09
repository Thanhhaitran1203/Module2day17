import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Serializable {
    public void writeData(List<Product> products,String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.close();
        fos.close();
    }
    public List<Product> readData(String fileName) throws IOException, ClassNotFoundException {
        List<Product> products = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
    public void addProductToFile(Product product,String fileName) throws IOException, ClassNotFoundException {
        List<Product> productList = readData(fileName);
        productList.add(product);
        writeData(productList,fileName);
    }
    public void printData(List<Product> productList){
        for (Product product:productList){
            System.out.println(product);
        }
    }
    public void printDataFormFile(String fileName){
        List<Product> productList = null;
        try {
            productList = readData(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Product product:productList){
            System.out.println(product);
        }
    }
    public void findProductFromFile(String fillName, String id) throws IOException, ClassNotFoundException {
        List<Product> productList = readData(fillName);
        for(Product product:productList){
            if (product.getId().equals(id)){
                System.out.println(product);
            }
        }
    }
}
