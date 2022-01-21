package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * <li>1. Povezati se na izvor podataka. Ostvariti konekciju na bazu
 *    MySQL
 *       Connection connection = DriverManager
 *       //username, password, url
 * <li>2. Slati upite ili query(pisati queries)... SQL
 *      String sqlQuery = "SELECT...";
 *      Statement statement = connnection.createStatement();
 * <li>3. Procesirati podatke ili ResultSet
 *      ResultSet resultSet =
 */
public class DemoDatabase {
    public static void main(String[] args) throws Exception {
        //1. konekcija .. username, password, url
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store","root", "root");
        //2. Pisati SQL statements
        String sqlQuery = "SELECT * FROM customers";
        Statement sqlStatement = connection.createStatement();
        //3. Procesirati rezultate upita
        ResultSet resultSet = sqlStatement.executeQuery(sqlQuery);
        while (resultSet.next()){
            //red -> iz tabele
            //koristit ću ili POSITION ili IME KOLONE7
            int customerId = resultSet.getInt("customer_id");
            String firstName = resultSet.getString(2);
            System.out.println("CustomerID: " + customerId+" , FIRST_NAME: " + firstName);
        }
    }
}
