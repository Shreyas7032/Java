import java.util.*;
import java.sql.*;
class ass2b1
{
	public static void main(String args[])
	{
		Connection cn;
		PreparedStatement p;
		String sql;
		try
		{
				cn=DriverManager.getConnection("jdbc:mysql:///shreyas","root","root");
				do
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("\n\t1.Insert");
					System.out.println("\n\t2.Update");
					System.out.println("\n\t3.Delete");
					System.out.println("\n\t4.Search");
					System.out.println("\n\t1.View ALL");
					System.out.println("\n\t1.Exit");
					System.out.println("\n\t Enter Choice:");
					//Scanner sc=new Scanner(System.in);
					int ch=sc.nextInt();
					
					switch(ch)
					{
					case 1:
						System.out.println("Enter Roll No:");
						int roll=sc.nextInt();
						System.out.println("Enter Name:");
						int name=sc.nextInt();
						sql="insert into student1 values("+roll+",'"+name+"',"+marks+")";
						
						p=cn.prepareStatement(sql);
						p.execute();
						p.close();
						break;
				
			         }
	            }while(ch!=1);
	    }catch(Exception e){}
   }
}