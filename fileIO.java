import java.io.*;

public class fileIO {
    public static void main(String[] args) {
        File f = new File("pep.txt");

        try{
            if(f.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File not created");
            }
        } catch (IOException err) {
            err.printStackTrace();
        }

        File fD = new File("/");
        if(fD.isDirectory()) {
            File[] items = fD.listFiles();
            for(File x : items) System.out.println(x);
        } else {
            System.out.println("not a directory");
        }

        File fW = new File("pep.txt");

        try {
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(fW)));
            pw.println("Hello everyone, this is java file writer!");
            pw.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
