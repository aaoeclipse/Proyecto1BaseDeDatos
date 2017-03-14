import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;


import java.nio.file.*;
import java.util.ArrayList;
import java.nio.charset.Charset;

import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.TextArea;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class DataBaseGUI extends JFrame {

	private static final JMenuItem COPY = null;
	private static final JMenuItem PASTE = null;
	private static final Action Copy = null;
	private static final Action Paste = null;
	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private TextArea textArea;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBaseGUI frame = new DataBaseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DataBaseGUI() {
		setType(Type.POPUP);
		setTitle("ANOTHER BETTER POSTGRES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 3200, 1500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(3, 3, 3, 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Consolas", Font.PLAIN, 25));
		textArea.setBounds(640, 100, 2475, 431);
		contentPane.add(textArea);
		
		
		table = new JTable();
		table.setFont(new Font("Consolas", Font.PLAIN, 25));
		table.setBounds(640, 600, 2475, 770);
		
		
		contentPane.add(table);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.setBounds(803, 58, 58, 36);
		contentPane.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(DataBaseGUI.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png")));
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//ProbandoAction button
				ButtonAction1(table,textArea);
			}
		});

		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_1.setBounds(640, 58, 67, 36);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(DataBaseGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//ProbandoAction button
				openFile(textArea);
			}
		});
		
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_2.setBounds(721, 58, 67, 36);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon(DataBaseGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//ProbandoAction button
				saveFile(textArea);
			}
		});
		
		
		JLabel lblLuisasQuerys = new JLabel("LUISA's QUERYS");
		lblLuisasQuerys.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 40));
		lblLuisasQuerys.setBounds(937, 0, 412, 94);
		contentPane.add(lblLuisasQuerys);
		
		JTree tree = new JTree();
		tree.setFont(new Font("Consolas", Font.PLAIN, 26));
		tree.setForeground(UIManager.getColor("Button.disabledShadow"));
		tree.setToolTipText("Hola");
		configure(tree);
		tree.setBackground(UIManager.getColor("ColorChooser.swatchesDefaultRecentColor"));
		tree.setBounds(31, 100, 566, 1264);
		contentPane.add(tree);
	
		
	}
	private void ButtonAction1(JTable table, TextArea textArea){
		DefaultTableModel  tableModel;
		tableModel = new DefaultTableModel();
		String columns[] = {"Probando"};
		String Row[] = {textArea.getText()};
		tableModel.setColumnIdentifiers(columns);
		table.setModel(tableModel);
		tableModel.addRow(Row);
	}
	private void saveFile(TextArea textArea) {
		JFileChooser saver = new JFileChooser("./");
		//saver.setFileFilter(new Text_Filter());
		int ret = saver.showSaveDialog(this);
		File file = saver.getSelectedFile();
		BufferedWriter writer = null;
		if(ret == JFileChooser.APPROVE_OPTION){
			try{
				writer = new BufferedWriter(new FileWriter(file.getName()+".sql"));
				writer.write(textArea.getText());
				writer.close();
				JOptionPane.showMessageDialog(this,"Query was Saved Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
				
			}catch(IOException e){
				JOptionPane.showMessageDialog(this,"The Text could not be Saved!","Error",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}//inv revisar
	private void openFile(TextArea textArea){
		JFileChooser open = new JFileChooser("./");
		int ret = open.showOpenDialog(this);
		File file = open.getSelectedFile();
		BufferedReader reader = null;
		if(ret == JFileChooser.APPROVE_OPTION){
			try{
				reader = new BufferedReader(new FileReader(file.getName()));
				String current; 
				while((current = reader.readLine())!= null){
					System.out.println(current);
					textArea.setText(current);
				}
				reader.close();
				
			}catch(IOException e){
				JOptionPane.showMessageDialog(this,"The Text could not be Opened!","Error",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	public void configure(JTree tree) {

        File fileRoot = new File("C:/Users/Luisa A/workspace/DataBase");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(fileRoot.getName());
        DefaultTreeModel model = new DefaultTreeModel(root);
        
        File[] subItems = fileRoot.listFiles();
        if(subItems == null){
        	
        }
        else{
        	for(int i=0;i<subItems.length; i++){
        			String filename = subItems[i].getName();
                    root.add(new DefaultMutableTreeNode(filename));
                   // System.out.println(filename);
                  
        	}
        }
        
        tree.setModel(model);
    }
}
	

