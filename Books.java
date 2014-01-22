package Collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Books extends Data {
	
public static void main (String args[]){
	
	Books NewBook = new Books();
	NewBook.getBookData();
	NewBook.reportStuff();
	NewBook.costOfBooks();
	
	}
	   
	   public  void getBookData(){
			try {
				String getBookQuery = "Select Book_Id, Title, Author_First_Name, Author_Last_Name,No_Of_Pages, Price, No_Of_Books FROM TextBook WHERE Book_Id = 1";
				Class.forName("com.mysql.jdbc.Driver");
			
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				conn = DriverManager.getConnection(Collection.DbConn.DB_URL,Collection.DbConn.USER,Collection.DbConn.PASS);
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(getBookQuery);
				while (rs.next())
					{
					//Fetch values
					book_id = rs.getInt("Book_Id");
					title = rs.getString("Title");
					author_first_name = rs.getString("Author_First_Name");
					author_last_name = rs.getString("Author_Last_Name");
					no_of_pages = rs.getInt("No_Of_Pages");
					price = rs.getDouble("Price");
					no_of_books = rs.getInt("No_Of_Books");
					
					}
					rs.close();
					conn.close();
					}catch (Exception e) {
						
					} finally {
						try{
					
						}
						catch(Exception e){
						}
						
		
					}
			
		}
		
	   
	

}
