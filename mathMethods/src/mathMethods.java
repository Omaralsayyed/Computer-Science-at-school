/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omsay9559
 */
public class mathMethods extends javax.swing.JFrame {

    /**
     * Creates new form mathMethods
     */
    public mathMethods() {
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

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        instLargest = new javax.swing.JLabel();
        numsLargest = new javax.swing.JTextField();
        btnLargest = new javax.swing.JButton();
        instSmallest = new javax.swing.JLabel();
        numsSmallest = new javax.swing.JTextField();
        btnSmallest = new javax.swing.JButton();
        instPower = new javax.swing.JLabel();
        numsPower = new javax.swing.JTextField();
        btnPower = new javax.swing.JButton();
        instHyp = new javax.swing.JLabel();
        numsHyp = new javax.swing.JTextField();
        btnHyp = new javax.swing.JButton();
        instDown = new javax.swing.JLabel();
        numsDown = new javax.swing.JTextField();
        btnDown = new javax.swing.JButton();
        instUp = new javax.swing.JLabel();
        numsUp = new javax.swing.JTextField();
        btnUp = new javax.swing.JButton();
        instSqrt = new javax.swing.JLabel();
        numsSqrt = new javax.swing.JTextField();
        btnSqrt = new javax.swing.JButton();
        instRad = new javax.swing.JLabel();
        numsRads = new javax.swing.JTextField();
        btnRad = new javax.swing.JButton();
        numsLargest1 = new javax.swing.JTextField();
        numsSmallest1 = new javax.swing.JTextField();
        numsPower1 = new javax.swing.JTextField();
        numsHyp1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        Title.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        Title.setText("Magical Math Methods");

        instLargest.setText("Enter two numbers. The program will display the largest of the two numbers.");

        numsLargest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsLargestActionPerformed(evt);
            }
        });

        btnLargest.setText("Largest");
        btnLargest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLargestActionPerformed(evt);
            }
        });

        instSmallest.setText("Enter two numbers. The program will display the smallest of the two numbers.");

        numsSmallest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsSmallestActionPerformed(evt);
            }
        });

        btnSmallest.setText("Smallest");
        btnSmallest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmallestActionPerformed(evt);
            }
        });

        instPower.setText("Enter two numbers. The program will display the first number to the power of the second");

        numsPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsPowerActionPerformed(evt);
            }
        });

        btnPower.setText("To the power of");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        instHyp.setText("Enter the length of two sides of a right angle triangle. The program will display the hypotenuse.");

        numsHyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsHypActionPerformed(evt);
            }
        });

        btnHyp.setText("Hypotenuse");
        btnHyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHypActionPerformed(evt);
            }
        });

        instDown.setText("Enter a decimal value. The program will display the value rounded down to the nearest integer.");

        numsDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsDownActionPerformed(evt);
            }
        });

        btnDown.setText("Round Down");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        instUp.setText("Enter a decimal value. The program will display the value rounded up to the nearest integer.");

        numsUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsUpActionPerformed(evt);
            }
        });

        btnUp.setText("Round Up");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        instSqrt.setText("Enter an integer. The program will display the square root of the integer.");

        numsSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsSqrtActionPerformed(evt);
            }
        });

        btnSqrt.setText("Square Root");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        instRad.setText("Enter an angle in degrees. The program will display the angle in radians");

        numsRads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsRadsActionPerformed(evt);
            }
        });

        btnRad.setText("In Radians");
        btnRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadActionPerformed(evt);
            }
        });

        numsLargest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsLargest1ActionPerformed(evt);
            }
        });

        numsSmallest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsSmallest1ActionPerformed(evt);
            }
        });

        numsPower1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsPower1ActionPerformed(evt);
            }
        });

        numsHyp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsHyp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(instLargest)
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instSmallest)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(numsPower, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(numsPower1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(221, 221, 221)
                                    .addComponent(btnPower))
                                .addComponent(instPower)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numsLargest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numsLargest1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLargest))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numsSmallest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numsSmallest1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSmallest)))
                        .addGap(75, 75, 75))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(instHyp)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numsRads, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(instDown)
                                    .addComponent(instUp)
                                    .addComponent(instSqrt)
                                    .addComponent(instRad))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(numsHyp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numsHyp1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHyp)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(numsDown, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDown)
                                .addGap(58, 58, 58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numsUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUp)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnRad))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(numsSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSqrt)))
                                .addGap(48, 48, 48))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instLargest)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsLargest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numsLargest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLargest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instSmallest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsSmallest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSmallest)
                    .addComponent(numsSmallest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instPower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPower)
                    .addComponent(numsPower1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instHyp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsHyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHyp)
                    .addComponent(numsHyp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(instDown)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDown))
                .addGap(18, 18, 18)
                .addComponent(instUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instSqrt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numsRads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRad))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numsLargestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsLargestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsLargestActionPerformed

    private void btnLargestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLargestActionPerformed
      int num1, num2, maxNum;
      
      num1  =Integer.parseInt(numsLargest.getText());
      num2  =Integer.parseInt(numsLargest1.getText());
      
      maxNum = (Math.max(num1, num2));
      btnLargest.setText("The Larger number is " + String.valueOf(maxNum)+".");
       
    }//GEN-LAST:event_btnLargestActionPerformed

    private void numsSmallestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsSmallestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsSmallestActionPerformed

    private void btnSmallestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmallestActionPerformed
          int num1, num2, minNum;
      
      num1  =Integer.parseInt(numsSmallest.getText());
      num2  =Integer.parseInt(numsSmallest1.getText());
      
      minNum = (Math.min(num1, num2));
      btnSmallest.setText("The smaller number is " + String.valueOf(minNum)+".");
    }//GEN-LAST:event_btnSmallestActionPerformed

    private void numsPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsPowerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsPowerActionPerformed

    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
          int num1 = 0, num2=0, powNum;
      
      num1  =Integer.parseInt(numsPower.getText());
      num2  =Integer.parseInt(numsPower1.getText());
      
      powNum = (int) (Math.pow(num1, num2));
      
      btnPower.setText("The answer is " + String.valueOf(powNum)+".");
    }//GEN-LAST:event_btnPowerActionPerformed

    private void numsHypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsHypActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsHypActionPerformed

    private void btnHypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHypActionPerformed
      int num1 = 0, num2 =0, hypNum;
      
      num1  =Integer.parseInt(numsHyp.getText());
      num2  =Integer.parseInt(numsHyp1.getText());
      
      hypNum = (int) (Math.hypot(num1, num2));
      
      btnHyp.setText("The hypotonuse is " + String.valueOf(hypNum)+".");
    }//GEN-LAST:event_btnHypActionPerformed

    private void numsDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsDownActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
             int num1 = 0, downNum;
     
      num1  =Integer.parseInt(numsDown.getText());
      
      downNum = (int) (Math.floor(num1));
      
      btnDown.setText("The rounded number is " + String.valueOf(downNum)+".");
    }//GEN-LAST:event_btnDownActionPerformed

    private void numsUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsUpActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
   int num1 = 0, upNum;
     
      num1  =Integer.parseInt(numsUp.getText());
      
      upNum = (int) (Math.ceil(num1));
      
      btnUp.setText("The rounded number is " + String.valueOf(upNum)+".");    }//GEN-LAST:event_btnUpActionPerformed

    private void numsSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsSqrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsSqrtActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
          int num1 = 0, sqrtNum;
     
      num1  =Integer.parseInt(numsSqrt.getText());
      
      sqrtNum = (int) (Math.sqrt(num1));
      
      btnSqrt.setText("The answer is " + String.valueOf(sqrtNum)+".");
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void numsRadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsRadsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsRadsActionPerformed

    private void btnRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadActionPerformed
           int num1 =0, radNum;
     
      num1  =Integer.parseInt(numsRads.getText());
      
      radNum = (int) (Math.toRadians(num1));
      
      btnRad.setText("The answer is " + String.valueOf(radNum)+".");
    }//GEN-LAST:event_btnRadActionPerformed

    private void numsLargest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsLargest1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsLargest1ActionPerformed

    private void numsSmallest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsSmallest1ActionPerformed
         
    }//GEN-LAST:event_numsSmallest1ActionPerformed

    private void numsPower1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsPower1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsPower1ActionPerformed

    private void numsHyp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsHyp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsHyp1ActionPerformed

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
            java.util.logging.Logger.getLogger(mathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnHyp;
    private javax.swing.JButton btnLargest;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnRad;
    private javax.swing.JButton btnSmallest;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnUp;
    private javax.swing.JLabel instDown;
    private javax.swing.JLabel instHyp;
    private javax.swing.JLabel instLargest;
    private javax.swing.JLabel instPower;
    private javax.swing.JLabel instRad;
    private javax.swing.JLabel instSmallest;
    private javax.swing.JLabel instSqrt;
    private javax.swing.JLabel instUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numsDown;
    private javax.swing.JTextField numsHyp;
    private javax.swing.JTextField numsHyp1;
    private javax.swing.JTextField numsLargest;
    private javax.swing.JTextField numsLargest1;
    private javax.swing.JTextField numsPower;
    private javax.swing.JTextField numsPower1;
    private javax.swing.JTextField numsRads;
    private javax.swing.JTextField numsSmallest;
    private javax.swing.JTextField numsSmallest1;
    private javax.swing.JTextField numsSqrt;
    private javax.swing.JTextField numsUp;
    // End of variables declaration//GEN-END:variables
}
