import java.io.*;

public class FilesHandling {
    public static void main(String[] args) {
        String filename = "data.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write("This is an example of FileHandling concept.");
            writer.write("\nHello! Welcome to java.");
            writer.write("\nHey Everyone...");
            System.out.println("Data written successfully");
        } catch(Exception e){
            System.out.println("Error in writing the file: " + e);
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            System.out.println("Reading the file");
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(Exception e){
            System.out.println("Error in reading the file: " + e);
        }
    }
}
