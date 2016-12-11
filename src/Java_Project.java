
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java_Project extends javax.swing.JFrame {

    DB DB = new DB();
    Date now = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    String strSQL = "Select * From idpw"; 
    String ID = "";
    String PW = "";
    String Name = "";
    String Place = "";
    String Time = "";
    String Today = "";
    String Todaynow = format.format(now);
    int A = 8000;
    int T = 6000;
    int Total = 0;

    public Java_Project() {
        initComponents();
    }
    
    public void SignUp(){
        SignUp.setLocation(350,350);
        SignUp.setSize(325,220);
        SignUp.show(); // 회원가입 창 열기
    }
    
    public void MovieCheck(){
        MovieCheck.setLocation(350,350);
        MovieCheck.setSize(460,380);
        MovieCheck.show(); // 영화표 예매창 열기
        dispose(); // 로그인창 닫기
    }
    
    public void MovieChoice(){
        MovieChoice.setLocation(350,350);
        MovieChoice.setSize(360,370);
        MovieChoice.show(); // 영화표 예매창 열기
        dispose(); // 로그인창 닫기
    }

    public void SelectSeat(){
        SelectSeat.setLocation(350,350);
        SelectSeat.setSize(380,330);
        SelectSeat.show();
    }
    
    public void MovieNameCheck(){
        switch(jComboBox1.getSelectedItem().toString()){
            case "신비한 동물사전" :
                Place = "1호관";
                break;
            case "잭 리처 네버 고 백" :
                Place = "2호관";
                break;
            case "형" :
                Place = "3호관";
                break;
            case "닥터 스트레인지" :
                Place = "4호관";
                break;
        }
    }
    
    public static boolean isNum(String str){
        boolean result = false;
        
        try{
            Integer.parseInt(str);
            result = true;
            return result;
        }catch(Exception e){
            return result;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MovieCheck = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblfirst = new javax.swing.JLabel();
        lblsecond = new javax.swing.JLabel();
        lblthird = new javax.swing.JLabel();
        lblfourth = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        textAdult2 = new javax.swing.JTextField();
        textChild = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblamount = new javax.swing.JLabel();
        btnSelectSeat = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        SignUp = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddID = new javax.swing.JTextField();
        AddPW = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnOverCheck = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        AddPW1 = new javax.swing.JTextField();
        SelectSeat = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        MovieChoice = new javax.swing.JFrame();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        textAdult = new javax.swing.JTextField();
        textTeen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lblPlace = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblPeople = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnReserv = new javax.swing.JButton();
        CheckReserv = new javax.swing.JFrame();
        jScrollPane100 = new javax.swing.JScrollPane();
        jTableConfirm = new javax.swing.JTable();
        jLabel107 = new javax.swing.JLabel();
        Popup1 = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        Popup2 = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Popup3 = new javax.swing.JDialog();
        jLabel42 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Popup4 = new javax.swing.JDialog();
        jLabel43 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        Popup5 = new javax.swing.JDialog();
        jLabel44 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        Popup6 = new javax.swing.JDialog();
        jLabel45 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        Popup7 = new javax.swing.JDialog();
        jLabel38 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Popup8 = new javax.swing.JDialog();
        jLabel39 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Popup12 = new javax.swing.JDialog();
        jLabel41 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSignin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textPW = new javax.swing.JPasswordField();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setText("현재 상영 영화");

        jLabel27.setText("연령 등급");

        jLabel28.setText("상영 시간");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("신비한 동물사전");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("닥터 스트레인지");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("잭 리처 : 네버 고 백");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("형");

        jLabel24.setText("11:40");

        jLabel30.setText("14:30");

        jLabel31.setText("17:00");

        jLabel32.setText("19:20");

        jLabel33.setText("12세");

        jLabel34.setText("12세");

        jLabel35.setText("15세");

        jLabel36.setText("12세");

        jLabel37.setText("좌석");

        lblfirst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfirst.setText("20");
        lblfirst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblsecond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsecond.setText("20");
        lblsecond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblthird.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblthird.setText("20");
        lblthird.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblfourth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfourth.setText("20");
        lblfourth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
            .addComponent(jSeparator8)
            .addComponent(jSeparator9)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(lblfourth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel34)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(lblthird, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel33)
                        .addComponent(lblfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(jLabel34)
                        .addComponent(lblsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel35)
                        .addComponent(lblthird, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblfourth, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(jLabel32))
                    .addComponent(jRadioButton4))
                .addContainerGap())
        );

        textAdult2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textAdult2.setText("0");

        textChild.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textChild.setText("0");

        jLabel2.setText("영화표 예매");

        jLabel9.setText("인원 선택 : ");

        jLabel10.setText("성인");

        jLabel11.setText("아동");

        jLabel12.setText("명");

        jLabel13.setText("명");

        jLabel14.setText("금액 : ");

        jLabel15.setText("원");

        jLabel23.setText("명");

        jLabel29.setText("총");

        lbltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSelectSeat.setText("자리선택");
        btnSelectSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectSeatActionPerformed(evt);
            }
        });

        jButton5.setText("예매완료");
        jButton5.setEnabled(false);

        javax.swing.GroupLayout MovieCheckLayout = new javax.swing.GroupLayout(MovieCheck.getContentPane());
        MovieCheck.getContentPane().setLayout(MovieCheckLayout);
        MovieCheckLayout.setHorizontalGroup(
            MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MovieCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MovieCheckLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAdult2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MovieCheckLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MovieCheckLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textChild, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelectSeat))))
                    .addGroup(MovieCheckLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblamount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        MovieCheckLayout.setVerticalGroup(
            MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MovieCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MovieCheckLayout.createSequentialGroup()
                        .addGroup(MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(textAdult2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(textChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(btnSelectSeat)
                            .addComponent(jLabel23)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblamount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MovieCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jButton5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SignUp.setModal(true);

        jLabel1.setText("회원가입");

        jLabel7.setText("ID : ");

        jLabel8.setText("PW : ");

        jButton3.setText("회원가입");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnOverCheck.setText("중복확인");
        btnOverCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverCheckActionPerformed(evt);
            }
        });

        jButton9.setText("취소");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUpLayout = new javax.swing.GroupLayout(SignUp.getContentPane());
        SignUp.getContentPane().setLayout(SignUpLayout);
        SignUpLayout.setHorizontalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpLayout.createSequentialGroup()
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(SignUpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddPW, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(AddID)
                            .addComponent(AddPW1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOverCheck))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SignUpLayout.setVerticalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AddID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOverCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AddPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddPW1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SelectSeat.setModal(true);

        jLabel16.setText("자리 선택");

        jLabel17.setText("명");

        jLabel18.setText("선택가능");

        jLabel19.setText("스크린");

        jLabel20.setText("입구");

        jLabel21.setText("비상구");

        jButton6.setText("취소");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("확인");

        jTextField8.setEditable(false);

        jCheckBox1.setText("1");

        jCheckBox2.setText("2");

        jCheckBox3.setText("3");

        jCheckBox4.setText("4");

        jCheckBox5.setText("5");

        jCheckBox6.setText("6");

        jCheckBox7.setText("7");

        jCheckBox8.setText("8");

        jCheckBox9.setText("9");

        jCheckBox10.setText("10");

        jCheckBox11.setText("11");

        jCheckBox12.setText("12");

        jCheckBox13.setText("13");

        jCheckBox14.setText("14");

        jCheckBox15.setText("15");

        jCheckBox16.setText("16");

        jCheckBox17.setText("17");

        jCheckBox18.setText("18");

        jCheckBox19.setText("19");

        jCheckBox20.setText("20");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout SelectSeatLayout = new javax.swing.GroupLayout(SelectSeat.getContentPane());
        SelectSeat.getContentPane().setLayout(SelectSeatLayout);
        SelectSeatLayout.setHorizontalGroup(
            SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(SelectSeatLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SelectSeatLayout.createSequentialGroup()
                        .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SelectSeatLayout.createSequentialGroup()
                                .addComponent(jCheckBox6)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox7))
                            .addGroup(SelectSeatLayout.createSequentialGroup()
                                .addComponent(jCheckBox16)
                                .addGap(12, 12, 12)
                                .addComponent(jCheckBox17)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox18)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox19)))
                        .addContainerGap(121, Short.MAX_VALUE))
                    .addGroup(SelectSeatLayout.createSequentialGroup()
                        .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SelectSeatLayout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2))
                            .addGroup(SelectSeatLayout.createSequentialGroup()
                                .addComponent(jCheckBox11)
                                .addGap(12, 12, 12)
                                .addComponent(jCheckBox12)))
                        .addGap(18, 18, 18)
                        .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addGroup(SelectSeatLayout.createSequentialGroup()
                                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox13))
                                .addGap(18, 18, 18)
                                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(SelectSeatLayout.createSequentialGroup()
                                            .addComponent(jCheckBox14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCheckBox15))
                                        .addGroup(SelectSeatLayout.createSequentialGroup()
                                            .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jCheckBox9)
                                                .addComponent(jCheckBox4))
                                            .addGap(18, 18, 18)
                                            .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox5)
                                                .addComponent(jCheckBox10))))
                                    .addGroup(SelectSeatLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jCheckBox20)))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectSeatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectSeatLayout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectSeatLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(SelectSeatLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SelectSeatLayout.setVerticalGroup(
            SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectSeatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SelectSeatLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SelectSeatLayout.createSequentialGroup()
                                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox1)
                                        .addComponent(jCheckBox2)
                                        .addComponent(jCheckBox3)
                                        .addComponent(jCheckBox4)
                                        .addComponent(jCheckBox5))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox9)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox14)
                                    .addComponent(jCheckBox11)
                                    .addComponent(jCheckBox12)
                                    .addComponent(jCheckBox13)
                                    .addComponent(jCheckBox15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox16)
                                    .addComponent(jCheckBox17)
                                    .addComponent(jCheckBox18)
                                    .addComponent(jCheckBox19)
                                    .addComponent(jCheckBox20)))))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "신비한 동물사전", "잭 리처 네버 고 백", "형", "닥터 스트레인지" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13시 10분", "15시 40분", "18시 10분", "20시 40분" }));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel100.setText("영화제목");

        jLabel101.setText("상영시간");

        jLabel102.setText("인원");

        jLabel103.setText("성인");

        jLabel104.setText("청소년");

        jLabel105.setText("명");

        jLabel106.setText("명");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel55.setText("결제 정보");

        jLabel40.setText("상영관 :");

        jLabel47.setText("영화제목 :");

        jLabel49.setText("상영시간 :");
        jLabel49.setToolTipText("");

        jLabel51.setText("인원 :");

        jLabel53.setText("금액 :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblName))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTime))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPeople))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrice))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlace))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(lblPlace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(lblTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(lblPeople))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(lblPrice))
                .addContainerGap())
        );

        btnConfirm.setText("확인");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnPay.setText("결제");
        btnPay.setEnabled(false);
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnReserv.setText("예약확인");
        btnReserv.setEnabled(false);
        btnReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MovieChoiceLayout = new javax.swing.GroupLayout(MovieChoice.getContentPane());
        MovieChoice.getContentPane().setLayout(MovieChoiceLayout);
        MovieChoiceLayout.setHorizontalGroup(
            MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator11)
            .addGroup(MovieChoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MovieChoiceLayout.createSequentialGroup()
                        .addGroup(MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MovieChoiceLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(MovieChoiceLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel101)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(MovieChoiceLayout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAdult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel105)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTeen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm)
                        .addContainerGap())))
            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(MovieChoiceLayout.createSequentialGroup()
                .addGroup(MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MovieChoiceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MovieChoiceLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReserv)))
                .addContainerGap())
        );
        MovieChoiceLayout.setVerticalGroup(
            MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MovieChoiceLayout.createSequentialGroup()
                .addGroup(MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MovieChoiceLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MovieChoiceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103)
                    .addComponent(textAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(textTeen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106)
                    .addComponent(jLabel105)
                    .addComponent(btnConfirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MovieChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReserv)
                    .addComponent(btnPay))
                .addContainerGap())
        );

        jTableConfirm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "영화제목", "상영관", "상영시간", "인원", "날짜"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane100.setViewportView(jTableConfirm);

        jLabel107.setText("예약정보 확인");

        javax.swing.GroupLayout CheckReservLayout = new javax.swing.GroupLayout(CheckReserv.getContentPane());
        CheckReserv.getContentPane().setLayout(CheckReservLayout);
        CheckReservLayout.setHorizontalGroup(
            CheckReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckReservLayout.createSequentialGroup()
                .addGroup(CheckReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckReservLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CheckReservLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel107)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CheckReservLayout.setVerticalGroup(
            CheckReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckReservLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Popup1.setModal(true);

        jLabel22.setText("아이디 혹은 비밀번호를 확인하세요.");

        jButton10.setText("확인");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup1Layout = new javax.swing.GroupLayout(Popup1.getContentPane());
        Popup1.getContentPane().setLayout(Popup1Layout);
        Popup1Layout.setHorizontalGroup(
            Popup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup1Layout.createSequentialGroup()
                .addGroup(Popup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22))
                    .addGroup(Popup1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup1Layout.setVerticalGroup(
            Popup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup2.setModal(true);

        jLabel25.setText("인원란에 숫자만 넣어주세요.");

        jButton1.setText("확인");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup2Layout = new javax.swing.GroupLayout(Popup2.getContentPane());
        Popup2.getContentPane().setLayout(Popup2Layout);
        Popup2Layout.setHorizontalGroup(
            Popup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup2Layout.createSequentialGroup()
                .addGroup(Popup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25))
                    .addGroup(Popup2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup2Layout.setVerticalGroup(
            Popup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup3.setModal(true);

        jLabel42.setText("이미 회원가입된 아이디 입니다.");

        jButton8.setText("확인");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup3Layout = new javax.swing.GroupLayout(Popup3.getContentPane());
        Popup3.getContentPane().setLayout(Popup3Layout);
        Popup3Layout.setHorizontalGroup(
            Popup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup3Layout.createSequentialGroup()
                .addGroup(Popup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42))
                    .addGroup(Popup3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup3Layout.setVerticalGroup(
            Popup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup4.setModal(true);

        jLabel43.setText("사용 가능한 아이디입니다.");

        jButton12.setText("확인");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup4Layout = new javax.swing.GroupLayout(Popup4.getContentPane());
        Popup4.getContentPane().setLayout(Popup4Layout);
        Popup4Layout.setHorizontalGroup(
            Popup4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup4Layout.createSequentialGroup()
                .addGroup(Popup4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43))
                    .addGroup(Popup4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup4Layout.setVerticalGroup(
            Popup4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup5.setModal(true);

        jLabel44.setText("회원가입이 완료되었습니다.!");

        jButton13.setText("확인");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup5Layout = new javax.swing.GroupLayout(Popup5.getContentPane());
        Popup5.getContentPane().setLayout(Popup5Layout);
        Popup5Layout.setHorizontalGroup(
            Popup5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup5Layout.createSequentialGroup()
                .addGroup(Popup5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel44))
                    .addGroup(Popup5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup5Layout.setVerticalGroup(
            Popup5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup6.setModal(true);

        jLabel45.setText("비밀번호를 확인해주세요.");

        jButton14.setText("확인");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup6Layout = new javax.swing.GroupLayout(Popup6.getContentPane());
        Popup6.getContentPane().setLayout(Popup6Layout);
        Popup6Layout.setHorizontalGroup(
            Popup6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup6Layout.createSequentialGroup()
                .addGroup(Popup6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel45))
                    .addGroup(Popup6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup6Layout.setVerticalGroup(
            Popup6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup7.setModal(true);

        jLabel38.setText("인원에 숫자만 넣어 주세요");

        jButton2.setText("확인");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup7Layout = new javax.swing.GroupLayout(Popup7.getContentPane());
        Popup7.getContentPane().setLayout(Popup7Layout);
        Popup7Layout.setHorizontalGroup(
            Popup7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup7Layout.createSequentialGroup()
                .addGroup(Popup7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38))
                    .addGroup(Popup7Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup7Layout.setVerticalGroup(
            Popup7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup8.setModal(true);

        jLabel39.setText("인원을 입력해주세요");

        jButton4.setText("확인");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup8Layout = new javax.swing.GroupLayout(Popup8.getContentPane());
        Popup8.getContentPane().setLayout(Popup8Layout);
        Popup8Layout.setHorizontalGroup(
            Popup8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup8Layout.createSequentialGroup()
                .addGroup(Popup8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39))
                    .addGroup(Popup8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup8Layout.setVerticalGroup(
            Popup8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popup12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Popup12.setModal(true);

        jLabel41.setText("결제가 완료되었습니다.");

        jButton11.setText("확인");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popup12Layout = new javax.swing.GroupLayout(Popup12.getContentPane());
        Popup12.getContentPane().setLayout(Popup12Layout);
        Popup12Layout.setHorizontalGroup(
            Popup12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup12Layout.createSequentialGroup()
                .addGroup(Popup12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Popup12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41))
                    .addGroup(Popup12Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Popup12Layout.setVerticalGroup(
            Popup12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popup12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(350, 350));

        btnSignup.setText("회원가입");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        jLabel3.setText("로그인");

        jLabel4.setText("ID : ");

        jLabel5.setText("PW : ");

        btnSignin.setText("로그인");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        jLabel6.setText("회원이 아니십니까?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSignup))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textID, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(textPW))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSignin)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnSignin)
                    .addComponent(textPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignup)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        SignUp();
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        ID = textID.getText();
        PW = textPW.getText();
        String IDcheck = "";
        String PWcheck = "";
        strSQL = "select * from idpw where id='"+ID+"'";
        try {
            DB.dbOpen();
            DB.DB_rs=DB.DB_stmt.executeQuery(strSQL);
            int i=0;
            while(DB.DB_rs.next()){
                IDcheck=DB.DB_rs.getString("id");
                PWcheck=DB.DB_rs.getString("pw");
                if (ID.equals(IDcheck) && PW.equals(PWcheck)){
                    MovieChoice(); // 영화표 예매창 열기
                    i++;
                    break;
                }
                else {
                    Popup1.setLocation(350,350);
                    Popup1.setSize(250,100);
                    Popup1.show();
                    i=-1;
                }
            }
            if (i==0){
               Popup1.setLocation(350,350);
               Popup1.setSize(250,100);
               Popup1.show();
            }
            DB.DB_rs.close();
            
        } catch (Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }//GEN-LAST:event_btnSigninActionPerformed

    private void btnSelectSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectSeatActionPerformed
        if(isNum(textAdult2.getText()) && isNum(textChild.getText())){
            SelectSeat();
        }else{
            Popup2.setLocation(350,350);
            Popup2.setSize(250,100);
            Popup2.show();
        }
    }//GEN-LAST:event_btnSelectSeatActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Popup1.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        SignUp.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Popup2.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        Name = jComboBox1.getSelectedItem().toString();
        Time = jComboBox2.getSelectedItem().toString();
        String Adult = "";
        String Teen = "";
        
        if(textAdult.getText().equals("")){
           Adult = "0"; 
        }else{
            Adult = textAdult.getText();
        }
        if(textTeen.getText().equals("")){
            Teen = "0";
        }else{
            Teen = textTeen.getText();
        }
        
        if(isNum(Adult) && isNum(Teen)){
            if(Adult.equals("0") && Teen.equals("0")){
                Popup8.setSize(140,110);
                Popup8.setLocation(350,350);
                Popup8.show();
            }else{
                btnPay.setEnabled(true);
                btnReserv.setEnabled(true);
            
                Total = Integer.parseInt(Adult) + Integer.parseInt(Teen);
                int Pri = (Integer.parseInt(Adult) * A) + (Integer.parseInt(Teen) * T);
                MovieNameCheck();
                
                lblPlace.setText(Place);
                lblName.setText(Name);
                lblTime.setText(Time);
                lblPeople.setText(String.valueOf(Total));
                lblPrice.setText(String.valueOf(Pri));
            }
        }else{
            Popup7.setSize(200,120);
            Popup7.setLocation(350,350);
            Popup7.show();
        }
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Popup7.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Popup8.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservActionPerformed
        String sqlCount = "";
        String dbName = "";
        String dbPlace = "";
        String dbTime = "";
        String dbPeople = "";
        String dbToday = "";
        int dbrow = 0;
        int row = 0;
        
        CheckReserv.setSize(410,360);
        CheckReserv.setLocation(300,300);
        CheckReserv.show();
        MovieChoice.dispose();
        
        try{
            DB.dbOpen();
            sqlCount = "select count(*) from checkres";
            DB.DB_rs = DB.DB_stmt.executeQuery(sqlCount);
            if(DB.DB_rs.next()){
                dbrow = DB.DB_rs.getInt(1);
            }
            
            String sql = "select * from checkres";
            DB.DB_rs = DB.DB_stmt.executeQuery(sql);
            while(DB.DB_rs.next()){
                dbName = DB.DB_rs.getString("name");
                dbPlace = DB.DB_rs.getString("place");
                dbTime = DB.DB_rs.getString("time");
                dbPeople = DB.DB_rs.getString("people");
                dbToday = DB.DB_rs.getString("today");
                if(dbToday.equals(Todaynow)){
                    jTableConfirm.setValueAt(dbName,row,0);
                    jTableConfirm.setValueAt(dbPlace,row,1);
                    jTableConfirm.setValueAt(dbTime,row,2);
                    jTableConfirm.setValueAt(dbPeople,row,3);
                    jTableConfirm.setValueAt(dbToday,row,4);
                    row++;
                }
                if(row == dbrow){
                    break;
                }
            }
            DB.DB_rs.close();
            DB.dbClose();
        }catch(Exception e){
            System.out.println("table출력,SQLExeption : "+ e.getMessage());
        }
    }//GEN-LAST:event_btnReservActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        
        try{
            DB.dbOpen();
            String sql = "insert into checkres values('"+Name+"','"+Place+"','"+Time+"','"+String.valueOf(Total)+"','"+Todaynow+"')";
            DB.DB_stmt.executeUpdate(sql);
            DB.dbClose();
        }catch(Exception e){
            System.out.println("Insert연결,SQLExeption : "+ e.getMessage());
        }
        
        Popup12.setSize(150,105);
        Popup12.setLocation(350,350);
        Popup12.show();
        
    }//GEN-LAST:event_btnPayActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Popup12.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnOverCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverCheckActionPerformed
        Popup3.setLocation(350,350);
        Popup3.setSize(200,100);
        Popup4.setLocation(350,350);
        Popup4.setSize(200,100);
        
        ID = AddID.getText();
        String IDcheck = "";
        strSQL = "select * from idpw where id='"+ID+"'";
        try {
            DB.dbOpen();
            DB.DB_rs=DB.DB_stmt.executeQuery(strSQL);
            int i=0;
            while(DB.DB_rs.next()){
                IDcheck=DB.DB_rs.getString("id");
                if (IDcheck.equals(ID)){
                    Popup3.show(); // 영화표 예매창 열기
                    jButton3.setEnabled(false);
                    i++;
                    break;
                }
            }
            if (i==0){
               Popup4.show();
               jButton3.setEnabled(true);
            }
            DB.DB_rs.close();        
            
        } catch (Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }//GEN-LAST:event_btnOverCheckActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Popup3 닫기 버튼 클릭시 창 닫기
        Popup3.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // Popup4 닫기 버튼 클릭시 창 닫기
        Popup4.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // 회원가입 완료버튼 클릭시 회원가입창, 완료확인 팝업 닫기.
        SignUp.dispose();
        Popup5.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        //비빌번호 재확인 버튼 클릭시 창 닫힘.
        Popup6.dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ID = AddID.getText();
        String PW = AddPW.getText();
        String PW1 = AddPW1.getText();
        Popup5.setLocation(350,350);
        Popup5.setSize(200,100);
        Popup6.setLocation(350,350);
        Popup6.setSize(200,100);
        
        //패스워드 확인
        if (!PW.equals(PW1)){
            Popup6.show();
        }
        // 회원가입 버튼 클릭시 DB에 넣기
        else {
            strSQL = "insert into idpw values('"+ID+"', '"+PW+"')";
            try {
                DB.dbOpen();
                DB.DB_stmt.executeUpdate(strSQL);
                Popup5.show();
                DB.dbClose();
            }         
            catch (Exception e){
                System.out.println("SQLException : "+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Java_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddID;
    private javax.swing.JTextField AddPW;
    private javax.swing.JTextField AddPW1;
    private javax.swing.JFrame CheckReserv;
    private javax.swing.JFrame MovieCheck;
    private javax.swing.JFrame MovieChoice;
    private javax.swing.JDialog Popup1;
    private javax.swing.JDialog Popup12;
    private javax.swing.JDialog Popup2;
    private javax.swing.JDialog Popup3;
    private javax.swing.JDialog Popup4;
    private javax.swing.JDialog Popup5;
    private javax.swing.JDialog Popup6;
    private javax.swing.JDialog Popup7;
    private javax.swing.JDialog Popup8;
    private javax.swing.JDialog SelectSeat;
    private javax.swing.JDialog SignUp;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnOverCheck;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnReserv;
    private javax.swing.JButton btnSelectSeat;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane100;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableConfirm;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPeople;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblamount;
    private javax.swing.JLabel lblfirst;
    private javax.swing.JLabel lblfourth;
    private javax.swing.JLabel lblsecond;
    private javax.swing.JLabel lblthird;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField textAdult;
    private javax.swing.JTextField textAdult2;
    private javax.swing.JTextField textChild;
    private javax.swing.JTextField textID;
    private javax.swing.JPasswordField textPW;
    private javax.swing.JTextField textTeen;
    // End of variables declaration//GEN-END:variables
}
