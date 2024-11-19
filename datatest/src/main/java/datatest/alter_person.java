package datatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//https://prnt.sc/QtPl_UPqN6O2
//https://prnt.sc/AvB2hSQADyeL
//https://prnt.sc/sTfleszJWloS

public class alter_person 
{
    Connection conn;
    PreparedStatement state;
    ResultSet result;
    
    public void alter(String cpf_id,String rename)
    {
        String sql_update = "UPDATE specimen.tester SET nome = ? WHERE cpf = ?";        
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_update);                   
            state.setString(1, rename);
            state.setString(2, cpf_id);
            
            
            state.execute();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " alter");
        }
    }   
    
    public void alter(String cpf_id,String rename, int reage, float reheight)
    {
        String sql_update = "UPDATE specimen.tester SET nome = ?,age = ?, height = ? WHERE cpf = ?";        
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_update);                   
            state.setString(1, rename);
            state.setInt(2, reage);
            state.setFloat(3, reheight);
            state.setString(4, cpf_id);
            
            
            state.execute();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " alter");
        }
    }  
     
    public void alter(String cpf_id,String rename, int reage)
    {
        String sql_update = "UPDATE specimen.tester SET nome = ?,age = ? WHERE cpf = ?";        
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_update);                   
            state.setString(1, rename);
            state.setInt(2, reage);            
            state.setString(3, cpf_id);
            
            
            state.execute();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " alter");
        }
    }  
      
    public void alter(String cpf_id,String rename, float reheight)
    {
        String sql_update = "UPDATE specimen.tester SET nome = ?,height = ? WHERE cpf = ?";
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_update);                   
            state.setString(1, rename);            
            state.setFloat(2, reheight);
            state.setString(3, cpf_id);
            
            
            state.execute();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " alter");
        }
    }  
       
    public void alter(String cpf_id,int reage,float reheight)
    {
        String sql_update = "UPDATE specimen.tester SET age = ?, height = ? WHERE cpf = ?";
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_update);                               
            state.setInt(1, reage);
            state.setFloat(2, reheight);
            state.setString(3, cpf_id);
            
            
            state.execute();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " alter");
        }
    }  
        
    public void alter(String cpf_id,int reage)
    {
        String sql_update = "UPDATE specimen.tester SET age = ? WHERE cpf = ?";        
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_update);                               
            state.setInt(1, reage);            
            state.setString(2, cpf_id);
            
            
            state.execute();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " alter");
        }
    }  
    
    public void alter(String cpf_id,float reheight)
    {
        String sql_update = "UPDATE specimen.tester SET height = ? WHERE cpf = ?";        
        
        conn = new connection_class().conect();
        
        try 
        {
            state = conn.prepareStatement(sql_update);                               
            state.setFloat(1, reheight);       
            state.setString(2, cpf_id);
            
            
            state.execute();            
            state.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex + " alter");
        }
    }  
    
    public void verify_cpf(String cpf)
    {
        String sql_querry = "SELECT cpf FROM specimen.tester";    
        boolean verify = false;
        
        
        try 
        {
            conn = new connection_class().conect();
            state = conn.prepareStatement(sql_querry);
            result = state.executeQuery(); 
            
            while (result.next())
            {                                
                if (cpf.equals(result.getString("cpf")))
                {
                    verify = true;
                    
                    break;
                }
            }
               if (verify == false)
               {
                   JOptionPane.showMessageDialog(null,"CPF NULO OU INVÁLIDO: alteração de dados não foi efetuada e a janela será fechada, favor inserir cpf na próxima vez");                                       
               }
            state.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex + "verify");
        }
          
    }
}
