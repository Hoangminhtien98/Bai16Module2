package BaiTap.Copyfiletext;

import java.io.*;

public class CopyFileToFile {
    public  static void copyFileUsingFileStreams(File source, File dest) throws Exception{
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }

    public static void main(String[] args) throws Exception {
        File source = new File("C:\\Users\\Admin\\Bai16\\src\\BaiTap\\Copyfiletext\\source.txt");
        File dest = new File("C:\\Users\\Admin\\Bai16\\src\\BaiTap\\Copyfiletext\\final.txt");

        long start = System.nanoTime();
        long end;
        copyFileUsingFileStreams(source, dest);
        System.out.println("Time taken  by FileStreams Copy = " + (System.nanoTime() - start));
    }
}
