package Notepad;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {
    public int i = 0;

    public String text = "", db;
    Connection c;
    connect con = new connect();
    static JPopupMenu popupmenu = new JPopupMenu();
    static JMenuItem cut = new JMenuItem("cut");
    static JMenuItem copy = new JMenuItem("copy");
    static JMenuItem paste = new JMenuItem("paste");
    static JMenuItem selectAll = new JMenuItem("selectAll");

    public main() {
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        popupmenu.addSeparator();
        popupmenu.add(selectAll);

        selectAll.addActionListener((ActionEvent e) -> {
            TextArea.selectAll();
        });
        copy.addActionListener((ActionEvent e) -> {
            TextArea.copy();
        });
        cut.addActionListener((ActionEvent e) -> {
            TextArea.cut();
        });
        paste.addActionListener((ActionEvent e) -> {
            TextArea.paste();
        });

        setLocation(310, 140);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FindDialog = new javax.swing.JDialog();
        FindButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FindText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        line = new javax.swing.JLabel();
        chars = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        NewItem = new javax.swing.JMenuItem();
        OpenItem = new javax.swing.JMenuItem();
        SaveAsItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        opendb = new javax.swing.JMenuItem();
        savedb = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ExitItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        FormatMenu = new javax.swing.JMenu();
        FontMenu = new javax.swing.JMenu();
        q = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        ColorMenu = new javax.swing.JMenu();
        green = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        AboutItem = new javax.swing.JMenuItem();

        FindDialog.setTitle("Find");
        FindDialog.setResizable(false);
        FindDialog.setSize(new java.awt.Dimension(400, 100));

        FindButton.setText("Find Next");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Find :");

        FindText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FindDialogLayout = new javax.swing.GroupLayout(FindDialog.getContentPane());
        FindDialog.getContentPane().setLayout(FindDialogLayout);
        FindDialogLayout.setHorizontalGroup(
            FindDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FindText, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(FindButton)
                .addContainerGap())
        );
        FindDialogLayout.setVerticalGroup(
            FindDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FindDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FindText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(FindButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Our NotePad");

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaMouseClicked(evt);
            }
        });
        TextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TextArea);

        jToolBar1.setRollover(true);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/align-left.png"))); // NOI18N
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton1);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/align-right.png"))); // NOI18N
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton2);

        line.setText("               Line ");
        line.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lineKeyPressed(evt);
            }
        });
        jToolBar1.add(line);

        chars.setText("          Chars   ");
        chars.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                charsKeyPressed(evt);
            }
        });
        jToolBar1.add(chars);

        FileMenu.setText("File");

        NewItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/new-file-icon.png"))); // NOI18N
        NewItem.setText("New");
        NewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItemActionPerformed(evt);
            }
        });
        FileMenu.add(NewItem);

        OpenItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/open.png"))); // NOI18N
        OpenItem.setText("Open");
        OpenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenItemActionPerformed(evt);
            }
        });
        FileMenu.add(OpenItem);

        SaveAsItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/save.png"))); // NOI18N
        SaveAsItem.setText("Save As");
        SaveAsItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsItemActionPerformed(evt);
            }
        });
        FileMenu.add(SaveAsItem);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/database.png"))); // NOI18N
        jMenu1.setText("Database");

        opendb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/database-export.png"))); // NOI18N
        opendb.setText("Open & delete");
        opendb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opendbActionPerformed(evt);
            }
        });
        jMenu1.add(opendb);

        savedb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/database-view-.png"))); // NOI18N
        savedb.setText("Save");
        savedb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedbActionPerformed(evt);
            }
        });
        jMenu1.add(savedb);

        FileMenu.add(jMenu1);
        FileMenu.add(jSeparator2);

        ExitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/exit-icon.png"))); // NOI18N
        ExitItem.setText("Exit");
        ExitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitItem);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/copy.png"))); // NOI18N
        jMenuItem5.setText("Copy");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/cut.png"))); // NOI18N
        jMenuItem6.setText("Cut");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/paste.png"))); // NOI18N
        jMenuItem7.setText("Paste");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem7);
        EditMenu.add(jSeparator3);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/find.png"))); // NOI18N
        jMenuItem8.setText("Find");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem8);

        jMenuBar1.add(EditMenu);

        FormatMenu.setText("Format");

        FontMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/font.png"))); // NOI18N
        FontMenu.setText("Font");

        q.setText("PLAINT");
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });
        FontMenu.add(q);

        jMenuItem12.setText("BOLD");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        FontMenu.add(jMenuItem12);

        jMenuItem13.setText("ITALIC");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        FontMenu.add(jMenuItem13);

        FormatMenu.add(FontMenu);

        ColorMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/color.png"))); // NOI18N
        ColorMenu.setText("Colour");

        green.setBackground(new java.awt.Color(255, 51, 0));
        green.setText("Red");
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });
        ColorMenu.add(green);

        jMenuItem16.setBackground(new java.awt.Color(0, 102, 255));
        jMenuItem16.setText("Blue");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem16);

        jMenuItem17.setBackground(new java.awt.Color(255, 255, 51));
        jMenuItem17.setText("Yellow");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem17);

        jMenuItem18.setBackground(new java.awt.Color(51, 255, 0));
        jMenuItem18.setText("Green");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem18);

        jMenuItem1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuItem1.setText("Gray");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(255, 0, 255));
        jMenuItem2.setText("Magenta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(255, 102, 204));
        jMenuItem3.setText("Pink");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(255, 204, 0));
        jMenuItem4.setText("Orang");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem4);

        jMenuItem10.setBackground(new java.awt.Color(102, 255, 255));
        jMenuItem10.setText("Cyan");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        ColorMenu.add(jMenuItem10);

        FormatMenu.add(ColorMenu);

        jMenuBar1.add(FormatMenu);

        HelpMenu.setText("Help");

        AboutItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notepad/about.png"))); // NOI18N
        AboutItem.setText("About");
        AboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutItemActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutItem);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItemActionPerformed
        JOptionPane.showConfirmDialog(null,
                "You are going to delete you history.\nAre you sure?",
                "Delete History",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        TextArea.setText("");
    }//GEN-LAST:event_NewItemActionPerformed

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        TextArea.setForeground(Color.red);
    }//GEN-LAST:event_greenActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FindDialog.setVisible(true);
        FindDialog.setLocation(370, 270);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    public void outputfile(String path) {
        i=0;
        try {
            FileReader out = new FileReader(path);
            int c;
            while ((c = out.read()) != -1) {
                text += ((char) c);
            }
            out.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "" + e, "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    static void inputfile(String file, String path) {
        try {
            FileWriter in = new FileWriter(path);
            in.write(file);
            in.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "" + e, "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void SaveAsItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsItemActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "java", "c", "cpp");
        chooser.setFileFilter(filter);
        int returnedValue = chooser.showSaveDialog(null);
        if (returnedValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String filepath = selectedFile.getPath();
            String file = TextArea.getText();
            inputfile(file, filepath);

        }    }//GEN-LAST:event_SaveAsItemActionPerformed
//Copy Action.
    final Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String selection = TextArea.getSelectedText();
        StringSelection data = new StringSelection(selection);
        clip.setContents(data, data);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //cut Action.
        String selection = TextArea.getSelectedText();
        StringSelection data = new StringSelection(selection);
        clip.setContents(data, data);
        TextArea.replaceRange("", TextArea.getSelectionStart(), TextArea.getSelectionEnd());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Transferable clipdata = clip.getContents(clip);
        try {
            if (clipdata.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String s = (String) (clipdata.getTransferData(DataFlavor.stringFlavor));
                TextArea.replaceSelection(s);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e, "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void OpenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenItemActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "java", "c", "cpp");
        chooser.setFileFilter(filter);
        int returnedValue = chooser.showOpenDialog(null);
        if (returnedValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String filepath = selectedFile.getPath();
            outputfile(filepath);
            TextArea.setText(text);
        }
    }//GEN-LAST:event_OpenItemActionPerformed

    private void opendbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opendbActionPerformed
        String Name;
        Statement stat;
        JFrame f = new JFrame("Database");
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        JScrollPane tableScroller = new JScrollPane(table);
        model.addColumn("File Name");
        tableScroller.setBounds(20, 10, 200, 80);
        JLabel l = new JLabel("Enter File Name");
        JTextField text = new JTextField();
        JButton b = new JButton("open");
        JButton d = new JButton("delete");
        l.setBounds(10, 100, 120, 30);
        text.setBounds(125, 105, 130, 20);
        b.setBounds(60, 135, 80, 20);
        d.setBounds(160, 135, 80, 20);
        try {
            c = con.connection();
            stat = c.createStatement();
            String select = "SELECT `Name` FROM `data`";
            ResultSet res = stat.executeQuery(select);
            while (res.next()) {
                Name = res.getString("Name");
                String data[] = {Name};
                model.addRow(data);
            }
            c.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Warning Message", JOptionPane.WARNING_MESSAGE);

        }

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String n = text.getText();
                try {
                    c = con.connection();
                    Statement stat1 = c.createStatement();
                    String select = "SELECT `text` from `data` WHERE Name='" + n + "'";
                    ResultSet res = stat1.executeQuery(select);
                    while (res.next()) {
                        TextArea.setText(res.getString("text"));
                    }
                    c.close();
                    f.setVisible(false);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Warning Message", JOptionPane.WARNING_MESSAGE);

                }

            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String n = text.getText();
                try {
                    c = con.connection();
                    Statement stat = c.createStatement();
                    String select = "DELETE FROM `data` WHERE Name='" + n + "'";
                    stat.execute(select);
                    c.close();
                    JOptionPane.showMessageDialog(null, "Deleted", "Message", JOptionPane.PLAIN_MESSAGE);
                    f.setVisible(false);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Warning Message", JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        f.add(b);
        f.add(d);
        f.add(l);
        f.add(text);
        f.add(tableScroller);
        f.setSize(300, 200);
        f.setResizable(false);
        f.setLocation(350, 200);
        f.setVisible(true);
    }//GEN-LAST:event_opendbActionPerformed

    private void savedbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedbActionPerformed
        if (!"".equals(TextArea.getText())) {
            Statement stat;
            String file = JOptionPane.showInputDialog(null, "Enter File Name:", "", JOptionPane.PLAIN_MESSAGE);
            try {
                c = con.connection();
                stat = c.createStatement();
                String qu = "INSERT INTO `data`(`Name`, `text`) VALUES ('" + file + "','" + TextArea.getText() + "')";
                stat.executeUpdate(qu);
                JOptionPane.showMessageDialog(null, "Saved", "Message", JOptionPane.PLAIN_MESSAGE);
                c.close();
                stat.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Warning Message", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_savedbActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        TextArea.setForeground(Color.green);

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        TextArea.setForeground(Color.blue);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        TextArea.setForeground(Color.yellow);

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TextArea.setForeground(Color.gray);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TextArea.setForeground(Color.MAGENTA);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TextArea.setForeground(Color.pink);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TextArea.setForeground(Color.orange);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        TextArea.setForeground(Color.cyan);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        String t = JOptionPane.showInputDialog(null, "Enter size of font:", "Size", JOptionPane.PLAIN_MESSAGE);
        int x = Integer.valueOf(t);
        TextArea.setFont(new Font("ITALIC", Font.ITALIC, x));    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        String t = JOptionPane.showInputDialog(null, "Enter size of font :", "Size", JOptionPane.PLAIN_MESSAGE);
        int x = Integer.valueOf(t);
        TextArea.setFont(new Font("PLAIN", Font.PLAIN, x));
    }//GEN-LAST:event_qActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        String t = JOptionPane.showInputDialog(null, "Enter size of font:", "Size", JOptionPane.PLAIN_MESSAGE);
        int x = Integer.valueOf(t);
        TextArea.setFont(new Font("BOLD", Font.BOLD, x));
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        TextArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        TextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void lineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lineKeyPressed
    }//GEN-LAST:event_lineKeyPressed

    private void charsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_charsKeyPressed

    }//GEN-LAST:event_charsKeyPressed

    private void AboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutItemActionPerformed
        JOptionPane.showMessageDialog(null, "Ibrahim gamal\nIbrahim Ahmed\nKarim\nAbd Alwahab\nAbd rahman\nMohamed\n"
                + "CopyRight 2019", "About us", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AboutItemActionPerformed

    private void TextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAreaKeyPressed
        line.setText("               Line  " + TextArea.getLineCount());
        chars.setText("         Chars  " + TextArea.getText().length());
    }//GEN-LAST:event_TextAreaKeyPressed

    private void TextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMouseClicked
        TextArea.add(popupmenu);
        TextArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (SwingUtilities.isRightMouseButton(e)) {
                    popupmenu.show(TextArea, e.getX(), e.getY());

                }
            }
        });
    }//GEN-LAST:event_TextAreaMouseClicked
    public int lastpos, selStart = 0, selEnd = 0;

    public void find(JTextArea jt) {

        String ss = jt.getText();
        String sa = FindText.getText();
        String s1 = ss.toLowerCase();
        String s2 = sa.toLowerCase();
        lastpos = jt.getCaretPosition();
        selStart = jt.getSelectionStart();
        selEnd = jt.getSelectionEnd();
        if (selStart != selEnd) {
            lastpos = selStart + 1;
        }
        lastpos = s1.indexOf(s2, lastpos);
        if (lastpos != -1) {
            jt.setSelectionColor(Color.GRAY);
//            jt.setSelectionStart(lastpos);
//            jt.setSelectionEnd(lastpos + FindText.getText().length());
            jt.setCaretPosition(lastpos);
            jt.moveCaretPosition(lastpos + FindText.getText().length());
        } else {
            JOptionPane.showMessageDialog(this, "Cannot find \"" + FindText.getText() + "\"", "Find", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
        if (i == 0) {
            TextArea.setCaretPosition(0);
        }
                i++;

        find(TextArea);
    }//GEN-LAST:event_FindButtonActionPerformed

    private void ExitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitItemActionPerformed

    private void FindTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindTextActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutItem;
    private javax.swing.JMenu ColorMenu;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem ExitItem;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JButton FindButton;
    private javax.swing.JDialog FindDialog;
    private javax.swing.JTextField FindText;
    private javax.swing.JMenu FontMenu;
    private javax.swing.JMenu FormatMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem NewItem;
    private javax.swing.JMenuItem OpenItem;
    private javax.swing.JMenuItem SaveAsItem;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel chars;
    private javax.swing.JMenuItem green;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel line;
    private javax.swing.JMenuItem opendb;
    private javax.swing.JMenuItem q;
    private javax.swing.JMenuItem savedb;
    // End of variables declaration//GEN-END:variables
}
