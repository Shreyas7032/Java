// Read the File
import java.io.*;
class File2
{
 public static void main(String args[]) throws Exception
 {
  int i;
  FileInputStream fin = new FileInputStream(args[0]);

  while(true)
  { 
    i = fin.read();

    if(i == -1)     // EOF
     break;
	else
	 System.out.print(i);
   }

  fin.close();
 }
}
