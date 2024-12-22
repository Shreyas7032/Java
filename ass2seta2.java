import java.sql.*;
class ass2seta2 
{
	public static void main(String args[]) throws Exception
	{
		Connection cn=DriverManager.getConnection("jdbc:mysql:///tejas","root","root");
		DatabaseMetaData d=cn.getMetaData();
		System.out.println("\n\tDatabse Prodeuct name="+d.getDatabaseProductName());
		System.out.println("\n\t Databse Prodeuct version="+d.getDatabaseProductVersion());
		System.out.println("\n\t Databse Driver name="+d.getDriverName());
		System.out.println("\n\t Databse Driver version="+d.getDriverVersion());
		System.out.println("\n\t Database user="+d.getUserName());
		ResultSet rs=d.getTables(null,null,null,new String[]{"TABLE"});
		System.out.println("\n\n\t Tables of the databases as below --->");
		while(rs.next())
		{
			String table=rs.getString("TABLE_NAME");
			System.out.println("\n\t Table name="+table);
		}
	}
}