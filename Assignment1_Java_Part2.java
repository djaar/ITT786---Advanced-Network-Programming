import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1_Java_Part2 {

  public static void main(String[] args) throws IOException  {

    // Read file khadijah.txt
    Path fileIn = Paths.get("Khadijah.txt");
    // Write (in binary mode) to khadijah.bin
    String fileout = "Khadijah.bin";
    // Read text file using Files.*
    byte[] buffer = Files.readAllBytes(fileIn);

    // Use stream for binary write
    FileOutputStream outputStream = new FileOutputStream(fileout);
    // Write from the buffer
    outputStream.write(buffer);
    // Close file
    outputStream.close();

    System.out.println("Wrote " + buffer.length + " bytes");
  }

}
