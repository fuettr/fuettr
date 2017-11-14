/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diplomarbeit_projekt.gui;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import diplomarbeit_projekt.methods.NaechsteFuetterung;
import diplomarbeit_projekt.methods.StreamReader;

/**
 *
 * @author Florian
 */
public class Hauptfenster extends javax.swing.JFrame
{

    boolean zustand = false;
    boolean zeitenVeraendert = true;
    String uhrzeit, zeit1, zeit2, zeit3, zeit4;
    int letzteFuetterung = 0;
    String naechsteFuetterungUm, naechsteFuetterungIn;

    /**
     * Creates new form Hauptfenster
     */
    public Hauptfenster()
    {
        //GraphicsDevice d = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//        if (d.isFullScreenSupported())
//        {
//            this.setUndecorated(true);
//            this.setResizable(false);
//            d.setFullScreenWindow(this);
//        } else
//        {
            this.setSize(800, 480);
            this.setVisible(true);
//        }
        initComponents();

        if (zustand == false)
        {
            lbZustand.setText("Aus");
        }

        UhrzeitWorker uWorker = new UhrzeitWorker();
        uWorker.execute();

        DatumWorker dWorker = new DatumWorker();
        dWorker.execute();

        ZeitenAnzeigenWorker zaWorker = new ZeitenAnzeigenWorker();
        zaWorker.execute();

        lbLetzteFuetterung.setText("ausstehend");

        AutomatischeFuetterungAblaufWorker automatischeFuetterungAblaufWorker = new AutomatischeFuetterungAblaufWorker();
        automatischeFuetterungAblaufWorker.execute();

        NaechsteFuetterungWorker naechsteFuetterungWorker = new NaechsteFuetterungWorker();
        naechsteFuetterungWorker.execute();

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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pEast = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbZeit1Beschreibung = new javax.swing.JLabel();
        lbZeit2Beschreibung = new javax.swing.JLabel();
        lbZeit3Beschreibung = new javax.swing.JLabel();
        lbZeit4Beschreibung = new javax.swing.JLabel();
        lbZeit1 = new javax.swing.JLabel();
        lbZeit2 = new javax.swing.JLabel();
        lbZeit3 = new javax.swing.JLabel();
        lbZeit4 = new javax.swing.JLabel();
        pCenter = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        CenterSouth = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        CenterNorth = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbLetzteFuetterung = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lbNaechsteFuetterungUm = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lbNaechsteFuetterungIn = new javax.swing.JLabel();
        pSouth = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbZustand = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbUhrzeit = new javax.swing.JLabel();
        lbDatum = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        raspberry = new javax.swing.JMenu();
        neustarten = new javax.swing.JMenuItem();
        herunterfahren = new javax.swing.JMenuItem();
        fuetterung = new javax.swing.JMenu();
        ein_aus = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        fuetterungszeiten_verwalten = new javax.swing.JMenuItem();
        steuerung = new javax.swing.JMenu();
        manuelleSteuerung = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        positionsinformationen = new javax.swing.JMenuItem();
        einstellungen = new javax.swing.JMenu();
        update = new javax.swing.JMenuItem();
        benutzer_anlegen = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        geraeteinformation = new javax.swing.JMenuItem();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Letzte erfolgte Fütterung: ");
        jPanel15.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("<Uhrzeit>");
        jPanel15.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nächste Fütterung erfolgt in: ");
        jPanel16.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("<Stunden:Minuten>");
        jPanel16.add(jLabel13);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Katzenfütterungsanlage");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pEast.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 4, 0, 0));
        pEast.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Fütterungszeiten");
        jPanel8.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbZeit1Beschreibung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit1Beschreibung.setText("Zeit 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit1Beschreibung, gridBagConstraints);

        lbZeit2Beschreibung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit2Beschreibung.setText("Zeit 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit2Beschreibung, gridBagConstraints);

        lbZeit3Beschreibung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit3Beschreibung.setText("Zeit 3:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit3Beschreibung, gridBagConstraints);

        lbZeit4Beschreibung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit4Beschreibung.setText("Zeit 4:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit4Beschreibung, gridBagConstraints);

        lbZeit1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit1.setText("<Zeit>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit1, gridBagConstraints);

        lbZeit2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit2.setText("<Zeit>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit2, gridBagConstraints);

        lbZeit3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit3.setText("<Zeit>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit3, gridBagConstraints);

        lbZeit4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbZeit4.setText("<Zeit>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel9.add(lbZeit4, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        pEast.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel1.add(pEast, java.awt.BorderLayout.EAST);

        pCenter.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());

        CenterSouth.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 0, 0, 0));
        CenterSouth.setLayout(new java.awt.BorderLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Fehler und Warnungen");
        jPanel14.add(jLabel14, java.awt.BorderLayout.NORTH);

        jList1.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Fehler 1", "Fehler 2", "Warnung 1", "Warnung 2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel14.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel14, java.awt.BorderLayout.CENTER);

        CenterSouth.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel10.add(CenterSouth, java.awt.BorderLayout.SOUTH);

        CenterNorth.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 4, 1));
        CenterNorth.setLayout(new java.awt.BorderLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        jPanel13.setLayout(new java.awt.GridLayout(0, 1, 0, 8));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Letzte erfolgte Fütterung: ");
        jPanel17.add(jLabel15);

        lbLetzteFuetterung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLetzteFuetterung.setText("<Uhrzeit>");
        jPanel17.add(lbLetzteFuetterung);

        jPanel13.add(jPanel17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Nächste Fütterung erfolgt um: ");
        jPanel18.add(jLabel17);

        lbNaechsteFuetterungUm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNaechsteFuetterungUm.setText("<Uhrzeit>");
        jPanel18.add(lbNaechsteFuetterungUm);

        jPanel13.add(jPanel18);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Nächste Fütterung erfolgt in: ");
        jPanel19.add(jLabel18);

        lbNaechsteFuetterungIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNaechsteFuetterungIn.setText("<Stunden:Minuten>");
        jPanel19.add(lbNaechsteFuetterungIn);

        jPanel13.add(jPanel19);

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        CenterNorth.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel10.add(CenterNorth, java.awt.BorderLayout.CENTER);

        pCenter.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel1.add(pCenter, java.awt.BorderLayout.CENTER);

        pSouth.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 0, 0, 0));
        pSouth.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Maschine: ");
        jPanel5.add(jLabel1);

        lbZustand.setText("Ein/Aus");
        jPanel5.add(lbZustand);

        jPanel3.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        lbUhrzeit.setText("Uhrzeit");
        jPanel4.add(lbUhrzeit);

        lbDatum.setText("Datum");
        jPanel4.add(lbDatum);

        jPanel3.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pSouth.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(pSouth, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        raspberry.setText("Raspberry");

        neustarten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diplomarbeit_projekt/icons/restartIcon16x16.png"))); // NOI18N
        neustarten.setText("Neustarten");
        neustarten.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onNeustarten(evt);
            }
        });
        raspberry.add(neustarten);

        herunterfahren.setText("Herunterfahren");
        herunterfahren.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onHerunterfahren(evt);
            }
        });
        raspberry.add(herunterfahren);

        jMenuBar1.add(raspberry);

        fuetterung.setText("Fütterung");
        fuetterung.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onFütterungszeitenVerwalten(evt);
            }
        });

        ein_aus.setText("Ein-/Ausschalten");
        ein_aus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onEinAusSchalten(evt);
            }
        });
        fuetterung.add(ein_aus);
        fuetterung.add(jSeparator1);

        fuetterungszeiten_verwalten.setText("Fütterungszeiten verwalten");
        fuetterungszeiten_verwalten.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onFuetterungszeitenVerwalten(evt);
            }
        });
        fuetterung.add(fuetterungszeiten_verwalten);

        jMenuBar1.add(fuetterung);

        steuerung.setText("Steuerung");

        manuelleSteuerung.setText("manuelle Steuerung");
        manuelleSteuerung.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onManuelleSteuerung(evt);
            }
        });
        steuerung.add(manuelleSteuerung);
        steuerung.add(jSeparator3);

        positionsinformationen.setText("Positionsinformationen");
        positionsinformationen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onPositionsinformation(evt);
            }
        });
        steuerung.add(positionsinformationen);

        jMenuBar1.add(steuerung);

        einstellungen.setText("Einstellungen");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onUpdate(evt);
            }
        });
        einstellungen.add(update);

        benutzer_anlegen.setText("Benutzer anlegen");
        benutzer_anlegen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onBenutzerAnlegen(evt);
            }
        });
        einstellungen.add(benutzer_anlegen);
        einstellungen.add(jSeparator2);

        geraeteinformation.setText("Geräteinformation");
        geraeteinformation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onGeraeteinformation(evt);
            }
        });
        einstellungen.add(geraeteinformation);

        jMenuBar1.add(einstellungen);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onEinAusSchalten(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onEinAusSchalten
    {//GEN-HEADEREND:event_onEinAusSchalten
        if (zustand != true)
        {
            zustand = true;
            lbZustand.setText("Ein");
        } else
        {
            zustand = false;
            lbZustand.setText("Aus");
        }
    }//GEN-LAST:event_onEinAusSchalten

    private void onFütterungszeitenVerwalten(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onFütterungszeitenVerwalten
    {//GEN-HEADEREND:event_onFütterungszeitenVerwalten
        //Delete
    }//GEN-LAST:event_onFütterungszeitenVerwalten

    private void onManuelleSteuerung(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onManuelleSteuerung
    {//GEN-HEADEREND:event_onManuelleSteuerung
        if (zustand == true)
        {
            if (JOptionPane.showConfirmDialog(this, "Um fortzufahren müssen Sie die automatische Fütterung deaktivieren. \n Wollen sie diese deaktivieren? ",
                    "Hinweis", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                zustand = false;
                lbZustand.setText("Aus");

                final ManuelleSteuerung strDlg = new ManuelleSteuerung(this, true);
                strDlg.setVisible(true);
            }
        } else
        {
            final ManuelleSteuerung strDlg = new ManuelleSteuerung(this, true);
            strDlg.setVisible(true);
        }
    }//GEN-LAST:event_onManuelleSteuerung

    private void onPositionsinformation(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onPositionsinformation
    {//GEN-HEADEREND:event_onPositionsinformation
        final Positionsinformation posDlg = new Positionsinformation(this, true);
        posDlg.setVisible(true);
    }//GEN-LAST:event_onPositionsinformation

    private void onUpdate(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onUpdate
    {//GEN-HEADEREND:event_onUpdate
        final Update infoDlg = new Update(this, true);
        infoDlg.setVisible(true);                        
    }//GEN-LAST:event_onUpdate

    private void onFuetterungszeitenVerwalten(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onFuetterungszeitenVerwalten
    {//GEN-HEADEREND:event_onFuetterungszeitenVerwalten
        //Objektobjekt erzeugen ==> Dialog ist MODAL! (modal ... blockieren des Elternfensters) 
        final ZeitenManagement zeitenDlg = new ZeitenManagement(this, true); // true = modal (blockiert das Hauptfenster) , false = nicht modal 
        zeitenDlg.setVisible(true); //Dialog sichtbar setzen
        //An dieser Stelle "blockiert" das Programm, solange der Dialog geöffnet ist!   

        if (zeitenDlg.zeitenVeraendert())
        {
            zeitenVeraendert = true;
            ZeitenAnzeigenWorker zaWorker = new ZeitenAnzeigenWorker();
            zaWorker.execute();
        }
    }//GEN-LAST:event_onFuetterungszeitenVerwalten

    private void onGeraeteinformation(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onGeraeteinformation
    {//GEN-HEADEREND:event_onGeraeteinformation
        final GeraeteInfo infoDlg = new GeraeteInfo(this, true);
        infoDlg.setVisible(true);
    }//GEN-LAST:event_onGeraeteinformation

    private void onBenutzerAnlegen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBenutzerAnlegen
    {//GEN-HEADEREND:event_onBenutzerAnlegen
        final BenutzerAnlegen infoDlg = new BenutzerAnlegen(this, true);
        infoDlg.setVisible(true);
    }//GEN-LAST:event_onBenutzerAnlegen

    private void onNeustarten(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onNeustarten
    {//GEN-HEADEREND:event_onNeustarten
        // TODO add your handling code here:
    }//GEN-LAST:event_onNeustarten

    private void onHerunterfahren(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onHerunterfahren
    {//GEN-HEADEREND:event_onHerunterfahren
        if (JOptionPane.showConfirmDialog(this, "Raspberry wirklick herunterfahren?",
                "Hinweis", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            //TODO
            
            dispose();
        }
    }//GEN-LAST:event_onHerunterfahren

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
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                Hauptfenster frame = new Hauptfenster();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterNorth;
    private javax.swing.JPanel CenterSouth;
    private javax.swing.JMenuItem benutzer_anlegen;
    private javax.swing.JMenuItem ein_aus;
    private javax.swing.JMenu einstellungen;
    private javax.swing.JMenu fuetterung;
    private javax.swing.JMenuItem fuetterungszeiten_verwalten;
    private javax.swing.JMenuItem geraeteinformation;
    private javax.swing.JMenuItem herunterfahren;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lbDatum;
    private javax.swing.JLabel lbLetzteFuetterung;
    private javax.swing.JLabel lbNaechsteFuetterungIn;
    private javax.swing.JLabel lbNaechsteFuetterungUm;
    private javax.swing.JLabel lbUhrzeit;
    private javax.swing.JLabel lbZeit1;
    private javax.swing.JLabel lbZeit1Beschreibung;
    private javax.swing.JLabel lbZeit2;
    private javax.swing.JLabel lbZeit2Beschreibung;
    private javax.swing.JLabel lbZeit3;
    private javax.swing.JLabel lbZeit3Beschreibung;
    private javax.swing.JLabel lbZeit4;
    private javax.swing.JLabel lbZeit4Beschreibung;
    private javax.swing.JLabel lbZustand;
    private javax.swing.JMenuItem manuelleSteuerung;
    private javax.swing.JMenuItem neustarten;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pEast;
    private javax.swing.JPanel pSouth;
    private javax.swing.JMenuItem positionsinformationen;
    private javax.swing.JMenu raspberry;
    private javax.swing.JMenu steuerung;
    private javax.swing.JMenuItem update;
    // End of variables declaration//GEN-END:variables

    private class UhrzeitWorker extends SwingWorker<Object, String>
    {

        @Override
        protected Object doInBackground() throws Exception
        {
            while (true)
            {
                uhrzeit = String.format("%1$tH:%1$tM", new Date(System.currentTimeMillis()));

                publish(uhrzeit); // gibt Text an process weiter

                TimeUnit.MILLISECONDS.sleep(500);
            }
        }

        @Override
        protected void process(List<String> chunks)
        {
            lbUhrzeit.setText(uhrzeit);
        }
    }

    private class DatumWorker extends SwingWorker<Object, String>
    {

        String datum;

        @Override
        protected Object doInBackground() throws Exception
        {
            while (true)
            {
                datum = String.format("%1$td.%1$tm.%1$tY", new Date(System.currentTimeMillis()));

                publish(datum); // gibt Text an process weiter

                TimeUnit.MILLISECONDS.sleep(500);
            }
        }

        @Override
        protected void process(List<String> chunks)
        {
            lbDatum.setText(datum);
        }
    }

    private class ZeitenAnzeigenWorker extends SwingWorker<Object, String>
    {

        String string;

        //ZeitenManagement zeitenManagement = new ZeitenManagement(this, true);
        @Override
        protected Object doInBackground() throws Exception
        {
            while (true)
            {
                if (zeitenVeraendert == true /*|| zeitenManagement.ZeitenVeraendert() == true*/)
                {
                    StreamReader streamReader = new StreamReader();
                    //string = streamReader.einlesen("D:\\Schule\\Diplomarbeit\\Git\\fuettr_prototype\\Java_Application\\Java\\src\\data\\testZeit.txt", false);
                    string = streamReader.einlesen("data/testZeit.txt",false);
                    
                    publish(string);

                    zeitenVeraendert = false;
                }
            }
        }

        @Override
        protected void process(List<String> chunks)
        {
            System.out.format("Hauptfenster - ZeitenAnzeigeWorker: %s", string);

            String[] token = string.split(";");
            zeit1 = token[0];
            zeit2 = token[1];
            zeit3 = token[2];
            zeit4 = token[3];
            String b1 = token[4];
            String b2 = token[5];
            String b3 = token[6];
            String b4 = token[7];

            boolean bZeit1 = Boolean.valueOf(b1);
            boolean bZeit2 = Boolean.valueOf(b2);
            boolean bZeit3 = Boolean.valueOf(b3);
            boolean bZeit4 = Boolean.valueOf(b4);

            if (bZeit1 != true)
            {
                lbZeit1.setVisible(false);
                lbZeit1Beschreibung.setVisible(false);
            } else
            {
                lbZeit1.setVisible(true);
                lbZeit1Beschreibung.setVisible(true);
                lbZeit1.setText(zeit1);
            }

            if (bZeit2 != true)
            {
                lbZeit2.setVisible(false);
                lbZeit2Beschreibung.setVisible(false);
            } else
            {
                lbZeit2.setVisible(true);
                lbZeit2Beschreibung.setVisible(true);
                lbZeit2.setText(zeit2);
            }

            if (bZeit3 != true)
            {
                lbZeit3.setVisible(false);
                lbZeit3Beschreibung.setVisible(false);
            } else
            {
                lbZeit3.setVisible(true);
                lbZeit3Beschreibung.setVisible(true);
                lbZeit3.setText(zeit3);
            }

            if (bZeit4 != true)
            {
                lbZeit4.setVisible(false);
                lbZeit4Beschreibung.setVisible(false);
            } else
            {
                lbZeit4.setVisible(true);
                lbZeit4Beschreibung.setVisible(true);
                lbZeit4.setText(zeit4);
            }

        }
    }

    private class AutomatischeFuetterungAblaufWorker extends SwingWorker<Object, String>
    {

        String letzteFuetterungHilfsstring;

        @Override
        protected Object doInBackground() throws Exception
        {
            while (true)
            {
                if (zustand == true)
                {
                    if (zeit1.equals(uhrzeit) )
                    {
                        //TODO Fütterung
                        letzteFuetterung = 1;
                        letzteFuetterungHilfsstring = zeit1;
                        publish(letzteFuetterungHilfsstring);
                    } 
                    else 
                        if (zeit2.equals(uhrzeit) )
                         {
                            //TODO Fütterung
                            letzteFuetterung = 2;
                            letzteFuetterungHilfsstring = zeit2;
                            publish(letzteFuetterungHilfsstring);
                        }
                        else 
                            if (zeit3.equals(uhrzeit) )
                            {
                                //TODO Fütterung
                                letzteFuetterung = 3;
                                letzteFuetterungHilfsstring = zeit3;
                                publish(letzteFuetterungHilfsstring);
                            } 
                            else 
                                if (zeit4.equals(uhrzeit) )
                                {
                                    //TODO Fütterung
                                    letzteFuetterung = 4;
                                    letzteFuetterungHilfsstring = zeit4;
                                    publish(letzteFuetterungHilfsstring);
                                } 
                                else
                                {
                                    TimeUnit.SECONDS.sleep(1);
                                }
                }
            }
        }

        @Override
        protected void process(List<String> chunks)
        {
            lbLetzteFuetterung.setText(letzteFuetterungHilfsstring);
        }
    }

    private class NaechsteFuetterungWorker extends SwingWorker<Object, String>
    {

        String string1;

        @Override
        protected Object doInBackground() throws Exception
        {
            while (true)
            {
                if (zustand == true)
                {
                    StreamReader streamReader = new StreamReader();
                    //String zeiten = streamReader.einlesen("D:\\Schule\\Diplomarbeit\\Git\\fuettr_prototype\\Java_Application\\Java\\src\\data\\testZeit.txt", false);
                    String zeiten = streamReader.einlesen("data/testZeit.txt",false);
                    NaechsteFuetterung naechsteFuetterung = new NaechsteFuetterung();
                    string1 = naechsteFuetterung.naechsteFuetterung(letzteFuetterung, zeiten);
                }
                else
                {
                    string1 = "-;-"; 
                }
                publish(string1);

                TimeUnit.MILLISECONDS.sleep(500); //muss klein sein damit nach einer Fütterung die Zeiten schnell aktualisiert werden
            }
        }

        @Override
        protected void process(List<String> chunks)
        {
            String[] token = string1.split(";");
            naechsteFuetterungUm = token[0];
            naechsteFuetterungIn = token[1];

            
//            System.out.println(string1);
//            System.out.println(naechsteFuetterungIn);
            
            lbNaechsteFuetterungUm.setText(naechsteFuetterungUm);
            lbNaechsteFuetterungIn.setText(naechsteFuetterungIn);
        }
    }
    
    

}
