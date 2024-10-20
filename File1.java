// Create the new File
import java.io.*;
class File1
{	
 public static void main(String args[]) throws Exception
 {              
  String str="";
  FileOutputStream out;
  PrintStream p;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//   out = new FileOutputStream(args[0]);	   // Write Mode   
   out = new FileOutputStream(args[0],true);	// Append Mode   
   p = new PrintStream(out);

   System.out.println("Enter lines of text. (Enter 'stop' to quit.)\n");

   while(!str.equals("stop"))
   {
    p.println (str);
    str = br.readLine();
   } 

   p.close();
   out.close();
 }
}
