import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;


public class Assignment1_Java_Part1 {

  public static void main(String[] args) {

    // Convert the string to a
    // byte array.
    String name = "Khadijah Ab Rahman\n";
    String address = "No.1, Jalan Pertiwi 1, Taman Pertiwi, 40260 Banting Selangor.\n";
    byte data1[] = name.getBytes();
    byte data2[] = address.getBytes();
    Path fileout = Paths.get("Khadijah.txt");

    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(fileout, CREATE))) {
    // write data line by line
       out.write(data1, 0, data1.length);
       out.write(data2, 0, data2.length);
    // close fileout
      out.close();
    }
    catch (IOException x) {
      System.err.println(x);
    }
  }
}
