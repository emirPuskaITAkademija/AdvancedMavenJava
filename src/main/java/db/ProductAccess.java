package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductAccess {
    public static void main(String[] args) throws Exception{
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sql_store","root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
        while (resultSet.next()){
            int productId = resultSet.getInt("product_id");
            String name = resultSet.getString("name");
            System.out.println("ProductId: " + productId+", Name: " + name);
        }
    }
}
