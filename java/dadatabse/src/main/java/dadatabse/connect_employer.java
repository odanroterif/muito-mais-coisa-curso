package dadatabse;

import com.mysql.cj.xdevapi.PreparableStatement;
import data_transfer.employer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class connect_employer 
{
    Connection conn;
    PreparedStatement state;
    
    public void sign_in(employer emp)
    {
            String insert_sql = "INSERT INTO tab (nami,city) VALUES (?,?)";
            
            conn = new connection_class().conect();
            
        try
        {
            state = conn.prepareStatement(insert_sql);
            state.setString(1,emp.getName());
            state.setString(2,emp.getCity()); 
            state.execute();
            state.close();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e + " connect employer");
        }
    }
}
