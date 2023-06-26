
    import java.io.File;
    import java.io.FileWriter;
import java.io.IOException;
    import java.util.Scanner;

    public class prac10 {
        public static void main(String[] args) {
            File file=new File("output.txt");
            try {
                file.createNewFile();

            } catch (IOException e) {
                System.out.println("unable to create the file");
                throw new RuntimeException(e);
            }
            String fileName = "output.txt";
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the text you want in your file");
            String n=sc.nextLine();

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(n);
            } catch (IOException e) {
                System.out.println("file does not exist");
                e.printStackTrace();
            }
        }
    }


