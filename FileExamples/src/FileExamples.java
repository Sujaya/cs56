import java.io.*;

public class FileExamples {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;
      String[] filenames = {"input.txt", "output.txt"};
      int c;

      try {
         in = new FileReader(filenames[0]);
         out = new FileWriter(filenames[1]);
         
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         
      }
      finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
      
      
      File file = null;
      try {
          
          for(String filename:filenames) {
             /* create a new file object*/
             file = new File(filename);

             System.out.println(filename + " is a file: "+ file.isFile());
             System.out.println(filename + " is executable: "+ file.canExecute());
             System.out.println(filename + " is readable: "+ file.canRead());
             System.out.println("The length of " + filename + " is "+ file.length());
             System.out.println(filename + " was last modified at: "+ file.lastModified()+"\n");
          } 
       }catch(Exception e) {
          /* in case any I/O error occurs*/
          e.printStackTrace();
       }
   }
}
