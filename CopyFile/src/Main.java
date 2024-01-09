import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file:");
        String sourcePath = sc.nextLine();
        System.out.println("Enter destination file");
        String destPath = sc.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
//            copyFileUsingJava7Files(sourceFile,destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy completed");
        }catch (IOException io){
            System.out.println("Can't copy that file");
            System.out.println(io.getMessage());
        }
    }
    private  static void copyFileUsingJava7Files(File source,File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private  static void copyFileUsingStream(File source,File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                System.out.println(buffer);
                System.out.println(length);
                os.write(buffer,0,length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            is.close();
            os.close();
        }
    }
}
//C:\Users\thanh\Downloads\BCT3M2-C1023H1-Trần.Thanh.Hải.docx
//        D:\CV\module2\day17\CopyFile\output.docx