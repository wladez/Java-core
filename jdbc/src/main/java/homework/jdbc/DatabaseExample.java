package homework.jdbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class DatabaseExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
        try(Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement()) {

            st.execute(initDatabase());

            printStudentTable(st);

            st.executeUpdate(
                    "UPDATE Student SET telephone='+79999999999' WHERE first_name='Ivan'");
            st.executeUpdate(
                    "UPDATE Student SET first_name='Vlad' WHERE last_name='Petrov'");
            System.out.println("\nAfter update\n");
            printStudentTable(st);

            System.out.println("\nSingle SELECT\n");
            try(ResultSet rs = st.executeQuery(
                    "SELECT id,first_name, last_name, dob, telephone FROM Student WHERE last_name='Igorev'")) {
                while (rs.next()) {
                    System.out.printf("%d %s %s %tD %s%n",
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getDate("dob"),
                            rs.getString("telephone"));
                }
            }

            st.executeUpdate("INSERT INTO Student (first_name, last_name, dob, telephone) " +
                    "VALUES ('Vladimir', 'Vladimrov', '1980-05-16', '+79114657891')");
            System.out.println("\nAfter INSERT\n");
            printStudentTable(st);

            System.out.println("\nBefore deleting Temp table\n");
            printTempTable(st);
            st.executeUpdate("DROP TABLE Temp");
            System.out.println("\nAfter deleting Temp table\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static String initDatabase() {
        StringBuilder initSql = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new FileReader("./jdbc/src/main/resources/h2.sql")
        )) {
            String line;
            while ((line = reader.readLine()) != null)
                initSql.append(line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initSql.toString();
    }

    private static void printStudentTable(Statement st) throws SQLException {
        try (ResultSet rs = st.executeQuery("SELECT id, first_name, last_name, dob, telephone FROM Student")) {
            while (rs.next()) {
                System.out.printf("%d %s %s %tD %s%n",
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getDate("dob"),
                        rs.getString("telephone"));
            }
        }
    }

    private static void printTempTable(Statement st) throws SQLException {
        try (ResultSet rs = st.executeQuery("SELECT id,name FROM Temp")) {
            while (rs.next()) {
                System.out.printf("%d %s%n",
                        rs.getInt("id"),
                        rs.getString("name"));
            }
        }
    }
}
