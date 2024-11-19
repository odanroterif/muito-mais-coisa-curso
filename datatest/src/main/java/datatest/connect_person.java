package datatest;

import interacters.person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.view_table;


public class connect_person 
{
    Connection conn;
    PreparedStatement state;
    ResultSet result;
    ArrayList<person> querryUser = new ArrayList<>();
    
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
    
    public ArrayList<person> viewer()
    {
        String sql_querry = "SELECT * FROM specimen.tester ORDER BY height";        
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_querry);
            result = state.executeQuery();            
            
            while (result.next()) 
            {                
                person user = new person();
                
                user.setCpf(result.getString("cpf"));
                user.setName(result.getString("nome"));     
                user.setMom_name(result.getString("mother_name"));
                user.setDad_name(result.getString("father_name"));
                user.setAge(result.getInt("age"));                
                user.setHeight(result.getFloat("height"));                                                                             
                
                querryUser.add(user);
            }
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " viewer");
        }
        return querryUser;
    }
    
    public void deleter(String cpf_id)
    {
        String sql_delete = "DELETE FROM specimen.tester WHERE cpf= ?";        
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_delete);                   
            state.setString(1, cpf_id);
            
            
            state.executeUpdate();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " deleter");
        }
    }     
}
