import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class RegistrationForm extends JFrame implements ActionListener{

    JLabel title,border1,border2, idLabel, nameLabel,prenumeLabel, genderLabel, addressLabel, contactLabel, cadrul1,cameraLabel, ZiLabel;
    JLabel dziLabel, dlunaLabel, danLable;
    JTextField idField;
    JTextField nameField,prenumeField;
    JTextField addressField;
    JTextField contactField;
    JTextField important;
    JButton registerButton, exitButton;
    JRadioButton male, female;
    ButtonGroup bg;
    JPanel panel;
    JComboBox cazare, Zi,ProgZi,luna, an;

    List<user> list = new ArrayList<user>();
    JTable table;
    String gender = "",ucamera= "",uzile="", uprogramarezi="", uprogramareluna="", uprogramarean="";

    // Returns a column class of Object
    DefaultTableModel model;
    JScrollPane scrollpane;

    RegistrationForm() {
        setSize(1078, 768);
        setLayout(null);

        title = new JLabel("Rezervari Cazari Hotel... ");

        title.setFont(new Font("Arial", Font.BOLD,25));
        title.setBounds(350, 7, 350, 30);
        add(title, BorderLayout.CENTER);

        border1 = new JLabel();
        border1.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        border1.setBounds(15, 7, 1020, 350);
        add(border1, BorderLayout.CENTER);
        add(border1);
        border2 = new JLabel();
        border2.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        border2.setBounds(15, 7, 1020, 40);
        add(border2, BorderLayout.CENTER);
        add(border2);

        JTextField important = new JTextField(10);
        important.setText("!!! PENTRU A VA PUTEA INREGISTRA VA RUGAM SA INTRODUCETI TOATE CAMPURILE");
        important.setFont(new Font("Arial", Font.BOLD,14));
        important.setBackground(Color.LIGHT_GRAY);
        important.setBounds(200,300,650,40);
        add(important);
        add(important, BorderLayout.CENTER);
        idLabel = new JLabel("Numar Identificare");
        idLabel.setBounds(30, 50, 160, 30);


        nameLabel = new JLabel("Nume");
        nameLabel.setBounds(30, 85, 160, 30);
        prenumeLabel = new JLabel("Prenume");
        prenumeLabel.setBounds(30,120,160,30);

        genderLabel =new JLabel("Sex");
        genderLabel.setBounds(30, 155, 60, 30);
        addressLabel = new JLabel("Adresa");
        addressLabel.setBounds(30, 190, 200, 30);

        contactLabel = new JLabel("Telefon");
        contactLabel.setBounds(30, 225, 150, 30);

        cameraLabel = new JLabel("Camera");
        cameraLabel.setBounds(350, 50, 50, 30);

        ZiLabel = new JLabel("Numarul de Zile");
        ZiLabel.setBounds(350,85,150,30);

        dziLabel=new JLabel("Data");
        dziLabel.setBounds(350,120,40,30);
        add(dziLabel);
        dlunaLabel=new JLabel("");
        dlunaLabel.setBounds(350,120,40,30);
        add(dlunaLabel);
        danLable=new JLabel("");
        danLable.setBounds(405,120,40,30);
        add(danLable);


        String[] dormitor={"Pat dublu","Pat simplu","Doua paturi", "trei paturi"};
        cazare= new JComboBox(dormitor);

        cazare.setBounds(450,50,220,30);
        cazare.setBackground(Color.WHITE);

        cazare.addActionListener(new JComboBox<>() {

            public void actionPerformed(ActionEvent e) {

                String cazareField=(String)cazare.getSelectedItem();
                ucamera=cazareField;
            }
        });

        add(cazare);
        add(cameraLabel);

        String[] NZile={"1","2","3","4","5","6","7","8","9","10,","11","12","13","14","15","16","17","18","19",
                        "20","21","23","23","24","25","26","27","28","29","30"};
        Zi=new JComboBox(NZile);
        Zi.setBounds(450,85,70,30);
        Zi.setBackground(Color.white);
        Zi.addActionListener(new JComboBox<>(){
            public void actionPerformed(ActionEvent e){
                String ziField=(String)Zi.getSelectedItem();
                uzile=ziField;
            }
        });
        add(ZiLabel);
        add(Zi);

       ImageIcon icon = new ImageIcon("src/main/resources/logo1.jpg");
        Image i2 = icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3  = new JLabel(i3);
        l3.setBounds(800,50,150,150);
        l3.setVisible(true);
        add(l3);

        idField = new JTextField();
        idField.setBounds(150, 50, 50, 30);
        idField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });

        add(idField);
        add(idLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 85, 120, 30);
        add(nameField);
        add(nameLabel);

        prenumeField = new JTextField();
        prenumeField.setBounds(150,120,120,30);
        add(prenumeLabel);
        add(prenumeField);

        // Defining Gender Buttons

        male = new JRadioButton("Masculin");
        male.setBounds(95, 155, 100, 30);
        male.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gender= "Masculin";
            }
        });
        add(male);

        female = new  JRadioButton("Feminin");
        female.setBounds(200,155, 100, 30);
        female.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gender ="Feminin";
                    }
        });
        add(female);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        add(genderLabel);
        addressField = new JTextField();
        addressField.setBounds(150, 190, 100, 30);
        add(addressField);
        add(addressLabel);
        contactField = new JTextField();
        contactField.setBounds(150, 225, 120, 30);
        contactField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!((c >= '0') && (c <= '9') || (c ==KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
                {

                    e.consume();
                }
            }
        });
        add(contactField);
        add(contactLabel);

        String[] dzi = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15",
                        "16", "17", "18", "19", "20","21", "22", "23", "24", "25","26", "27", "28", "29",
                        "30","31" };
        ProgZi = new JComboBox(dzi);
        ProgZi.setFont(new Font("Arial", Font.PLAIN,14));
        ProgZi.setSize(50,30);
        ProgZi.setLocation(450,120);
        ProgZi.addActionListener(new JComboBox<>(){
            public void actionPerformed(ActionEvent e) {
                String ZileField = (String) ProgZi.getSelectedItem();
                 uprogramarezi = ZileField;
                }
            });
        add(ProgZi);
        add(danLable);

       String dluna[] = { "Ian", "Feb", "Mar", "Apr","Mai", "Iun", "Iul", "Aug","Sep", "Oct", "Noi", "Dec" };

        luna = new JComboBox(dluna);
        luna.setFont(new Font("Arial",Font.PLAIN,14));
        luna.setSize(60,30);
        luna.setLocation(505, 120);

        luna.addActionListener(new JComboBox<>(){
            public void actionPerformed(ActionEvent e) {
                String lunaField = (String) luna.getSelectedItem();
                uprogramareluna = lunaField;
            }
        });

        add(luna);
        add(dlunaLabel);

        String dan[] = { "2023","2024","2025" };
        an = new JComboBox(dan);
        an.setFont(new Font("Arial", Font.PLAIN,14));
        an.setSize(80,30);
        an.setLocation(570,120);
        an.addActionListener(new JComboBox<>(){
            public void actionPerformed(ActionEvent e) {
                String anField = (String) an.getSelectedItem();
                 uprogramarean = anField;
            }
        });
        add(an);
        add(dziLabel);

        exitButton = new JButton("Iesire");
        exitButton.setBounds(25, 300, 80, 30);
        exitButton.addActionListener(this);
        //Defining Register Button
        registerButton = new JButton("Inregistrare");
        registerButton.setBounds(920, 300, 100, 30);
        registerButton.addActionListener(this);
        // Adaugam titlul, campurile si butoane

        add(exitButton);
        add(registerButton);


        //creare Jpanel(tabel+tabel)
        panel =new JPanel();
        panel.setLayout(new GridLayout());
        panel.setBounds(50,400, 950, 300);
        panel.setBorder(BorderFactory.createDashedBorder(Color.blue));
        panel.setBackground(Color.cyan);
        add(panel);
        //creare tabel
        model = new DefaultTableModel();
        table = new JTable(model);
        table.setEnabled(false);
        table.setBackground(Color.white);

        //Adaugare coloane in tabel
        model.addColumn("Numar Identificare");
        model.addColumn("Nume");
        model.addColumn("Prenume");
        model.addColumn("Sex");
        model.addColumn("Adresa");
        model.addColumn("Telefon");
        model.addColumn("Camera");
        model.addColumn("Numar Nopti");
        model.addColumn("Zi");
        model.addColumn("Luna");
        model.addColumn("An");

        scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollpane);
        panel.setEnabled(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent execute) {
        if(execute.getSource() == exitButton) {
            System.exit(0);
        }
        if(execute.getSource() ==registerButton) {
            if(idField.getText().equals("") || nameField.getText().equals("")||prenumeField.getText().equals("") || addressField.getText().equals("")||
                    contactField.getText().equals("")|| gender.equals("")||
                    ucamera.equals("")|| uzile.equals("")|| uprogramarezi.equals("")|| uprogramareluna.equals("")||
                    uprogramarean.equals("") )JOptionPane.showMessageDialog(idField,  "Selectati Campul");
            else{     //Salvam datele in lista
                list.add(new user(idField.getText(), nameField.getText(),prenumeField.getText(), gender, addressField.getText(), contactField.getText(),
                ucamera, uzile,uprogramarezi,uprogramareluna,uprogramarean));
                addRows();

                JOptionPane.showMessageDialog(this,"Inregistrare Completa");
                idField.setText("");
                nameField.setText("");
                prenumeField.setText("");
                gender ="";
                bg.clearSelection();
                addressField.setText("");
                contactField.setText("");
                ucamera="";
                uzile="";
                uprogramarezi ="";
                uprogramareluna="";
                uprogramarean="";
                }
        }
    }
    //Adaugam in lista
    public void addRows() {
        Object[] row =null;
        user str = list.get(list.size()- 1);
        String string =str.uid + ',' + str.uname+ ',' + str.uprenume + ',' + str.gender +',' + str.uaddress + ',' + str.ucontact +
                ',' + str.ucamera+','+str.uzile +','+str.uprogramarezi +','+str.uprogramareluna +','+str.uprogramarean;
        row =string.split(",");
        //Adding records in table model
        model.addRow(row);
        panel.revalidate();

    }
    public static void main(String[] args) {
        new RegistrationForm();

    }}