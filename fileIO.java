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
            pw.println("Hello everyone, \nthis is java file writer!");
            pw.close();
        } catch (IOException err) {
            err.printStackTrace();
        }

        fW = new File("pep.txt");
        try {
            BufferedReader bR = new BufferedReader(
                    new FileReader(fW));
            String data = bR.readLine();

            while(data != null) {
                System.out.println(data);
                data = bR.readLine();
            }
            bR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fB = new File("pep2.txt");
        FileOutputStream fOS;
        try {
            fOS = new FileOutputStream(fB);
            BufferedOutputStream bOS = new BufferedOutputStream(fOS);
            DataOutputStream dOS = new DataOutputStream(bOS);

            dOS.writeUTF("Hello World !");
            dOS.writeInt(108);
            dOS.writeFloat(103.56F);
            dOS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fIS;
        try {
            fIS = new FileInputStream(fB);
            BufferedInputStream bIS = new BufferedInputStream(fIS);
            DataInputStream dIS = new DataInputStream(bIS);

            System.out.println(dIS.readUTF());
            System.out.println(dIS.readInt());
            System.out.println(dIS.readFloat());
            dIS.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
