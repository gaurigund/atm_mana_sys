/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pharmacy_manage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author GAURI GUND
 */
public class Pharmacy_manage {
    static Connection con;
    public static Connection getConnection(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/pharmacy_manag","root","");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_manage?useSSL=false","root","gauri1610");
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        return con;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
