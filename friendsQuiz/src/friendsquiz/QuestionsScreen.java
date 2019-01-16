/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omsay9559
 */
public class QuestionsScreen extends javax.swing.JFrame {
int questionNum = 0;
double incorrectScore = 0;
double correctScore = 0;
    /**
     * Creates new form QuestionsScreen
     */
    public QuestionsScreen() {
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

        questionLbl0 = new javax.swing.JLabel();
        ansALbl0 = new javax.swing.JLabel();
        ansBLbl0 = new javax.swing.JLabel();
        ansCLbl0 = new javax.swing.JLabel();
        ansDLbl0 = new javax.swing.JLabel();
        answerPromptLbl0 = new javax.swing.JLabel();
        userAnswer0 = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        numCorrectLbl = new javax.swing.JLabel();
        numIncorrectLbl = new javax.swing.JLabel();
        perCorrectLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        youAreUserLbl = new javax.swing.JLabel();
        numCorrectNum = new javax.swing.JLabel();
        numIncorrectNum = new javax.swing.JLabel();
        perCorrectNum = new javax.swing.JLabel();
        nextQBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionLbl0.setFont(new java.awt.Font("Manga Temple", 0, 24)); // NOI18N
        questionLbl0.setForeground(new java.awt.Color(204, 0, 0));
        questionLbl0.setText("How many categories of towels does Monica Have?");

        ansALbl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ansALbl0.setForeground(new java.awt.Color(204, 0, 0));
        ansALbl0.setText("A) 9");

        ansBLbl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ansBLbl0.setForeground(new java.awt.Color(204, 0, 0));
        ansBLbl0.setText("B) 7");

        ansCLbl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ansCLbl0.setForeground(new java.awt.Color(204, 0, 0));
        ansCLbl0.setText("C) 11");

        ansDLbl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ansDLbl0.setForeground(new java.awt.Color(204, 0, 0));
        ansDLbl0.setText("D) 13");

        answerPromptLbl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        answerPromptLbl0.setForeground(new java.awt.Color(204, 0, 0));
        answerPromptLbl0.setText("Enter Your answer here:");

        userAnswer0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer0ActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(204, 0, 0));
        submitBtn.setText("Submit Answer");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        numCorrectLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numCorrectLbl.setForeground(new java.awt.Color(204, 0, 0));
        numCorrectLbl.setText("Number Correct:");

        numIncorrectLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numIncorrectLbl.setForeground(new java.awt.Color(204, 0, 0));
        numIncorrectLbl.setText("Number Incorrect:");

        perCorrectLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        perCorrectLbl.setForeground(new java.awt.Color(204, 0, 0));
        perCorrectLbl.setText("Percentage Correct:");

        jLabel2.setIcon(new javax.swing.ImageIcon("JFRCVIFS.Student.UGDSB.ED\\Home\\Students\\omsay9559\\Documents\\NetBeansProjects\\friendsQuiz\\large.png")); // NOI18N

        youAreUserLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        youAreUserLbl.setForeground(new java.awt.Color(204, 0, 0));
        youAreUserLbl.setText("You are user #");

        numCorrectNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numCorrectNum.setForeground(new java.awt.Color(204, 0, 0));
        numCorrectNum.setText("0");

        numIncorrectNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numIncorrectNum.setForeground(new java.awt.Color(204, 0, 0));
        numIncorrectNum.setText("0");

        perCorrectNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        perCorrectNum.setForeground(new java.awt.Color(204, 0, 0));
        perCorrectNum.setText("0");

        nextQBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextQBtn.setForeground(new java.awt.Color(204, 0, 0));
        nextQBtn.setText("Next Question");
        nextQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numIncorrectLbl)
                    .addComponent(perCorrectLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(youAreUserLbl)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(numCorrectLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numCorrectNum)
                    .addComponent(perCorrectNum)
                    .addComponent(numIncorrectNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ansALbl0)
                        .addGap(18, 18, 18)
                        .addComponent(ansBLbl0)
                        .addGap(18, 18, 18)
                        .addComponent(ansCLbl0)
                        .addGap(18, 18, 18)
                        .addComponent(ansDLbl0))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(answerPromptLbl0)
                        .addGap(18, 18, 18)
                        .addComponent(userAnswer0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(nextQBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(questionLbl0)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLbl0)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansALbl0)
                    .addComponent(ansBLbl0)
                    .addComponent(ansCLbl0)
                    .addComponent(ansDLbl0))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerPromptLbl0)
                    .addComponent(userAnswer0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextQBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numCorrectNum)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numIncorrectNum)
                                        .addGap(1, 1, 1)
                                        .addComponent(perCorrectNum))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numCorrectLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numIncorrectLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(perCorrectLbl)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(youAreUserLbl)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userAnswer0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer0ActionPerformed

    }//GEN-LAST:event_userAnswer0ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //declare variables
        String answer0, correctPercentage;
     
        double perCorrect, userNum;
        
        submitBtn.setVisible(false);
        
        

        //get user's answers
        answer0 =userAnswer0.getText();
        

        //Check answers
        //question1
        if (questionNum == 0){
        switch (answer0) {
            case "C":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "c":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        } else if(questionNum == 1){
        switch (answer0) {
            case "C":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "c":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        }else if(questionNum == 2){
        switch (answer0) {
            case "B":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "b":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        }else if(questionNum == 3){
        switch (answer0) {
            case "A":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "a":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        }else if(questionNum == 4){
        switch (answer0) {
            case "B":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "b":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        }else if(questionNum == 5){
        switch (answer0) {
            case "C":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "c":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        }else if(questionNum == 6){
        switch (answer0) {
            case "D":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "d":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        } else if(questionNum == 7){
        switch (answer0) {
            case "A":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "a":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        } else if(questionNum == 8){
        switch (answer0) {
            case "c":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "C":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        } else if(questionNum == 9){
        nextQBtn.setText("End Game");
        
        switch (answer0) {
            case "A":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            case "a":
                answerPromptLbl0.setText ("Correct");
                correctScore ++;
                break;
            default:
                answerPromptLbl0.setText ("Incorrect");
                incorrectScore ++;
                break;}
        
       
        }else if(questionNum == 10){
            //generate random number
            userNum= (int)Math.round(Math.random()*100+1);
            youAreUserLbl.setText("Your user Number is: " + String.valueOf(userNum));

            //calculate and display scores
            numCorrectNum.setText (""+correctScore);
            numIncorrectNum.setText (""+incorrectScore);
            perCorrect = ((correctScore /10)*100 );
            perCorrectNum.setText ("%" + perCorrect);
            }                          



        //generate random number
        userNum= (int)Math.round(Math.random()*100+1);
        youAreUserLbl.setText(String.valueOf(userNum));

        //calculate and display scores
        numCorrectNum.setText (""+correctScore);
        numIncorrectNum.setText (""+incorrectScore);
        perCorrect = ((correctScore /10)*100 );
        perCorrectNum.setText ("%" + perCorrect);

    }//GEN-LAST:event_submitBtnActionPerformed

    private void nextQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQBtnActionPerformed
        submitBtn.setVisible(true);
        questionNum ++ ;
        
        if (questionNum == 0){
            questionLbl0.setText("How many catigories of towels does Monica Have?");
            ansALbl0.setText("A) 9");
            ansBLbl0.setText("B) 7");
            ansCLbl0.setText("C) 11");
            ansDLbl0.setText("D) 16");
        } else if (questionNum == 1){
            questionLbl0.setText("What does D.O.A. stand for?");
            ansALbl0.setText("A) Driving Over America");
            ansBLbl0.setText("B) Death Of Accountant");
            ansCLbl0.setText("C) Dead On Arrival");
            ansDLbl0.setText("D) Dying Of Aids");
        }else if (questionNum == 2){
            questionLbl0.setText("What is Chandler's Job?");
            ansALbl0.setText("A) Accountant");
            ansBLbl0.setText("B) IT Procurements Manager");
            ansCLbl0.setText("C) Transponster");
            ansDLbl0.setText("D) IT Information Editor");
        }else if (questionNum == 3){
            questionLbl0.setText("How many times does Ross get married?");
            ansALbl0.setText("A) 3");
            ansBLbl0.setText("B) 2");
            ansCLbl0.setText("C) 1");
            ansDLbl0.setText("D) 4");
        }else if (questionNum == 4){
            questionLbl0.setText("What was Ross's Monkey's name?");
            ansALbl0.setText("A) Marty");
            ansBLbl0.setText("B) Marcel");
            ansCLbl0.setText("C) Muriel");
            ansDLbl0.setText("D) Monty");
        }else if (questionNum == 5){
            questionLbl0.setText("Who was Rachel supposed to marry in the first episode? ");
            ansALbl0.setText("A) Paolo");
            ansBLbl0.setText("B) Ross");
            ansCLbl0.setText("C) Barry");
            ansDLbl0.setText("D) Joshua");
        }else if (questionNum == 6){
            questionLbl0.setText("How does Joey ask women out?");
            ansALbl0.setText("A) Asks for dinner and a movie");
            ansBLbl0.setText("B) Waaazzzzuuuupppp?");
            ansCLbl0.setText("C) What's goin on? ");
            ansDLbl0.setText("D) How you doin?");
        }else if (questionNum == 7){
            questionLbl0.setText("What's Chandler's dad's Las Vegas burlesque show called?");
            ansALbl0.setText("A) Viva Las Gaygas");
            ansBLbl0.setText("B) La Vie En Gay");
            ansCLbl0.setText("C) Cirque De So Gay");
            ansDLbl0.setText("D) Some Gays Over The Rainbow");
        }else if (questionNum == 8){
            questionLbl0.setText("Where does Chandler tell Janice he moved to in oreder to avoid her?");
            ansALbl0.setText("A) Kuwait");
            ansBLbl0.setText("B) Sudan");
            ansCLbl0.setText("C) Yeman");
            ansDLbl0.setText("D) Oman");
        }else if (questionNum == 9){
            questionLbl0.setText("Where did Monica & Chandler first hook up?");
            ansALbl0.setText("A) London");
            ansBLbl0.setText("B) Birmingham");
            ansCLbl0.setText("C) Paris");
            ansDLbl0.setText("D) L.A.");
        }
        
        
    }//GEN-LAST:event_nextQBtnActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QuestionsScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansALbl0;
    private javax.swing.JLabel ansBLbl0;
    private javax.swing.JLabel ansCLbl0;
    private javax.swing.JLabel ansDLbl0;
    private javax.swing.JLabel answerPromptLbl0;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextQBtn;
    private javax.swing.JLabel numCorrectLbl;
    private javax.swing.JLabel numCorrectNum;
    private javax.swing.JLabel numIncorrectLbl;
    private javax.swing.JLabel numIncorrectNum;
    private javax.swing.JLabel perCorrectLbl;
    private javax.swing.JLabel perCorrectNum;
    private javax.swing.JLabel questionLbl0;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField userAnswer0;
    private javax.swing.JLabel youAreUserLbl;
    // End of variables declaration//GEN-END:variables
}