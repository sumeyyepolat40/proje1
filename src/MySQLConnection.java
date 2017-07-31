import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang;
import java.sql.statement;
import java.util.logging.Logger;

public class MySQLConnection {
    Connection connection=null;
    static final string URL='jdbc:mysql://localhost:3306/proje';
    static final string USER='root';
    static final string PASS='12345'

   public static void main(String[]args)throws SQLException
       Utility get=new Utility();
    get.connect();
    get.list();

   MysqlConnection my=new MysqlConnection();
   my.database();
}
public void connect() throws SQLException{
    system.out.printIn(''-------------MySQL JDBC Connection Testing------'');
    try{
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e){
        system.out.printIn("where is your MySQL JDBC Driver?");
        Logger anonymouslogger =logger.getAnonmymouslogger('error'+e);
        return;0}

    system.out.printIn('MysQL JDBC Driver Registered!');
            try {
            connection = DriverManager
            .getcollection("jdbc:mysql://localhost:3306/proje", "root""12345");
            }catch(SQLException e) {
                system.out.printIn('connection Failed! Check output console');
                return;
            }
            if (connection!=null) {
                system.out..printIn('You made it,take control your databuse now!')
            }
            else {
                system.out.printIn('Failed to make connection!');
            }
            }
            public void database()throws SQLException{
    connect();
    StringBuffer sql=new StringBuffer('SELECT prodouctsİd,name1,afeature,price,subcategory from prodoucts');
    Statement smt=connection.createStatement();
    ResultSet rs=smt.executeQuery(String.valueOf(sql));


    while (rs.next()){
        İnt id=rs.getInt('productsİd');
        String name1=rs.getString('name1');
        String afeature=rs.getString('afeature');
        İnt price=rs.getInt('price');
        İnt subcategory=rs.getInt('subcategory');


        system.out.print('productsİd:' +id);
        system.out.print('name1' +name1);
        system.out.print('afeature' +afeature);
        system.out.print('price' +price);
        system.out.print('subcategory' subcategory);


    }
            }