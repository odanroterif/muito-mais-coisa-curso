package datatest;

import interacters.person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class connect_person 
{
     Connection conn;
    PreparedStatement state;
    
    public void sign_in(person people)
    {
            String insert_sql = "INSERT INTO tester (cpf,nome,mother_name,father_name,age,height) VALUES (?,?,?,?,?,?)";
            
            conn = new connection_class().conect();
            
        try
        {
            state = conn.prepareStatement(insert_sql);
            state.setString(1,people.getCpf());
            state.setString(2,people.getName()); 
            state.setString(3,people.getMom_name());
            state.setString(4,people.getDad_name());
            state.setInt(5,people.getAge());
            state.setFloat(6,people.getHeight());
            state.execute();
            state.close();
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e + " connect employer");
        }
    }
}
