package com.arindam;
import java.sql.*;
class TestConnection
{
	private Connection cn=null;
	private Statement st=null;
	private ResultSet rs=null;
	private PreparedStatement ps=null;
	private String select_sql="select * from product order by pname";
	private String insert_sql="insert into product values(?,?,?,?)";
	private String delete_sql="delete from product where pid=?";
	private String update_sql="update product set pname=?,pqty=?,price=? where pid=?";
	public void updateData()
	{ 
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstackjavadb","root","arindam");
		//establish the connection
		ps=cn.prepareStatement(update_sql);
		ps.setString(4,"P1");
		ps.setString(1,"REFRIGERATOR");
		ps.setInt(2,10);
		ps.setDouble(3,27000.00);
		ps.executeUpdate();//store the data
		
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

	public void deleteData()
	{ 
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstackjavadb","root","arindam");
		//establish the connection
		ps=cn.prepareStatement(delete_sql);
		ps.setString(1,"P3");
	
		ps.executeUpdate();//store the data
		
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void getData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstackjavadb","root","arindam");
		//establish the connection
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		st=cn.createStatement();//CREATE THE STATEMENT
		rs=st.executeQuery(select_sql);//EXECUTE THE QUERY AND STORE THE DATA INTO RESULTSET
		while(rs.next())
		{
			/*System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getDouble(4));*/
			System.out.println(rs.getString(1)+"===>"+rs.getString(2)+"===>"+rs.getInt(3)+"===>"+rs.getDouble(4));
		}
		
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void insertData()
	{ 
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstackjavadb","root","arindam");
		//establish the connection
		ps=cn.prepareStatement(insert_sql);
		ps.setString(1,"P3");
		ps.setString(2,"TAB");
		ps.setInt(3,1);
		ps.setDouble(4,22000.00);
		ps.executeUpdate();//store the data
		
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class MysqlJavaConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestConnection ts=new TestConnection();
      //ts.insertData();
      //ts.deleteData();
    //  ts.updateData();
      ts.getData();
	}

}
