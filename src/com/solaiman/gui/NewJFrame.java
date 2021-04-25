package com.solaiman.gui;

import com.solaiman.db.DBConnection;
import com.solaiman.java.GetFolderNames;
import com.solaiman.java.FolderImages;
import com.solaiman.java.Item;
import com.solaiman.java.StoreData;
import com.solaiman.java.Subject;
import com.solaiman.java.TextReader;
import com.solaiman.java.Tomail;
import com.solaiman.java.URL;
import com.solaiman.java.mail.EmailUtil;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.DefaultCaret;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewJFrame extends javax.swing.JFrame {

    Date date, date1;
    Thread t;
    List<Item> list;
    File[] imageFile;
    int mnth, day;
    WebDriver driver;

    public NewJFrame() {
        initComponents();
        //this.driver = ConnectToWeb.PanthonJS();
        list = new ArrayList<Item>();
        sendBtn.setVisible(false);
        date = new Date();
        mnth = date.getMonth();
        mnth++;
        day = date.getDate();

        tdate.setText(day + "/" + mnth + "/2019");
        //subject.setText("OTP CAN NOT BE EMPTY");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stopBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        loop = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        subjectDir = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        emailDir1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bodyDir = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fileDir = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        timer = new javax.swing.JTextField();
        tdate = new javax.swing.JTextField();
        subject = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pbar = new javax.swing.JProgressBar();
        sendstts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEAMS Pro v1.0");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 4, true)));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stopBtn.setBackground(new java.awt.Color(204, 0, 51));
        stopBtn.setFont(new java.awt.Font("Arkhip", 1, 14)); // NOI18N
        stopBtn.setForeground(new java.awt.Color(255, 255, 255));
        stopBtn.setText("Stop");
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });
        jPanel1.add(stopBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 90, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 4, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arkhip", 1, 14), new java.awt.Color(0, 153, 102))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel1.setText("SendTo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 38));

        username.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(0, 153, 153));
        username.setText("solaiman");
        username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 100, 30));

        password.setFont(new java.awt.Font("Arkhip", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(0, 153, 153));
        password.setText("longterm_bgd.npl@mzv.cz");
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel2.setText("User");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 38));

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 80, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("MEAMS v1.0");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 140, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel8.setText("Pass");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 38));

        username1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        username1.setForeground(new java.awt.Color(0, 153, 153));
        username1.setText("#Sourove123456");
        username1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        jPanel3.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 100, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel9.setText("Loop");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 38));

        loop.setFont(new java.awt.Font("Arkhip", 0, 12)); // NOI18N
        loop.setForeground(new java.awt.Color(0, 153, 153));
        loop.setText("0");
        loop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loopActionPerformed(evt);
            }
        });
        jPanel3.add(loop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 200));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 4, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arkhip", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Subject :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        subjectDir.setBackground(new java.awt.Color(102, 102, 102));
        subjectDir.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        subjectDir.setForeground(new java.awt.Color(204, 204, 204));
        subjectDir.setText("C:\\Data\\Subject.txt");
        jPanel4.add(subjectDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 380, 20));

        jButton7.setText("...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arkhip", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Email :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        emailDir1.setBackground(new java.awt.Color(102, 102, 102));
        emailDir1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        emailDir1.setForeground(new java.awt.Color(204, 204, 204));
        emailDir1.setText("C:\\Data\\Email.txt");
        jPanel4.add(emailDir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 380, 20));

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arkhip", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Body :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        bodyDir.setBackground(new java.awt.Color(102, 102, 102));
        bodyDir.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        bodyDir.setForeground(new java.awt.Color(204, 204, 204));
        bodyDir.setText("C:\\Data\\Body.txt");
        bodyDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyDirActionPerformed(evt);
            }
        });
        jPanel4.add(bodyDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 380, 20));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arkhip", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Attach Files :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 170, 80, -1));

        fileDir.setBackground(new java.awt.Color(102, 102, 102));
        fileDir.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        fileDir.setForeground(new java.awt.Color(204, 204, 204));
        fileDir.setText("C:\\Data\\img_list");
        jPanel4.add(fileDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 169, 380, -1));

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, 20));

        timer.setBackground(new java.awt.Color(102, 102, 102));
        timer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        timer.setForeground(new java.awt.Color(204, 204, 204));
        timer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timer.setText("11-00-00");
        timer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timerMouseClicked(evt);
            }
        });
        jPanel4.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 30));

        tdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdate.setForeground(new java.awt.Color(0, 153, 153));
        tdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tdate.setText("dd. mm. yyyy");
        tdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdateActionPerformed(evt);
            }
        });
        jPanel4.add(tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 30));

        subject.setEditable(false);
        subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subject.setForeground(new java.awt.Color(255, 102, 0));
        subject.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subject.setText("Email Subject ");
        subject.setToolTipText("");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });
        jPanel4.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 270, -1));

        jButton6.setBackground(new java.awt.Color(0, 153, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Get");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 60, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vector-grunge-air-mail-background.jpg"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 570, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 580, 200));

        result.setColumns(20);
        result.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        result.setRows(5);
        result.setText("Bulk email software is software that is used to send emails in large quantities.\n\nGOTO Link below to turn on Less secure app access.\n******https://myaccount.google.com/lesssecureapps?pli=1******");
        result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 4));
        jScrollPane1.setViewportView(result);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 510, 210));

        sendBtn.setBackground(new java.awt.Color(0, 153, 102));
        sendBtn.setFont(new java.awt.Font("Arkhip", 1, 14)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 80, 30));

        jButton5.setBackground(new java.awt.Color(255, 102, 51));
        jButton5.setFont(new java.awt.Font("Arkhip", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Load");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 212, 100, 40));

        pbar.setBackground(new java.awt.Color(102, 102, 102));
        pbar.setForeground(new java.awt.Color(0, 153, 102));
        jPanel1.add(pbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 230, -1));

        sendstts.setBackground(new java.awt.Color(102, 102, 102));
        sendstts.setFont(new java.awt.Font("Arkhip", 1, 18)); // NOI18N
        sendstts.setForeground(new java.awt.Color(255, 102, 102));
        sendstts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sendstts.setText("Counter");
        jPanel1.add(sendstts, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        driver.close();
        System.exit(0);

    }//GEN-LAST:event_stopBtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed

        String otp = subject.getText().toString().trim();
        System.out.println(otp);
        if (!otp.contains("OTP CAN NOT BE EMPTY")) {
            System.out.println("fuck");
            Subject.sub = otp;
            Tomail.sub = otp;

            sendNow();
        } else {
            System.out.println("ok");
            subject.setText("OTP CAN NOT BE EMPTY");
        }


    }//GEN-LAST:event_sendBtnActionPerformed
    public void sendNow() {
        String totalTime = timer.getText();
        if (totalTime == null) {
            timer.setText("set timer");
        } else {
            String[] sepTime = totalTime.split("-");
            SimpleDateFormat ft = new SimpleDateFormat("hh-mm-ss");

            new Thread(new Runnable() {
                @Override
                public void run() {
                    boolean checker = true;
                    int i = 0;
                    int limit = list.size();
                    while (true) {
                        date1 = new Date();
                        String patternDate = ft.format(date1);
                        String[] sepTime1 = patternDate.split("-");
                        if (i == limit - 1) {
                            checker = false;
                        }
                        try {

                            if ((sepTime[0].equals(sepTime1[0])) && (sepTime[1].equals(sepTime1[1])) && (Integer.parseInt(sepTime1[2]) >= Integer.parseInt(sepTime[2]))) {
                                System.out.println("Message is ready to send");
                                Tsend(list.get(i).getEmail(), list.get(i).getBody(), list.get(i).getImage());
                                Thread.sleep(3000);
                                break;

                            } else {
                                Thread.sleep(2000);
                                //System.out.println(date1.toString());
                                //continue;
                            }

                        } catch (Exception e) {
                            setResult(" number " + String.valueOf(i + 1) + " send faild");
                        }
                    }

                }
            }).start();
        }
    }

    public void setcounter(int j) {
        sendstts.setText(String.valueOf(+1) + " success");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        JFileChooser jfc = new JFileChooser(FileSystesubjectDirtFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jfc.setFileFilter(filter);

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            emailDir.setText(selectedFile.getAbsolutePath());
            pbar.setValue(15);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jfc.setFileFilter(filter);

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            bodyDir.setText(selectedFile.getAbsolutePath());
            pbar.setValue(pbar.getValue() + 15);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            fileDir.setText(selectedFile.getPath());
            pbar.setValue(pbar.getValue() + 20);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (username.getText().contains("solaiman")) {

            sendBtn.setVisible(true);

            Tomail.toMail = (password.getText().trim());
            TomailsubjectDir(username1.getText().trim());
            Tomail.loop = Integer.parseInt(loop.getText());

        } else {
            sendBtn.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        StoreData store = new StoreData();

        try {
            String emailsTxt = TextReader.text(emailDir.getText());
            String emails[] = emailsTxt.split("\n");
            if (emails.length != 0) {
                store.setEmails(emails);
                result.setText(result.getText() + "\n" + "Emails added successfully");
                pbar.setValue(pbar.getValue() + 15);

            }
            for (String email : emails) {
                if (email.contains("@")) {
                    setResult(email);
                    System.out.println(email);
                }
            }
        } catch (IOException ex) {
            result.setText(result.getText() + "\n" + ex);
        }

        String body[] = null;
        try {
            body = TextReader.body(bodyDir.getText());
            if (body.length != 0) {
                store.setBody(body);
                result.setText(result.getText() + "\n" + "Body added successfully");
                for (String newBody : body) {

                    result.setText(result.getText() + "\n" + newBody);
                }
                pbar.setValue(pbar.getValue() + 15);
            }
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        setResult(body.length + " body found");

        String[] folders = GetFolderNames.get(fileDir.getText());
        //System.out.println(fileDir.getText());
        List<File[]> file = new ArrayList<File[]>();
        File[] temp;

        for (int i = 0; i < folders.length; i++) {

            try {
                temp = FolderImages.file(folders[i]);
                file.add(temp);
            } catch (Exception e) {

            }

        }

        store.setFile(file);
        result.setText(result.getText() + "\n" + "File added successfully");
        for (int i = 0; i < file.size(); i++) {
            temp = file.get(i);
            for (File newTemp : temp) {
                System.out.println(newTemp.getName());
                result.setText(result.getText() + "\n" + newTemp.getName());
            }
        }

        list = store.storeItem();
        result.setText(result.getText() + "\n" + "List added successfully");


    }//GEN-LAST:event_jButton5ActionPerformed

    private void timerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timerMouseClicked
        // TODO add your handling code here:
        timer.setText("");
    }//GEN-LAST:event_timerMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void bodyDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyDirActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        Connection con = DBConnection.connect();

        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (DBConnection.getData(con, tdate.getText()) != null) {
                        String subg = DBConnection.getData(con, tdate.getText());
                        subject.setText(subg);
                        Subject.sub = subg;
                        Tomail.sub = subg;
                        //sendNow();
                        break;
                    } else {
                        System.out.println("please w8");
                        continue;
                    }

                }

            }
        }).start();

        subject.setText("loading data");

        //getOTP();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void tdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdateActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void loopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loopActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupposubjectDirAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bodyDir;
    private javax.swing.JTextField emailDir1;
    private javax.swing.JTextField fileDir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loop;
    private javax.swing.JTextField password;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JTextArea result;
    private javax.swing.JButton sendBtn;
    private javax.swing.JLabel sendstts;
    private javax.swing.JButton stopBtn;
    private javax.swing.JTextField subject;
    private javax.swing.JTextField subjectDir;
    private javax.swing.JTextField tdate;
    private javax.swing.JTextField timer;
    private javax.swing.JTextField username;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
    String statusCon = null;
    boolean otpcondition = false;
    String fullText, finalText, otp;
    String[] temp;
    String link = ".article_list > div:nth-child(1)";
    boolean lc = true;
    boolean cc = false;

    private void getOTP() {
        setResult("\nBrowser maximize");
        driver.manage().window().maximize();
        setResult("Loading url");
        driver.get(URL.OTP);
        setResult("url loaded");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement aboutMe;
        setResult(driver.getTitle());
        setResult("waiting for otp");
        aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(link)));
        setResult("link loaded");
        fullText = aboutMe.getText();
        temp = fullText.split(":");
        System.out.println(temp[1]);
        if (fullText.contains(tdate.getText()) && fullText.contains("Bangladesh and Nepal") && !fullText.contains("except")) {
            System.out.println("otp found with date");
            if (statusCon == "fuck") {
                otpcondition = true;
            }
            otpcondition = true;
        } else {
            if (lc) {
                link = ".article_list > div:nth-child(2)";
                lc = false;
                cc = true;
            } else if (cc) {
                link = ".article_list > div:nth-child(3)";
                lc = false;
                cc = false;
            } else {
                link = ".article_list > div:nth-child(1)";
                lc = true;
            }
            System.out.println("sleep case");
            getOTP();
            System.out.println("reloading..............");
        }
        System.out.println("loop break");
        setResult("OTP matched");
        finalText = temp[1].trim();
        otp = finalText.substring(0, 8);
        setResult("otp is:------------- " + otp);
        subject.setText("otp is " + otp);
        result.append("\notp is : " + otp);
        Subject.sub = otp;
        Tomail.sub = "Requsting an appointment " + otp;
        sendNow();

    }

    void fuck() {
        setResult("destroy method is called");
        t.stop();
    }

    public void setResult(String text) {
        result.append(getDate() + " : " + text.toUpperCase() + "\n");
        DefaultCaret caret = (DefaultCaret) result.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    public String getDate() {
        date = new Date();
        return date.toString();
    }

    public void Tsend(String from, String body, File[] image) {
        System.out.println("prepare login");
        final String fromEmail = from.replace("\n", "").trim();
        final String password = Tomail.pass;
        final String toEmail = Tomail.toMail;
        setResult("TLSEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.secure", "true");

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        System.out.println("Authentication matched");
        System.out.println("Login Complete");
        Session session = Session.getInstance(props, auth);
        TsendEmail(session, fromEmail, toEmail, Tomail.sub, body, image);
    }

    public void TsendEmail(Session session, String from, String toEmail, String subject, String body, File[] image) {
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress(from, from));
            msg.setReplyTo(InternetAddress.parse(from, false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            String[] attachFiles = new String[image.length];
            int i = 0;
            for (File newImage : image) {
                attachFiles[i] = newImage.getPath().replace("\n", "");
                i++;
            }
            if ((attachFiles != null) && (attachFiles.length > 0)) {
                for (String filePath : attachFiles) {
                    MimeBodyPart attachPart = new MimeBodyPart();
                    try {
                        attachPart.attachFile(filePath);
                        System.out.println(filePath);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    multipart.addBodyPart(attachPart);
                }
            }
            msg.setContent(multipart);

            setResult("Message is ready");

            new Thread(new Runnable() {
                @Override
                public void run() {
                    int i;
                    for (i = 0; i <= Tomail.loop; i++) {

                        try {
                            Transport.send(msg);
                            System.out.println(new Date().toString() + " Email " + String.valueOf(i) + " Sent Successfully!!");
                            Thread.sleep(2000);
                        } catch (MessagingException ex) {
                            setResult("Email Sent faild!!");
                            //Logger.getLogger(EmailUtil.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    JOptionPane.showMessageDialog(null, i + " Mails sent successfully");
                }
            }).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
