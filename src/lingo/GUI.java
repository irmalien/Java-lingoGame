/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingo;

import java.util.Arrays;
import java.util.Random;
import java.awt.event.KeyEvent;

/**
 *
 * @author Asus
 */
public class GUI extends javax.swing.JPanel {

    //globālās funkcijas
        String word = "";       
        int gamesLeft = 0;
        char[] wordArray = word.toCharArray();
        char[] temporalArray = new char[5];
        char[] guessedWordArray;
        
        boolean checkInput = false;
        boolean newGame = true;
        boolean repeatedGame = false;
        
        
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public String RandomWords(){
    String[] wordsArray = new String[26];
    wordsArray[0] = "APPLE";
    wordsArray[1] = "BRAIN";
    wordsArray[2] = "CHINA";
    wordsArray[3] = "DREAM";
    wordsArray[4] = "EARTH";
    wordsArray[5] = "FAITH";
    wordsArray[6] = "GROUP";
    wordsArray[7] = "HORSE";
    wordsArray[8] = "INDEX";
    wordsArray[9] = "JOINT";
    wordsArray[10] = "LASER";
    wordsArray[11] = "INDEX";
    wordsArray[12] = "JOINT";
    wordsArray[13] = "LASER";
    wordsArray[14] = "MOVIE";
    wordsArray[15] = "NOISE";
    wordsArray[16] = "OCEAN";
    wordsArray[17] = "PAINT";
    wordsArray[18] = "QUEEN";
    wordsArray[19] = "ROYAL";
    wordsArray[20] = "SPORT";
    wordsArray[21] = "TRAIN";
    wordsArray[22] = "URBAN";
    wordsArray[23] = "VIRUS";
    wordsArray[24] = "WATER";
    wordsArray[25] = "YOUTH";
    
    Random r=new Random();
    int randomNumber=r.nextInt(wordsArray.length);
    String word = wordsArray[randomNumber];
    return word;
    
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_1 = new javax.swing.JTextField();
        jButtonGuess = new javax.swing.JButton();
        jLabelAtbilde = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        jTextField_1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jTextField_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_1.setAutoscrolls(false);
        jTextField_1.setBorder(null);
        jTextField_1.setPreferredSize(new java.awt.Dimension(50, 50));
        jTextField_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_1ActionPerformed(evt);
            }
        });
        jTextField_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_1KeyPressed(evt);
            }
        });

        jButtonGuess.setBackground(new java.awt.Color(255, 204, 102));
        jButtonGuess.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuess.setText("Guess!");
        jButtonGuess.setActionCommand("");
        jButtonGuess.setBorder(null);
        jButtonGuess.setBorderPainted(false);
        jButtonGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuessActionPerformed(evt);
            }
        });

        jLabelAtbilde.setFont(new java.awt.Font("Roboto", 2, 11)); // NOI18N
        jLabelAtbilde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtbilde.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setOpaque(true);

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setOpaque(true);

        jLabel44.setBackground(new java.awt.Color(204, 204, 204));
        jLabel44.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setOpaque(true);

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setOpaque(true);

        jLabel42.setBackground(new java.awt.Color(204, 204, 204));
        jLabel42.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setOpaque(true);

        jLabel41.setBackground(new java.awt.Color(204, 204, 204));
        jLabel41.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setOpaque(true);

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setOpaque(true);

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setOpaque(true);

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setOpaque(true);

        jLabel45.setBackground(new java.awt.Color(204, 204, 204));
        jLabel45.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setOpaque(true);

        jLabel55.setBackground(new java.awt.Color(204, 204, 204));
        jLabel55.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setOpaque(true);

        jLabel54.setBackground(new java.awt.Color(204, 204, 204));
        jLabel54.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setOpaque(true);

        jLabel53.setBackground(new java.awt.Color(204, 204, 204));
        jLabel53.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setOpaque(true);

        jLabel52.setBackground(new java.awt.Color(204, 204, 204));
        jLabel52.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setOpaque(true);

        jLabel51.setBackground(new java.awt.Color(204, 204, 204));
        jLabel51.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelAtbilde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuess, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jTextField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAtbilde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private String checkInput(String guessedWord){
        
        if(guessedWord.matches(".*\\W+.*") || guessedWord.matches(".*\\d+.*")){ //"^[a-zA-Z0-9]+$" ".*[a-zA-Z]+.*"  ".*[0-9]+.*" ".*\\D+.*"
            checkInput = false;
            return guessedWord;
        } 
        if(guessedWord.length() != 5){
            checkInput = false;
            return guessedWord;
        } 
        else if(guessedWord.matches(".*[a-zA-Z]+.*")){
            guessedWord = guessedWord.toUpperCase();
            checkInput = true;
            return guessedWord; 
    }
        return guessedWord;   
    }
    
    private void fillLabels (int gamesLeft, int label, int R, int G, int B){
        if(gamesLeft == 4){
                switch (label) {
                    case 0:  jLabel11.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 1:  jLabel12.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 2:  jLabel13.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 3:  jLabel14.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 4:  jLabel15.setBackground(new java.awt.Color(R, G, B));
                             break;         
                }
        }
        if(gamesLeft == 3){
                switch (label) {
                    case 0:  jLabel21.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 1:  jLabel22.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 2:  jLabel23.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 3:  jLabel24.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 4:  jLabel25.setBackground(new java.awt.Color(R, G, B));
                             break;         
                }                
        }
        if(gamesLeft == 2){
                switch (label) {
                    case 0:  jLabel31.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 1:  jLabel32.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 2:  jLabel33.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 3:  jLabel34.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 4:  jLabel35.setBackground(new java.awt.Color(R, G, B));
                             break;         
                }
        }
        if(gamesLeft == 1){
                switch (label) {
                    case 0:  jLabel41.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 1:  jLabel42.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 2:  jLabel43.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 3:  jLabel44.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 4:  jLabel45.setBackground(new java.awt.Color(R, G, B));
                             break;         
                }                
        }
        if(gamesLeft == 0){
                switch (label) {
                    case 0:  jLabel51.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 1:  jLabel52.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 2:  jLabel53.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 3:  jLabel54.setBackground(new java.awt.Color(R, G, B));
                             break;
                    case 4:  jLabel55.setBackground(new java.awt.Color(R, G, B));
                             break;         
                }                
        }
    }
    
    private void fillLabelsText (int gamesLeft, int label, char character){
        if(gamesLeft == 4){
                switch (label) {
                    case 0:  jLabel11.setText("" + character);;
                             break;
                    case 1:  jLabel12.setText("" + character);;
                             break;
                    case 2:  jLabel13.setText("" + character);;
                             break;
                    case 3:  jLabel14.setText("" + character);;
                             break;
                    case 4:  jLabel15.setText("" + character);;
                             break;         
                    }
        }
        if(gamesLeft == 3){
                switch (label) {
                    case 0:  jLabel21.setText("" + character);;
                             break;
                    case 1:  jLabel22.setText("" + character);;
                             break;
                    case 2:  jLabel23.setText("" + character);;
                             break;
                    case 3:  jLabel24.setText("" + character);;
                             break;
                    case 4:  jLabel25.setText("" + character);;
                             break;         
                    } 
        }
        if(gamesLeft == 2){
                switch (label) {
                    case 0:  jLabel31.setText("" + character);;
                             break;
                    case 1:  jLabel32.setText("" + character);;
                             break;
                    case 2:  jLabel33.setText("" + character);;
                             break;
                    case 3:  jLabel34.setText("" + character);;
                             break;
                    case 4:  jLabel35.setText("" + character);;
                             break;         
                    }
        }
        if(gamesLeft == 1){
                switch (label) {
                    case 0:  jLabel41.setText("" + character);;
                             break;
                    case 1:  jLabel42.setText("" + character);;
                             break;
                    case 2:  jLabel43.setText("" + character);;
                             break;
                    case 3:  jLabel44.setText("" + character);;
                             break;
                    case 4:  jLabel45.setText("" + character);;
                             break;         
                    } 
        }
        if(gamesLeft == 0){
                switch (label) {
                    case 0:  jLabel51.setText("" + character);;
                             break;
                    case 1:  jLabel52.setText("" + character);;
                             break;
                    case 2:  jLabel53.setText("" + character);;
                             break;
                    case 3:  jLabel54.setText("" + character);;
                             break;
                    case 4:  jLabel55.setText("" + character);;
                             break;         
                    } 
        }
    }
    
    private void gameMechanics(){
        // Initialize first game and select random word
        if(newGame==true){
            word = "APPLE";
            wordArray = word.toCharArray();
            gamesLeft = 5;
            jLabel11.setText("");
            newGame=false;
        }
        // Initialize next game
        if(repeatedGame==true){
            word = RandomWords();
            wordArray = word.toCharArray();
            gamesLeft = 5;
            jButtonGuess.setText("Guess!");
            jTextField_1.setText("");
            jLabelAtbilde.setText("");
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                fillLabels (j, i, 204, 204, 204);
                fillLabelsText (j, i ,' ');
                }
            }
            jTextField_1.setEnabled(true);
            repeatedGame=false;
            return;
        }
        
        //Read word from field, check input function
        String guessedWord = jTextField_1.getText();    
        guessedWord = checkInput(guessedWord);
        
        if(checkInput==true && gamesLeft >0){
            gamesLeft = gamesLeft -1; //every time the button is clicked, reduce by remaining games by one 
            jLabelAtbilde.setText("");
            guessedWordArray = guessedWord.toCharArray(); // Create array from guessed word
            
            //Game is won
            if(Arrays.equals(guessedWordArray, wordArray)){
                jLabelAtbilde.setText("Congratulations, you win!");
                for(int i=0; i<5; i++){
                    fillLabels (gamesLeft, i, 153, 255, 102);
                    fillLabelsText (gamesLeft, i , guessedWordArray[i]);
                }
                repeatedGame=true;
                jButtonGuess.setText("Start New Game!");
                return;
            }
            // Step 0, create temporal array of wordArray for editing
            System.arraycopy(wordArray, 0, temporalArray, 0, 5);
            
            // Step 1, mark all labels as incorrect
            for(int i=0; i<5; i++){
                fillLabels (gamesLeft, i, 255, 51, 51);
                fillLabelsText (gamesLeft, i , guessedWordArray[i]);
            }
            
            //Step 2, mark all labels that have correct letter and place and take out of temporal array
            for(int i=0; i<5; i++){
                if(guessedWordArray[i] == temporalArray[i]){
                    fillLabels (gamesLeft, i, 153, 255, 102);
                    guessedWordArray[i] = '*'; 
                    temporalArray[i] = '_';                
                }
            }
            
            // Step 3, mark labels that have correct letter but wrong place
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if (guessedWordArray[i] == temporalArray[j]){
                        guessedWordArray[i] = '*';
                        temporalArray[j] = '_';
                        fillLabels (gamesLeft, i, 255, 204, 102);             
                    }
                }
            }
            System.out.print(gamesLeft); 

        jLabelAtbilde.setText(gamesLeft + " attempts left!");  
        }
        else if (checkInput==false && gamesLeft >1){
            jLabelAtbilde.setText("The word must consist of five letters");            
        }
        
        else{
            jTextField_1.setText(word);
            jLabelAtbilde.setText("Game over, you lost");
            repeatedGame=true;
            jButtonGuess.setText("Start New Game!");
            return;
        }
    }
    
    private void jTextField_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_1ActionPerformed

    private void jButtonGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuessActionPerformed
        gameMechanics();
    }//GEN-LAST:event_jButtonGuessActionPerformed

    private void jTextField_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            gameMechanics();
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuess;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabelAtbilde;
    private javax.swing.JTextField jTextField_1;
    // End of variables declaration//GEN-END:variables
}
