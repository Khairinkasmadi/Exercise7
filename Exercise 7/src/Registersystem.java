import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Registersystem extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textFirstname;
	private JTextField textlastname;
	private JTextField textsalary;
	private JTextField textadds;
	private JTextField textpostcode;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registersystem frame = new Registersystem();
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
	public Registersystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 10, 1386, 753);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 28, 1322, 114);
		panel_1.add(panel);
		panel.setBackground(SystemColor.info);
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Registration Form ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 50));
		lblNewLabel_4.setBounds(25, 25, 1035, 61);
		panel.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(37, 152, 457, 450);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reference no");
		lblNewLabel.setBounds(31, 67, 155, 30);
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname");
		lblNewLabel_1.setBounds(31, 109, 131, 30);
		lblNewLabel_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lastname");
		lblNewLabel_1_1.setBounds(31, 151, 131, 30);
		lblNewLabel_1_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salary");
		lblNewLabel_2.setBounds(31, 195, 131, 30);
		lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setBounds(31, 227, 131, 30);
		lblNewLabel_1_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Post Code");
		lblNewLabel_1_1_1.setBounds(31, 290, 131, 30);
		lblNewLabel_1_1_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Choosen Car");
		lblNewLabel_3.setBounds(31, 364, 131, 30);
		lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(198, 67, 232, 30);
		textField.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		panel_2.add(textField);
		textField.setColumns(10);
		
		textFirstname = new JTextField();
		textFirstname.setBounds(198, 109, 232, 30);
		textFirstname.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		textFirstname.setColumns(10);
		panel_2.add(textFirstname);
		
		textlastname = new JTextField();
		textlastname.setBounds(198, 151, 232, 30);
		textlastname.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		textlastname.setColumns(10);
		panel_2.add(textlastname);
		
		textsalary = new JTextField();
		textsalary.setBounds(198, 195, 232, 30);
		textsalary.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		textsalary.setColumns(10);
		panel_2.add(textsalary);
		
		textadds = new JTextField();
		textadds.setBounds(31, 261, 397, 30);
		textadds.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		textadds.setColumns(10);
		panel_2.add(textadds);
		
		JComboBox model1 = new JComboBox();
		model1.setBounds(174, 363, 245, 37);
		model1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
		model1.setModel(new DefaultComboBoxModel(new String[] {"Choose your car model", "Proton Saga", "Proton Persona", "Proton X50", "Proton X70"}));
		panel_2.add(model1);
		
		textpostcode = new JTextField();
		textpostcode.setBounds(31, 322, 199, 30);
		textpostcode.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
		textpostcode.setColumns(10);
		panel_2.add(textpostcode);
		
		JLabel lblNewLabel_5 = new JLabel("Personal Details");
		lblNewLabel_5.setBounds(31, 21, 199, 34);
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(27, 612, 1334, 120);
		panel_1.add(panel_3);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.addRow(new Object[]{		
						 
						 textField.getText(),
						 textFirstname.getText(),
						 textlastname.getText(),
						 textsalary.getText(),
						 textadds.getText(),
						 textpostcode.getText(),
							
						 model1.getSelectedItem(),
		    	   });
			     
			        
			       if (table.getSelectedRow() == -1){
			           if (table.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Customer Information Update confirmed","Registered Successfully",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			     
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(32, 41, 201, 41);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textFirstname.setText("");
				textlastname.setText("");
				textsalary.setText("");
				textadds.setText("");
				textpostcode.setText("");
				model1.setSelectedItem("Choose your car model");
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(243, 41, 201, 41);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()==-1){
		            if(table.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Customer Management System",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
		                        "Customer Management System",JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }     
				
			
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(785, 41, 201, 41);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame= new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm to exit")== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(1043, 41, 201, 41);
		panel_3.add(btnNewButton_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2_1.setBackground(SystemColor.textHighlight);
		panel_2_1.setBounds(538, 153, 806, 449);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 30, 744, 398);
		panel_2_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference no", "Firstname", "Lastname", "Salary", "Address", "Post Code", "Choosen Car"
			}
		));
		scrollPane.setViewportView(table);
	}
	}


