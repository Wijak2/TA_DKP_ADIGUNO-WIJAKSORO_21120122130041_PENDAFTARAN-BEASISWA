/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import static package1.Frame2.TxtA_Data;

/**
 *
 * @author user
 */
public class method {
    private String kode = "1234";
 
    public boolean checkCredential() {
        if (kode.equals(Frame2.Txt_kode.getText())){
            return true;
        }
        return false;
    }
    
    public void verif() {
        boolean status = checkCredential();
        if(status == true) {
            String cetak = TxtA_Data.getText();
            try
            {
                FileWriter writer = new FileWriter ("Data Pendaftaran Beasiswa",true);
                writer.write(TxtA_Data.getText());
                writer.close();
            }
            catch (Exception e)
            {
            }
        } 
        else {
        }
    }
}
