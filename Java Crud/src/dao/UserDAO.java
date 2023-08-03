package dao;
import com.mysql.jdbc.PrepareStatement;
import connect.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDAO {

    public Boolean save(User user){
       String sql = "INSERT INTO user(name, age) VALUES(?, ?)";

       Connection conn = null;
        PreparedStatement pstmt = null;

        int exec = 0;
        Boolean msg = false;

        try{

            conn = ConnectionFactory.createConnectionToMySql();

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1,user.getName());
            pstmt.setInt(2,user.getAge());

            exec = pstmt.executeUpdate();

            if(exec > 0){
                msg = true;
            } else {
                msg = false;
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }
                if(conn != null){
                    conn.close();
                }
            } catch(Exception e){
                e.printStackTrace();
            }

        }

        return msg;
    }
}
