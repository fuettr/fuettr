/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diplomarbeit_projekt.gui;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

/**
 *
 * @author Florian
 */
public class SystemInfo extends javax.swing.JDialog
{

    /**
     * Creates new form GeraeteInfo
     */
    public SystemInfo(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
               
        initComponents();
         
        MongoClient mongodb = new MongoClient();
        MongoDatabase database = mongodb.getDatabase("katzenfuetterungsanlage");  
        MongoCollection<Document> collInfo = database.getCollection("data_info");
        
        Document infoDoc = collInfo.find(eq("identifier", "Info")).first();
        String strInfo = infoDoc.toJson();
        
        Logger.getLogger("Info imported").log(Level.FINE, "Info imported");
        
        JsonReader jsonReader = Json.createReader(new StringReader(strInfo));
        JsonObject obj = jsonReader.readObject();
        jsonReader.close();

        String internal = obj.getString("internal");
        String serialnumber = obj.getString("serialnumber");
        String wlanState = obj.getString("wlanState");
        
        String versionJson = null, ipJson = null;
        
        try
        {
            URL urlVersion = new URL("http://localhost:17325/api/version");
            URL urlIp = new URL("http://localhost:17325/api/ip");

            URLConnection conVersion = urlVersion.openConnection();
            URLConnection conIp = urlIp.openConnection();
            
            BufferedReader bReaderVersion = new BufferedReader(new InputStreamReader(conVersion.getInputStream())); 
            BufferedReader bReaderIp = new BufferedReader(new InputStreamReader(conIp.getInputStream())); 
            
            versionJson = bReaderVersion.readLine();
            ipJson = bReaderIp.readLine();
        }
        catch (Exception ex)
        {
            Logger.getLogger(Update.UpdateWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jsonReader = Json.createReader(new StringReader(versionJson));
        JsonObject versionObj = jsonReader.readObject();
        jsonReader.close();
        
        String version = versionObj.getString("version");
        
        jsonReader = Json.createReader(new StringReader(ipJson));
        JsonObject ipObj = jsonReader.readObject();
        jsonReader.close();
        
        String ip = ipObj.getString("ip");

        lbInternal.setText(internal);       
        lbSerialnumber.setText(serialnumber);
        lbVersion.setText(version);
        lbWlanState.setText(wlanState);
        lbIpAddress.setText(ip);
        
        mongodb.close();
        
        setLocationRelativeTo(parent);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        pButton = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btSchließen = new javax.swing.JButton();
        pInfo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbSerialnumber = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbInternal = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbWlanState = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbIpAddress = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Geräteinformation");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 0, 0, 0));
        pButton.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        btSchließen.setText("Schließen");
        btSchließen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onSchließen(evt);
            }
        });
        jPanel5.add(btSchließen);

        jPanel4.add(jPanel5);

        pButton.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(pButton, java.awt.BorderLayout.SOUTH);

        pInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pInfo.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 16, 32));

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 4, 4));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setText("Seriennummer:");
        jPanel6.add(jLabel1);

        lbSerialnumber.setText("<seriennummer>");
        jPanel6.add(lbSerialnumber);

        jPanel2.add(jPanel6);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel3.setText("interner Rechner: ");
        jPanel8.add(jLabel3);

        lbInternal.setText("<raspberry_x>");
        jPanel8.add(lbInternal);

        jPanel2.add(jPanel8);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel5.setText("WLAN-Status: ");
        jPanel7.add(jLabel5);

        lbWlanState.setText("<verbunden>");
        jPanel7.add(lbWlanState);

        jPanel2.add(jPanel7);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel7.setText("IP-Adresse: ");
        jPanel9.add(jLabel7);

        lbIpAddress.setText("<10.0.0.10>");
        jPanel9.add(lbIpAddress);

        jPanel2.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel9.setText("Version: ");
        jPanel10.add(jLabel9);

        lbVersion.setText("<versionsnummer>");
        jPanel10.add(lbVersion);

        jPanel2.add(jPanel10);

        jPanel3.add(jPanel2);

        pInfo.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(pInfo, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onSchließen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onSchließen
    {//GEN-HEADEREND:event_onSchließen
        dispose();
    }//GEN-LAST:event_onSchließen

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                SystemInfo dialog = new SystemInfo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSchließen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbInternal;
    private javax.swing.JLabel lbIpAddress;
    private javax.swing.JLabel lbSerialnumber;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JLabel lbWlanState;
    private javax.swing.JPanel pButton;
    private javax.swing.JPanel pInfo;
    // End of variables declaration//GEN-END:variables

//private void version()
//{
//    StreamReader streamReader = new StreamReader(); 
//    String string_json = streamReader.einlesen("D:\\Schule\\Diplomarbeit\\Git\\fuettr_prototype\\Java_Application\\Java\\src\\data\\version.json");
//    
//    System.out.format("%s",string_json);
//}
//    
}
