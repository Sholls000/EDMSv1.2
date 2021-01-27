
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TWS
 */
public class SearchEmp extends javax.swing.JFrame {
        Connection cornn2 = new DBConnection().connect();
        
     //select querry for refreshing Tables after deleting row
     private void Update_Persl(){
         try{
              String parozy1 = "select * from persl_ds where F_N = ?";
              PreparedStatement ps1 = cornn2.prepareStatement(parozy1);
              ps1.setString(1, SHTXTFD.getText());
              ResultSet rs = ps1.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs));
                
              rs.next();
                         
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
}
        }
     
     //Select querry to refresh table after delete querry
     private void update_relp(){
                    //code to paste searched Relationship details to database   
        try{
              String parozy2 = "select * from relp_ds where S_ID  = ?";
              PreparedStatement ps2 = cornn2.prepareStatement(parozy2);
              ps2.setString(1, SHTXTFD.getText());
              ResultSet rs02 = ps2.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs02));
             
              rs02.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            } 
     }
        //Select querry to refresh table after delete querry
        private void update_famds(){
                try{
              String parozy3 = "select * from fam_ds where S_ID  = ?";
              PreparedStatement ps3 = cornn2.prepareStatement(parozy3);
              ps3.setString(1, SHTXTFD.getText());
              ResultSet rs03 = ps3.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs03));
               
               rs03.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
        }
        
          //select querry to refresh table after delete querry
       private void update_reln(){
           try{
              String parozy4 = "select * from rln_ds where S_ID  = ?";
              PreparedStatement ps4 = cornn2.prepareStatement(parozy4);
              ps4.setString(1, SHTXTFD.getText());
              ResultSet rs04 = ps4.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs04));
          
              rs04.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
}
         //select querry to refresh table after delete querry
        private void update_pelds(){
                            
        try{
              String parozy6 = "select * from mdh_ds where S_ID  = ?";
              PreparedStatement ps6 = cornn2.prepareStatement(parozy6);
              ps6.setString(1, SHTXTFD.getText());
              ResultSet rs06 = ps6.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs06));
        
              rs06.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
       }
                //select querry to refresh table after delete querry
        private void update_mdh(){
           try{
              String parozy6 = "select * from mdh_ds where S_ID  = ?";
              PreparedStatement ps6 = cornn2.prepareStatement(parozy6);
              ps6.setString(1, SHTXTFD.getText());
              ResultSet rs06 = ps6.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs06));
        
              rs06.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
       }
         private void update_EI(){
            try{
              String parozy6 = "select * from emp_sum where S_ID  = ?";
              PreparedStatement ps6 = cornn2.prepareStatement(parozy6);
              ps6.setString(1, SHTXTFD.getText());
              ResultSet rs06 = ps6.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs06));
            
              rs06.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
    
                  }
      /**
     * Creates new form SearchEmp
     */
    public SearchEmp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SHTXTFD = new javax.swing.JTextField();
        PdSearch = new javax.swing.JButton();
        relpSearch = new javax.swing.JButton();
        SearchFm = new javax.swing.JButton();
        searchRel = new javax.swing.JButton();
        SearchPrevE = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        PD = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSP2 = new javax.swing.JScrollPane();
        JTAB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        exportrelp = new javax.swing.JButton();
        exportfam = new javax.swing.JButton();
        exportRel = new javax.swing.JButton();
        PrevEmpExport = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        RD = new javax.swing.JButton();
        FD = new javax.swing.JButton();
        RN = new javax.swing.JButton();
        del_PD = new javax.swing.JButton();
        MH = new javax.swing.JButton();
        EI = new javax.swing.JButton();
        returnHm = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("SEARCH EMPLOYEE");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Enter employee Name");

        PdSearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PdSearch.setText("Personal Details");
        PdSearch.setToolTipText("Please enter employee's First Name in the TextField above the Table");
        PdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PdSearchActionPerformed(evt);
            }
        });
        PdSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PdSearchKeyReleased(evt);
            }
        });

        relpSearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        relpSearch.setText("Relationship Details");
        relpSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relpSearchActionPerformed(evt);
            }
        });

        SearchFm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SearchFm.setText("Family Details");
        SearchFm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFmActionPerformed(evt);
            }
        });

        searchRel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchRel.setText("Religion");
        searchRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRelActionPerformed(evt);
            }
        });

        SearchPrevE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SearchPrevE.setText("Previous Employment");
        SearchPrevE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPrevEActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setText("Medical History");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setText("Employment Info");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        PD.setText("delete");
        PD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDActionPerformed(evt);
            }
        });

        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("*Please select category of information here....");

        jSP2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jSP2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jSP2.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), null));

        JTAB.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JTAB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTAB.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTAB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTABKeyReleased(evt);
            }
        });
        jSP2.setViewportView(JTAB);

        jButton1.setText("export");
        jButton1.setToolTipText("Export selected employee personal details to Ms Word\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        exportrelp.setText("export");
        exportrelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportrelpActionPerformed(evt);
            }
        });

        exportfam.setText("export");
        exportfam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportfamActionPerformed(evt);
            }
        });

        exportRel.setText("export");
        exportRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportRelActionPerformed(evt);
            }
        });

        PrevEmpExport.setText("export");
        PrevEmpExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevEmpExportActionPerformed(evt);
            }
        });

        jButton15.setText("export");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("export");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        RD.setText("delete");
        RD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDActionPerformed(evt);
            }
        });

        FD.setText("delete");
        FD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDActionPerformed(evt);
            }
        });

        RN.setText("delete");
        RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNActionPerformed(evt);
            }
        });

        del_PD.setText("delete");
        del_PD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_PDActionPerformed(evt);
            }
        });

        MH.setText("delete");
        MH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MHActionPerformed(evt);
            }
        });

        EI.setText("delete");
        EI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIActionPerformed(evt);
            }
        });

        returnHm.setText("home");
        returnHm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnHmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(returnHm)
                        .addGap(41, 41, 41)
                        .addComponent(jButton10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SHTXTFD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(relpSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SearchFm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SearchPrevE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(exportfam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(exportrelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(PD))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RD))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(exportRel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PrevEmpExport)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(del_PD))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(SHTXTFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PdSearch)
                            .addComponent(jButton1)
                            .addComponent(PD))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(relpSearch)
                            .addComponent(exportrelp)
                            .addComponent(RD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchFm)
                            .addComponent(exportfam)
                            .addComponent(FD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchRel)
                            .addComponent(exportRel)
                            .addComponent(RN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchPrevE)
                            .addComponent(PrevEmpExport)
                            .addComponent(del_PD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton15)
                            .addComponent(MH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton16)
                            .addComponent(EI))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(returnHm))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTABKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTABKeyReleased
        
    }//GEN-LAST:event_JTABKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
           System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void PdSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PdSearchKeyReleased
       //Code to copy Database Table to database
       
      
    }//GEN-LAST:event_PdSearchKeyReleased

    private void PdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PdSearchActionPerformed
       try{
              String parozy1 = "select * from persl_ds where F_N = ?";
              PreparedStatement ps1 = cornn2.prepareStatement(parozy1);
              ps1.setString(1, SHTXTFD.getText());
              ResultSet rs = ps1.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs));
               
        //while (rs.next()){
              rs.next();
                         
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "employee records not found!!" + "\n" + "ensure that the employee First Name was entered correctly");
            }         
         
    }//GEN-LAST:event_PdSearchActionPerformed

    private void relpSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relpSearchActionPerformed
        //code to paste searched Relationship details to database   
        try{
              String parozy2 = "select * from relp_ds where S_ID  = ?";
              PreparedStatement ps2 = cornn2.prepareStatement(parozy2);
              ps2.setString(1, SHTXTFD.getText());
              ResultSet rs02 = ps2.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs02));
               
        //while (rs.next()){
              rs02.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }        
    }//GEN-LAST:event_relpSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // code to export Personal details of employee to MS Word Document.
         try{
            //creating the prepared statement
            Statement psty = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqqll = "select * from persl_ds where S_ID ='"+Table_click+"'" ;
            psty = cornn2.prepareStatement(ssqqll);
            
            //setting resultset object to execute querry
            ResultSet rs1 = psty.executeQuery(ssqqll);
            if (rs1.next()){
                
                //copying the user selected rows from database to String variables 
                String ad1 = rs1.getString("S_ID");
                String ad2 = rs1.getString("L_N");
                String ad3 = rs1.getString("F_N");
                String ad4 = rs1.getString("M_N");
                String ad5 = rs1.getString("PD_D_O_B");
                String ad6 = rs1.getString("POB");
                String ad7 = rs1.getString("M_S");
                String ad8 = rs1.getString("G_D");
                String ad9 = rs1.getString("RA");
                String ad10 = rs1.getString("NBS");
                String ad11 = rs1.getString("C_T");
                String ad12 = rs1.getString("LGA");
                String ad13 = rs1.getString("ST");
                String ad14 = rs1.getString("CMN");
                String ad15 = rs1.getString("CMON");
                String ad16 = rs1.getString("EM");
                String ad17 = rs1.getString("SOO");
                String ad18 = rs1.getString("LG");
                
                
                // new blank document
                  XWPFDocument document1 = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream tout2 = new FileOutputStream( new File("EmployeeInfo.docx"));
           
            
            //create paragraph
            XWPFParagraph paragraph = document1.createParagraph();
            //Set Bold and Italic
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setItalic(true);
            paragraphOneRunOne.setText("Employee ID:     " + ad1 );
            paragraphOneRunOne.addBreak();
                
            //Set text position for Last Name
            XWPFRun paragraphOneRunTwo = paragraph.createRun();
            paragraphOneRunTwo.setText("Last name:    " + ad2);
            paragraphOneRunTwo.addBreak();
           // to set position, use ---> paragraphOneRunTwo.setTextPosition(100);   
            
             //Set text position
            XWPFRun paragraphOneRunThree = paragraph.createRun();
            paragraphOneRunTwo.setText("First name:    " + ad3);
            paragraphOneRunThree.addBreak();
           // paragraphOneRunTwo.setTextPosition(200);
            
            //code to set middle name
            XWPFRun paragraphOneRunFour = paragraph.createRun();
            paragraphOneRunFour.setText("Middle name:     " + ad4);
            paragraphOneRunFour.addBreak();
            
            //code to set Date of birth
             XWPFRun paragraphOneRun5 = paragraph.createRun();
            paragraphOneRun5.setText("Date of birth:     " + ad5);
            paragraphOneRun5.addBreak();
            
            //code to set Place of birth
             XWPFRun paragraphOneRun6 = paragraph.createRun();
            paragraphOneRun6.setText("Place of birth:     " + ad6);
            paragraphOneRun6.addBreak();
            
             //code to set Marital Status to EmployeeInfo.docx
             XWPFRun paragraphOneRun7 = paragraph.createRun();
            paragraphOneRun7.setText("Marital status:    " + ad7);
            paragraphOneRun7.addBreak();
            
             //code to set Gender to EmployeeInfo.docx
             XWPFRun paragraphOneRun8 = paragraph.createRun();
            paragraphOneRun8.setText("Gender:     " + ad8);
            paragraphOneRun8.addBreak();
            
             //code to set Residential address to .docx document
             XWPFRun paragraphOneRun9 = paragraph.createRun();
            paragraphOneRun9.setText("Residential address: " + ad9);
            paragraphOneRun9.addBreak();
            
             //code to set Nearest bus stop
             XWPFRun paragraphOneRun10 = paragraph.createRun();
            paragraphOneRun10.setText("Nearest bus stop: " + ad10);
            paragraphOneRun10.addBreak();
            
             //code to set .................
             XWPFRun paragraphOneRun11 = paragraph.createRun();
            paragraphOneRun11.setText("City:         " + ad11);
            paragraphOneRun11.addBreak();
            
             //code to set ............
             XWPFRun paragraphOneRun12 = paragraph.createRun();
            paragraphOneRun12.setText("Local Govt. Area: " + ad12);
            paragraphOneRun12.addBreak();
            
             //code to set ..............
             XWPFRun paragraphOneRun13 = paragraph.createRun();
            paragraphOneRun13.setText("State:          " + ad13);
            paragraphOneRun13.addBreak();
            
             //code to set .............
             XWPFRun paragraphOneRun14 = paragraph.createRun();
            paragraphOneRun14.setText("Current Mobile no:  " + ad14);
            paragraphOneRun14.addBreak();
            
             //code to set ................
             XWPFRun paragraphOneRun15 = paragraph.createRun();
            paragraphOneRun15.setText("Other number:   " + ad15);
            paragraphOneRun15.addBreak();
            
             //code to set ...........
             XWPFRun paragraphOneRun16 = paragraph.createRun();
            paragraphOneRun16.setText("E-mail address:     " + ad16);
            paragraphOneRun16.addBreak();
            
             //code to set .............
             XWPFRun paragraphOneRun17 = paragraph.createRun();
            paragraphOneRun17.setText("State of origin: " + ad17);
            paragraphOneRun17.addBreak();
            
             //code to set Place of birth
             XWPFRun paragraphOneRun18 = paragraph.createRun();
            paragraphOneRun18.setText("Local Government: " + ad18);
            paragraphOneRun18.addBreak();
            
            //setting document to filestream            
            document1.write(tout2);
            tout2.close();
            System.out.println("The new level is the realest shizit");
            JOptionPane.showMessageDialog(rootPane, "Employee data has been saved to MS Word Document" + "\n ");
                
            }
        }
        catch (SQLException e){
                System.out.print("    Package na SQl shizit");
                e.printStackTrace();
                
            
        }   catch (IOException ex) {
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exportrelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportrelpActionPerformed
        // code to set relationship details of selected employee to Ms Word document
          try{
            //creating the prepared statement
            Statement psty1 = cornn2.createStatement();
            
            //getting selected row from the JTable
            int row1 = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row1, 0).toString());
            
            //fetching fields from database 
            String ssqqll2 = "select * from relp_ds where RELP_ID ='"+Table_click+"'" ;
            psty1 = cornn2.prepareStatement(ssqqll2);
            
            //setting resultset object to execute querry
            ResultSet rs1 = psty1.executeQuery(ssqqll2);
            if (rs1.next()){
                
                System.out.println("still working fine after fetching data");
                
                
                //copying the user selected rows from database to String variables 
                String bd1 = rs1.getString("S_ID");
                String bd2 = rs1.getString("RDLNS");
                String bd3 = rs1.getString("RDMP");
                String bd4 = rs1.getString("RDNCD");
                String bd5 = rs1.getString("RDNC1");
                String bd6 = rs1.getString("DRDDOB1");
                String bd7 = rs1.getString("RDSC1");
                String bd8 = rs1.getString("RDNC2");
                String bd9 = rs1.getString("RDDOB2");
                String bd10 = rs1.getString("RDSC2");
                String bd11 = rs1.getString("RDNC3");
                String bd12 = rs1.getString("RDDOB3");
                String bd13 = rs1.getString("RDSC3");
                String bd14 = rs1.getString("RDNC4");
                String bd15 = rs1.getString("RDDOB4");
                String bd16 = rs1.getString("RDSC4");
                String bd17 = rs1.getString("RDNK");
                String bd18 = rs1.getString("RDANK");
                String bd19 = rs1.getString("RDNDOB");
                String bd20 = rs1.getString("RDNG");
                String bd21 = rs1.getString("RDNR");
                String bd22 = rs1.getString("RDNMN");
                String bd23 = rs1.getString("RDNON");
                String bd24 = rs1.getString("RDNRAS");
                String bd25 = rs1.getString("RDNNBS");
                String bd26 = rs1.getString("RDNCT");
                String bd27 = rs1.getString("RDLGA");
                String bd28 = rs1.getString("RDST");
                String bd29 = rs1.getString("RDIC");
                String bd30 = rs1.getString("RDIMN");
                
                
                // new blank document
                  XWPFDocument document2 = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream tout3 = new FileOutputStream( new File("EmployeePersonalInfo.docx"));
           
            
            //create paragraph
            XWPFParagraph paragraph = document2.createParagraph();
            //Set Bold and Italic
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setItalic(true);
            paragraphOneRunOne.setText("Employee ID:     " + bd1 );
            paragraphOneRunOne.addBreak();
                
            //Set text position for .................
            XWPFRun paragraphOneRunTwo = paragraph.createRun();
            paragraphOneRunTwo.setText("Name of spouse:    " + bd2);
            paragraphOneRunTwo.addBreak();
           // to set position, use ---> paragraphOneRunTwo.setTextPosition(100);   
            
             //Set text position for .................
            XWPFRun paragraphOneRunThree = paragraph.createRun();
            paragraphOneRunTwo.setText("Mobile no:    " + bd3);
            paragraphOneRunThree.addBreak();
           // paragraphOneRunTwo.setTextPosition(200);
            
            //code to ....................  
            XWPFRun paragraphOneRunFour = paragraph.createRun();
            paragraphOneRunFour.setText("Number of Children:     " + bd4);
            paragraphOneRunFour.addBreak();
            
            //code to set ................
             XWPFRun paragraphOneRun5 = paragraph.createRun();
            paragraphOneRun5.setText("Name of child 1 :      " + bd5);
            paragraphOneRun5.addBreak();
            
            //code to set......................
             XWPFRun paragraphOneRun6 = paragraph.createRun();
            paragraphOneRun6.setText("Date of birth child 1 :     " + bd6);
            paragraphOneRun6.addBreak();
            
             //code to set SEX OF CHILD 1 to EmployeePersonalInfo.docx
             XWPFRun paragraphOneRun7 = paragraph.createRun();
            paragraphOneRun7.setText("Sex of child 1 :    " + bd7);
            paragraphOneRun7.addBreak();
            
             //code to set .......................
             XWPFRun paragraphOneRun8 = paragraph.createRun();
            paragraphOneRun8.setText("Name of child 2 :     " + bd8);
            paragraphOneRun8.addBreak();
            
             //code to set ...........  to .docx document
             XWPFRun paragraphOneRun9 = paragraph.createRun();
            paragraphOneRun9.setText("Date of birth child 2 : " + bd9);
            paragraphOneRun9.addBreak();
            
             //code to set ......................
             XWPFRun paragraphOneRun10 = paragraph.createRun();
            paragraphOneRun10.setText("Sex of child 2 : " + bd10);
            paragraphOneRun10.addBreak();
            
             //code to set .................
             XWPFRun paragraphOneRun11 = paragraph.createRun();
            paragraphOneRun11.setText("Name of child 3 :         " + bd11);
            paragraphOneRun11.addBreak();
            
             //code to set ............
             XWPFRun paragraphOneRun12 = paragraph.createRun();
            paragraphOneRun12.setText("Date of birth child 3 : " + bd12);
            paragraphOneRun12.addBreak();
            
             //code to set ..............
             XWPFRun paragraphOneRun13 = paragraph.createRun();
            paragraphOneRun13.setText("Sex of child 3 :          " + bd13);
            paragraphOneRun13.addBreak();
            
             //code to set .............
             XWPFRun paragraphOneRun14 = paragraph.createRun();
            paragraphOneRun14.setText("Name of child 4 :  " + bd14);
            paragraphOneRun14.addBreak();
            
             //code to set ................
             XWPFRun paragraphOneRun15 = paragraph.createRun();
            paragraphOneRun15.setText("Date of birth 4 :   " + bd15);
            paragraphOneRun15.addBreak();
            
             //code to set ...........
             XWPFRun paragraphOneRun16 = paragraph.createRun();
            paragraphOneRun16.setText("Sex of child 4:     " + bd16);
            paragraphOneRun16.addBreak();
            
             //code to set .............
             XWPFRun paragraphOneRun17 = paragraph.createRun();
            paragraphOneRun17.setText("Name of next of kin : " + bd17);
            paragraphOneRun17.addBreak();
            
             //code to set Place of birth
             XWPFRun paragraphOneRun18 = paragraph.createRun();
            paragraphOneRun18.setText("Address of next of kin: " + bd18);
            paragraphOneRun18.addBreak();
            
             XWPFRun paragraphOneRun19 = paragraph.createRun();
            paragraphOneRun19.setText("Date of birth :      " + bd19);
            paragraphOneRun19.addBreak();
            
            //code to set......................
             XWPFRun paragraphOneRun20 = paragraph.createRun();
            paragraphOneRun20.setText("Gender :     " + bd20);
            paragraphOneRun20.addBreak();
            
             //code to set SEX OF CHILD 1 to EmployeePersonalInfo.docx
             XWPFRun paragraphOneRun21 = paragraph.createRun();
            paragraphOneRun21.setText("Relationship :    " + bd21);
            paragraphOneRun21.addBreak();
            
             //code to set .......................
             XWPFRun paragraphOneRun22 = paragraph.createRun();
            paragraphOneRun22.setText("Mobile no :     " + bd22);
            paragraphOneRun22.addBreak();
            
             //code to set ...........  to .docx document
             XWPFRun paragraphOneRun23 = paragraph.createRun();
            paragraphOneRun23.setText("Other number : " + bd23);
            paragraphOneRun23.addBreak();
            
             //code to set ......................
             XWPFRun paragraphOneRun24 = paragraph.createRun();
            paragraphOneRun24.setText("Residential Address : " + bd24 + bd25);
            paragraphOneRun24.addBreak();
            
             //code to set .................
             XWPFRun paragraphOneRun26 = paragraph.createRun();
            paragraphOneRun26.setText("City :         " + bd26);
            paragraphOneRun26.addBreak();
            
             //code to set ............
             XWPFRun paragraphOneRun27 = paragraph.createRun();
            paragraphOneRun27.setText("Local Govt. Area : " + bd27);
            paragraphOneRun27.addBreak();
            
             //code to set ..............
             XWPFRun paragraphOneRun28 = paragraph.createRun();
            paragraphOneRun28.setText("State :          " + bd28);
            paragraphOneRun28.addBreak();
            
             //code to set .............
             XWPFRun paragraphOneRun29 = paragraph.createRun();
            paragraphOneRun29.setText("Emergency contact :  " + bd29);
            paragraphOneRun29.addBreak();
            
             //code to set ................
             XWPFRun paragraphOneRun30 = paragraph.createRun();
            paragraphOneRun30.setText("Mobile no :   " + bd30);
            paragraphOneRun30.addBreak();
            
            //setting document to filestream            
            document2.write(tout3);
            tout3.close();
            System.out.println("The new level is the realest shizit");
            JOptionPane.showMessageDialog(rootPane, "Employee data has been saved to" + " MS Word Document" );
                
            }
        }
        catch (SQLException e){
                System.out.print("    Package na SQl shizit");
                
            
        }   catch (IOException ex) {
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_exportrelpActionPerformed

    private void SearchFmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFmActionPerformed
    //code to paste searched Family details to database   
        try{
              String parozy3 = "select * from fam_ds where S_ID  = ?";
              PreparedStatement ps3 = cornn2.prepareStatement(parozy3);
              ps3.setString(1, SHTXTFD.getText());
              ResultSet rs03 = ps3.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs03));
               
        //while (rs.next()){
              rs03.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
    }//GEN-LAST:event_SearchFmActionPerformed

    private void exportfamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportfamActionPerformed
         // code to set Family details of selected employee to Ms Word document
          try{
            //creating the prepared statement
            Statement psty2 = cornn2.createStatement();
            
            //getting selected row from the JTable
            int row1 = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row1, 0).toString());
            
            //fetching fields from database 
            String ssqqll3 = "select * from fam_ds where FAM_ID ='"+Table_click+"'" ;
            psty2 = cornn2.prepareStatement(ssqqll3);
            
            //setting resultset object to execute querry
            ResultSet rs1 = psty2.executeQuery(ssqqll3);
            if (rs1.next()){
                
                System.out.println("still working fine after fetching data");
                
                
                //copying the user selected rows from database to String variables 
                String cd1 = rs1.getString("S_ID");
                String cd2 = rs1.getString("FDNP");
                String cd3 = rs1.getString("FDAP");
                String cd4 = rs1.getString("FDQ");
                String cd5 = rs1.getString("FDAOP");
                
                   // new blank document
                  XWPFDocument document2 = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream tout3 = new FileOutputStream( new File("EmployeefAMILYInfo.docx"));
           
            
            //create paragraph
            XWPFParagraph paragraph = document2.createParagraph();
            //Set Bold and Italic
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setItalic(true);
            paragraphOneRunOne.setText("Employee ID :      " + cd1 );
            paragraphOneRunOne.addBreak();
                
            //Set text position for Last Name
            XWPFRun paragraphOneRunTwo = paragraph.createRun();
            paragraphOneRunTwo.setText("Name of parents :    " + cd2);
            paragraphOneRunTwo.addBreak();
           // to set position, use ---> paragraphOneRunTwo.setTextPosition(100);   
            
             //Set text position
            XWPFRun paragraphOneRunThree = paragraph.createRun();
            paragraphOneRunTwo.setText("Address of parents :    " + cd3);
            paragraphOneRunThree.addBreak();
           // paragraphOneRunTwo.setTextPosition(200);
            
            //code to set middle name
            XWPFRun paragraphOneRunFour = paragraph.createRun();
            paragraphOneRunFour.setText("Are they living together :     " + cd4);
            paragraphOneRunFour.addBreak();
            
            //code to set Date of birth
             XWPFRun paragraphOneRun5 = paragraph.createRun();
            paragraphOneRun5.setText("Address of other parent :     " + cd5);
            paragraphOneRun5.addBreak();
            
              //setting document to filestream            
            document2.write(tout3);
            tout3.close();
            System.out.println("The new level is the realest shizit");
            JOptionPane.showMessageDialog(rootPane, "Employee data has been saved to" + " MS Word Document" );
                
            }
        }
        catch (SQLException e){
                System.out.print("    Package na SQl shizit");
                
            
        }   catch (IOException ex) {
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
       
    }//GEN-LAST:event_exportfamActionPerformed

    private void searchRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRelActionPerformed
                  //code to paste searched Religion details to database   
        try{
              String parozy4 = "select * from rln_ds where S_ID  = ?";
              PreparedStatement ps4 = cornn2.prepareStatement(parozy4);
              ps4.setString(1, SHTXTFD.getText());
              ResultSet rs04 = ps4.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs04));
               
        //while (rs.next()){
              rs04.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
    }//GEN-LAST:event_searchRelActionPerformed

    private void exportRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportRelActionPerformed
          // code to set relationship details of selected employee to Ms Word document
          try{
            //creating the prepared statement
            Statement psty3 = cornn2.createStatement();
            
            //getting selected row from the JTable
            int row1 = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row1, 0).toString());
            
            //fetching fields from database 
            String ssqqll4 = "select * from rln_ds where RLL_ID ='"+Table_click+"'" ;
            psty3 = cornn2.prepareStatement(ssqqll4);
            
            //setting resultset object to execute querry
            ResultSet rs1 = psty3.executeQuery(ssqqll4);
            if (rs1.next()){
                
                System.out.println("still working fine after fetching data");
                
                
                //copying the user selected rows from database to String variables 
                String  dd1 = rs1.getString("S_ID");
                String dd2 = rs1.getString("RR");
                String dd3 = rs1.getString("RAD");
                String dd4 = rs1.getString("RNL");
                                
                // new blank document
                  XWPFDocument document3 = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream tout4 = new FileOutputStream( new File("EmployeeRELIGIONInfo.docx"));
           
            
            //create paragraph
            XWPFParagraph paragraph = document3.createParagraph();
            //Set Bold and Italic
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setItalic(true);
            paragraphOneRunOne.setText("Employee ID :      " + dd1 );
            paragraphOneRunOne.addBreak();
                
            //Set text position for Last Name
            XWPFRun paragraphOneRunTwo = paragraph.createRun();
            paragraphOneRunTwo.setText("Religion :    " + dd2);
            paragraphOneRunTwo.addBreak();
           // to set position, use ---> paragraphOneRunTwo.setTextPosition(100);   
            
             //Set text position
            XWPFRun paragraphOneRunThree = paragraph.createRun();
            paragraphOneRunTwo.setText("Address of place of worship :    " + dd3);
            paragraphOneRunThree.addBreak();
           // paragraphOneRunTwo.setTextPosition(200);
            
            //code to set middle name
            XWPFRun paragraphOneRunFour = paragraph.createRun();
            paragraphOneRunFour.setText("Name of leader :     " + dd4);
            paragraphOneRunFour.addBreak();
                        
            //setting document to filestream            
            document3.write(tout4);
            tout4.close();
            System.out.println("The new level is the realest shizit");
            JOptionPane.showMessageDialog(rootPane, "Employee data has been saved to" + "\n" +   " MS Word Document" );
                
            }
        }
        catch (SQLException e){
                e.printStackTrace();
                
            
        }   catch (IOException ex) {
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_exportRelActionPerformed

    private void SearchPrevEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPrevEActionPerformed
                  //code to paste searched Previous Employment information  to database   
        try{
              String parozy5 = "select * from pel_ds where S_ID  = ?";
              PreparedStatement ps5 = cornn2.prepareStatement(parozy5);
              ps5.setString(1, SHTXTFD.getText());
              ResultSet rs05 = ps5.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs05));
               
        //while (rs.next()){
              rs05.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
                                             

    }//GEN-LAST:event_SearchPrevEActionPerformed

    private void PrevEmpExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevEmpExportActionPerformed
        // code to export previous employment details of employee to MS Word Document.
         try{
            //creating the prepared statement
            Statement psty4 = cornn2.createStatement();
            
            //getting selected row from the JTable
            int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqqll = "select * from pel_ds where PEL_ID ='"+Table_click+"'" ;
            psty4 = cornn2.prepareStatement(ssqqll);
            
            //setting resultset object to execute querry
            ResultSet rs1 = psty4.executeQuery(ssqqll);
            if (rs1.next()){
                
                //copying the user selected rows from database to String variables 
                String ed1 = rs1.getString("S_ID");
                String ed2 = rs1.getString("ELN");
                String ed3 = rs1.getString("ELAD");
                String ed4 = rs1.getString("ELNB");
                String ed5 = rs1.getString("ELOCN");
                String ed6 = rs1.getString("ELPE");
                String ed7 = rs1.getString("ELES");
                String ed8 = rs1.getString("ELEE");
                String ed9 = rs1.getString("ELSA");
                String ed10 = rs1.getString("ELSM");
                String ed11 = rs1.getString("ELPH");
                String ed12 = rs1.getString("ELRL");
                
                // new blank document
                  XWPFDocument document2 = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream tout3 = new FileOutputStream( new File("EmployeePrevEmp.docx"));
           
            
            //create paragraph
            XWPFParagraph paragraph = document2.createParagraph();
            //Set Bold and Italic
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setItalic(true);
            paragraphOneRunOne.setText("Employee ID:     " + ed1 );
            paragraphOneRunOne.addBreak();
                
            //Set text position for .................
            XWPFRun paragraphOneRunTwo = paragraph.createRun();
            paragraphOneRunTwo.setText("Employer / Name of Company :    " + ed2);
            paragraphOneRunTwo.addBreak();
           // to set position, use ---> paragraphOneRunTwo.setTextPosition(100);   
            
             //Set text position for .................
            XWPFRun paragraphOneRunThree = paragraph.createRun();
            paragraphOneRunTwo.setText("Address of company :    " + ed3);
            paragraphOneRunThree.addBreak();
           // paragraphOneRunTwo.setTextPosition(200);
            
            //code to ....................  
            XWPFRun paragraphOneRunFour = paragraph.createRun();
            paragraphOneRunFour.setText("Nature of business :     " + ed4);
            paragraphOneRunFour.addBreak();
            
            //code to set ................
             XWPFRun paragraphOneRun5 = paragraph.createRun();
            paragraphOneRun5.setText("Office Contact number :      " + ed5);
            paragraphOneRun5.addBreak();
            
            //code to set......................
             XWPFRun paragraphOneRun6 = paragraph.createRun();
            paragraphOneRun6.setText("Were you employed directly " + "\n" + "by the company" + ed6);
            paragraphOneRun6.addBreak();
            
             //code to set SEX OF CHILD 1 to EmployeePersonalInfo.docx
             XWPFRun paragraphOneRun7 = paragraph.createRun();
            paragraphOneRun7.setText("Start date of employment :    " + ed7);
            paragraphOneRun7.addBreak();
            
             //code to set .......................
             XWPFRun paragraphOneRun8 = paragraph.createRun();
            paragraphOneRun8.setText("End date of employment :     " + ed8);
            paragraphOneRun8.addBreak();
            
             //code to set ...........  to .docx document
             XWPFRun paragraphOneRun9 = paragraph.createRun();
            paragraphOneRun9.setText("Last Earned salary(Annuual gross) : " + ed9);
            paragraphOneRun9.addBreak();
            
             //code to set ......................
             XWPFRun paragraphOneRun10 = paragraph.createRun();
            paragraphOneRun10.setText("SLast earned monthly salary : " + ed10);
            paragraphOneRun10.addBreak();
            
             //code to set .................
             XWPFRun paragraphOneRun11 = paragraph.createRun();
            paragraphOneRun11.setText("Position last held and responsibility :         " + ed11);
            paragraphOneRun11.addBreak();
            
             //code to set ............
             XWPFRun paragraphOneRun12 = paragraph.createRun();
            paragraphOneRun12.setText("Reason for leaving : " + ed12);
            paragraphOneRun12.addBreak();
            
            //setting document to filestream            
            document2.write(tout3);
            tout3.close();
            System.out.println("The new level is the realest shizit");
            JOptionPane.showMessageDialog(rootPane, "Employee data has been saved to" + " MS Word Document" );
                
            }
        }
        catch (SQLException e){
               JOptionPane.showMessageDialog(rootPane, "You have not made any selection");
                
            
        }   catch (IOException ex) {
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_PrevEmpExportActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       //code to paste searched Medical history information  to database   
        try{
              String parozy6 = "select * from mdh_ds where S_ID  = ?";
              PreparedStatement ps6 = cornn2.prepareStatement(parozy6);
              ps6.setString(1, SHTXTFD.getText());
              ResultSet rs06 = ps6.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs06));
               
        //while (rs.next()){
              rs06.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }                 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       // code to export previous employment details of employee to MS Word Document.
         try{
            //creating the prepared statement
            Statement psty4 = cornn2.createStatement();
            
            //getting selected row from the JTable
            int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqqll = "select * from mdh_ds where MDH_ID ='"+Table_click+"'" ;
            psty4 = cornn2.prepareStatement(ssqqll);
            
            //setting resultset object to execute querry
            ResultSet rs1 = psty4.executeQuery(ssqqll);
            if (rs1.next()){
                
                //copying the user selected rows from database to String variables 
                String fd1 = rs1.getString("S_ID");
                String fd2 = rs1.getString("MHPH");
                String fd3 = rs1.getString("MHRE");
                String fd4 = rs1.getString("MHRR");
                String fd5 = rs1.getString("MHWI");
                String fd6 = rs1.getString("MHMI");
                String fd7 = rs1.getString("MHHC");
                String fd8 = rs1.getString("MHDN");
                String fd9 = rs1.getString("MHDMN");
                String fd10 = rs1.getString("MHHD");
                
                // new blank document
                  XWPFDocument document2 = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream tout3 = new FileOutputStream( new File("EmployeeMedHistory.docx"));
           
            
            //create paragraph
            XWPFParagraph paragraph = document2.createParagraph();
            //Set Bold and Italic
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setItalic(true);
            paragraphOneRunOne.setText("Employee ID :     " + fd1 );
            paragraphOneRunOne.addBreak();
                
            //Set text position for .................
            XWPFRun paragraphOneRunTwo = paragraph.createRun();
            paragraphOneRunTwo.setText("What is your present" + "\n" + "state of health? :  " + fd2);
            paragraphOneRunTwo.addBreak();
           // to set position, use ---> paragraphOneRunTwo.setTextPosition(100);   
            
             //Set text position for .................
            XWPFRun paragraphOneRunThree = paragraph.createRun();
            paragraphOneRunTwo.setText("Have you ever been refused employment" + "\n" + "based on health reasons ? :  " + fd3);
            paragraphOneRunThree.addBreak();
           // paragraphOneRunTwo.setTextPosition(200);
            
            //code to ....................  
            XWPFRun paragraphOneRunFour = paragraph.createRun();
            paragraphOneRunFour.setText("If yes, why? :     " + fd4);
            paragraphOneRunFour.addBreak();
            
            //code to set ................
             XWPFRun paragraphOneRun5 = paragraph.createRun();
            paragraphOneRun5.setText("Have you ever had work related" + "\n" + " injuries / illness ? :     " + fd5);
            paragraphOneRun5.addBreak();
            
            //code to set......................
             XWPFRun paragraphOneRun6 = paragraph.createRun();
            paragraphOneRun6.setText("Were you employed directly " + "\n" + "by the company :     " + fd6);
            paragraphOneRun6.addBreak();
            
             //code to set SEX OF CHILD 1 to EmployeePersonalInfo.docx
             XWPFRun paragraphOneRun7 = paragraph.createRun();
            paragraphOneRun7.setText("Have you ever received treatment / counselling" + "\n" + "for psychiatric or emotional illness :   " +fd7);
            paragraphOneRun7.addBreak();
            
             //code to set .......................
             XWPFRun paragraphOneRun8 = paragraph.createRun();
            paragraphOneRun8.setText("Name of your doctor  :     " + fd8);
            paragraphOneRun8.addBreak();
            
             //code to set ...........  to .docx document
             XWPFRun paragraphOneRun9 = paragraph.createRun();
            paragraphOneRun9.setText("Mobile no : " + fd9);
            paragraphOneRun9.addBreak();
            
             //code to set ......................
             XWPFRun paragraphOneRun10 = paragraph.createRun();
            paragraphOneRun10.setText("Address of hospital : " + fd10);
            paragraphOneRun10.addBreak();
                         
            //setting document to filestream            
            document2.write(tout3);
            tout3.close();
            System.out.println("The new level is the realest shizit");
            JOptionPane.showMessageDialog(rootPane, "Employee data has been saved to" + " MS Word Document" );
                
            }
        }
        catch (SQLException e){
               JOptionPane.showMessageDialog(rootPane, "You have not made any selection from the table");
                
            
        }   catch (IOException ex) {
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            //code to paste searched Employee information  to database   
        try{
              String parozy6 = "select * from emp_sum where S_ID  = ?";
              PreparedStatement ps6 = cornn2.prepareStatement(parozy6);
              ps6.setString(1, SHTXTFD.getText());
              ResultSet rs06 = ps6.executeQuery();
                 
              //setting result set data to JTbale JTAb
              JTAB.setModel(DbUtils.resultSetToTableModel(rs06));
               
        //while (rs.next()){
              rs06.next();
                   
       }    catch (SQLException ex) {         
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "This employee data is unavailable");
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
          // code to export previous employment details of employee to MS Word Document.
         try{
            //creating the prepared statement
            Statement psty4 = cornn2.createStatement();
            
            //getting selected row from the JTable
            int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqqll = "select * from emp_sum where ESD_ID ='"+Table_click+"'" ;
            psty4 = cornn2.prepareStatement(ssqqll);
            
            //setting resultset object to execute querry
            ResultSet rs1 = psty4.executeQuery(ssqqll);
            if (rs1.next()){
                
                //copying the user selected rows from database to String variables 
                String gd1 = rs1.getString("S_ID");
                String gd2 = rs1.getString("JESSN");
                // this is for photo (omitted)  String gd3 = rs1.getString("ESEP");
                String gd4 = rs1.getString("ESGD");
                String gd5 = rs1.getString("ESDJ");
                String gd6 = rs1.getString("ESPN");
                String gd7 = rs1.getString("DEPTS");
                String gd8 = rs1.getString("ESDOB");
                String gd9 = rs1.getString("ESCN");
                String gd10 = rs1.getString("ESRAD");
                String gd11 = rs1.getString("ESMHH");
                String gd12 = rs1.getString("ESPFA");
                String gd13 = rs1.getString("ESETD");
                
                // new blank document
                  XWPFDocument document2 = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream tout3 = new FileOutputStream( new File("EmployeeSumInfo.docx"));
           
            
            //create paragraph
            XWPFParagraph paragraph = document2.createParagraph();
            //Set Bold and Italic
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setItalic(true);
            paragraphOneRunOne.setText("Employee ID:     " + gd1 );
            paragraphOneRunOne.addBreak();
                
            //Set text position for .................
            XWPFRun paragraphOneRunTwo = paragraph.createRun();
            paragraphOneRunTwo.setText("Employee name :    " + gd2);
            paragraphOneRunTwo.addBreak();
           // to set position, use ---> paragraphOneRunTwo.setTextPosition(100);   
            
                      
            
            //code to ....................  
            XWPFRun paragraphOneRunFour = paragraph.createRun();
            paragraphOneRunFour.setText("Gender :     " + gd4);
            paragraphOneRunFour.addBreak();
            
            //code to set ................
             XWPFRun paragraphOneRun5 = paragraph.createRun();
            paragraphOneRun5.setText("Date Joined :      " + gd5);
            paragraphOneRun5.addBreak();
            
            //code to set......................
             XWPFRun paragraphOneRun6 = paragraph.createRun();
            paragraphOneRun6.setText("Position:  " + gd6);
            paragraphOneRun6.addBreak();
            
             //code to set SEX OF CHILD 1 to EmployeePersonalInfo.docx
             XWPFRun paragraphOneRun7 = paragraph.createRun();
            paragraphOneRun7.setText("Department :    " + gd7);
            paragraphOneRun7.addBreak();
            
             //code to set .......................
             XWPFRun paragraphOneRun8 = paragraph.createRun();
            paragraphOneRun8.setText("Date of birth :     " + gd8);
            paragraphOneRun8.addBreak();
            
             //code to set ...........  to .docx document
             XWPFRun paragraphOneRun9 = paragraph.createRun();
            paragraphOneRun9.setText("Contact no :   " + gd9);
            paragraphOneRun9.addBreak();
            
             //code to set ......................
             XWPFRun paragraphOneRun10 = paragraph.createRun();
            paragraphOneRun10.setText("E-mail  :   " + gd10);
            paragraphOneRun10.addBreak();
            
             //code to set .................
             XWPFRun paragraphOneRun11 = paragraph.createRun();
            paragraphOneRun11.setText("MHS Hospital :         " + gd11);
            paragraphOneRun11.addBreak();
            
             //code to set ............
             XWPFRun paragraphOneRun12 = paragraph.createRun();
            paragraphOneRun12.setText("PFA :    " + gd12);
            paragraphOneRun12.addBreak();
            
             //code to set ............
             XWPFRun paragraphOneRun13 = paragraph.createRun();
            paragraphOneRun13.setText("Exit date :    " + gd12);
            paragraphOneRun13.addBreak();
            
            //setting document to filestream            
            document2.write(tout3);
            tout3.close();
            System.out.println("The new level is the realest shizit");
            JOptionPane.showMessageDialog(rootPane, "Employee data has been saved to" + " MS Word Document" );
                
            }
        }
        catch (SQLException e){
               JOptionPane.showMessageDialog(rootPane, "You have not made any selection");
                
            
        }   catch (IOException ex) {
                Logger.getLogger(SearchEmp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void PDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDActionPerformed
        //delete selected row from database
        try{
            //creating the prepared statement
            Statement psty = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqqll = "delete  from persl_ds where S_ID = '"+Table_click+"' " ;
            psty = cornn2.prepareStatement(ssqqll);
            
            psty.execute(ssqqll);
            
            JOptionPane.showMessageDialog(rootPane, "Record deleted");
            
            Update_Persl();
            
        }catch(Exception bx){
            bx.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Record not exisiting");
        }
    }//GEN-LAST:event_PDActionPerformed

    private void RDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDActionPerformed
        // code to delete selected row from database
         try{
            //creating the prepared statement
            Statement psty2 = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqql2 = "delete  from relp_ds where S_ID = '"+Table_click+"' " ;
            psty2 = cornn2.prepareStatement(ssqql2);
            
            psty2.execute(ssqql2);
            
            JOptionPane.showMessageDialog(rootPane, "Record deleted");
            
            update_relp();
            
        }catch(Exception bx){
            bx.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Record not exisiting");
        }
        
        
    }//GEN-LAST:event_RDActionPerformed

    private void FDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDActionPerformed
        // code to delete a selected row from database
        try{
            //creating the prepared statement
            Statement psty2 = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqql2 = "delete  from fam_ds where S_ID = '"+Table_click+"' " ;
            psty2 = cornn2.prepareStatement(ssqql2);
            
            psty2.execute(ssqql2);
            
            JOptionPane.showMessageDialog(rootPane, "Record deleted");
            
            update_famds();
            
        }catch(Exception bx){
            bx.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Record not exisiting");
        }       
    }//GEN-LAST:event_FDActionPerformed

    private void RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNActionPerformed
        // code to delete a selected row from database
        try{
            //creating the prepared statement
            Statement psty2 = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqql2 = "delete  from rln_ds where S_ID = '"+Table_click+"' " ;
            psty2 = cornn2.prepareStatement(ssqql2);
            
            psty2.execute(ssqql2);
            
            JOptionPane.showMessageDialog(rootPane, "Record deleted");
            
             update_reln();
            
        }catch(Exception bx){
            bx.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Record not exisiting");
        }  
        
    }//GEN-LAST:event_RNActionPerformed

    private void del_PDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_PDActionPerformed
         // code to delete a selected row from database
        try{
            //creating the prepared statement
            Statement psty2 = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqql2 = "delete  from pel_ds where S_ID = '"+Table_click+"' " ;
            psty2 = cornn2.prepareStatement(ssqql2);
            
            psty2.execute(ssqql2);
            
            JOptionPane.showMessageDialog(rootPane, "Record deleted");
            // method to refresh JTable
             update_pelds();
            
        }catch(Exception bx){
            bx.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Record not exisiting");
        }
    }//GEN-LAST:event_del_PDActionPerformed

    private void MHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MHActionPerformed
       // code to delete a selected row from database
        try{
            //creating the prepared statement
            Statement psty2 = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqql2 = "delete  from mdh_ds where S_ID = '"+Table_click+"' " ;
            psty2 = cornn2.prepareStatement(ssqql2);
            
            psty2.execute(ssqql2);
            
            JOptionPane.showMessageDialog(rootPane, "Record deleted");
            // method to refresh JTable
             update_mdh();
            
        }catch(Exception bx){
            bx.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Record not exisiting");
        }
    }//GEN-LAST:event_MHActionPerformed

    private void EIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIActionPerformed
       //code to delete selected row from database
          try{
            //creating the prepared statement
            Statement psty2 = cornn2.createStatement();
            
            //getting selected row from the JTable
             int row = JTAB.getSelectedRow();
            String Table_click = (JTAB.getModel().getValueAt(row, 0).toString());
            
            //fetching fields from database 
            String ssqql2 = "delete  from emp_sum where S_ID = '"+Table_click+"' " ;
            psty2 = cornn2.prepareStatement(ssqql2);
            
            psty2.execute(ssqql2);
            
            JOptionPane.showMessageDialog(rootPane, "Record deleted");
            
            // method to refresh JTable
             update_EI();
            
        }catch(Exception bx){
            bx.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Record not exisiting");
        }
    }//GEN-LAST:event_EIActionPerformed

    private void returnHmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnHmActionPerformed
        // TO return to homepage on click
        this.dispose();
        HOMAPAGE nm = new HOMAPAGE();
        nm.show();
    }//GEN-LAST:event_returnHmActionPerformed
         
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EI;
    private javax.swing.JButton FD;
    private javax.swing.JTable JTAB;
    private javax.swing.JButton MH;
    private javax.swing.JButton PD;
    private javax.swing.JButton PdSearch;
    private javax.swing.JButton PrevEmpExport;
    private javax.swing.JButton RD;
    private javax.swing.JButton RN;
    private javax.swing.JTextField SHTXTFD;
    private javax.swing.JButton SearchFm;
    private javax.swing.JButton SearchPrevE;
    private javax.swing.JButton del_PD;
    private javax.swing.JButton exportRel;
    private javax.swing.JButton exportfam;
    private javax.swing.JButton exportrelp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jSP2;
    private javax.swing.JButton relpSearch;
    private javax.swing.JButton returnHm;
    private javax.swing.JButton searchRel;
    // End of variables declaration//GEN-END:variables
}
