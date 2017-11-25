package tk.roccodev.labyzig.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.json.simple.parser.ParseException;

import tk.roccodev.labyzig.Main;
import tk.roccodev.labyzig.configs.LabyModConfig;
import tk.roccodev.labyzig.downloader.Downloader;
import tk.roccodev.labyzig.support.BiomeSupport;
import tk.roccodev.labyzig.support.CoordsSupport;
import tk.roccodev.labyzig.support.DateSupport;
import tk.roccodev.labyzig.support.FPSSupport;
import tk.roccodev.labyzig.support.NameHeadSupport;
import tk.roccodev.labyzig.support.PingSupport;
import tk.roccodev.labyzig.support.PotionEffectsSupport;
import tk.roccodev.labyzig.support.SpeedFOVSupport;
import tk.roccodev.labyzig.support.TimeSupport;
import tk.roccodev.labyzig.support.color.BoldSupport;
import tk.roccodev.labyzig.support.color.BracketsColorSupport;
import tk.roccodev.labyzig.support.color.BracketsSupport;
import tk.roccodev.labyzig.support.color.ItalicSupport;
import tk.roccodev.labyzig.support.color.PrefixColorSupport;
import tk.roccodev.labyzig.support.color.TextColorSupport;
import tk.roccodev.labyzig.support.color.UnderlineSupport;

public class MainGui {

	public JFrame frmLabymodTozig;
	private JLabel lblSelectMinecraftDirectory;
	private JTextField textField;
	private JCheckBox chckbxInstallMods;
	private JButton btnNewButton;
	private JButton btnInstall;
	private final Action action = new SwingAction();
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;



	/**
	 * Create the application.
	 */
	public MainGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLabymodTozig = new JFrame();
		frmLabymodTozig.setTitle("LabyMod To 5zig v. 1.0");
		frmLabymodTozig.setBounds(100, 100, 450, 300);
		frmLabymodTozig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("");
		
		btnNewButton = new JButton("Browse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.setAcceptAllFileFilterUsed(false);
				int returnValue = fileChooser.showOpenDialog(btnNewButton.getParent());
				if(returnValue == JFileChooser.APPROVE_OPTION) {
					
					File f = fileChooser.getSelectedFile();
					Main.MC_DIR = f;
					textField.setText(f.getAbsolutePath());
					
				}
			}
		});
		
		label_1 = new JLabel("");
		
		lblSelectMinecraftDirectory = new JLabel("Select Minecraft Directory");
		
		label_2 = new JLabel("");
		
		label_3 = new JLabel("");
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setText(Main.MC_DIR.getAbsolutePath());
		
		label_16 = new JLabel("");
		
		label_4 = new JLabel("");
		
		label_17 = new JLabel("");
		
		label_5 = new JLabel("");
		
		label_18 = new JLabel("");
		
		label_19 = new JLabel("");
		
		label_20 = new JLabel("");
		
		label_6 = new JLabel("");
		
		label_7 = new JLabel("");
		
		label_8 = new JLabel("");
		
		label_9 = new JLabel("");
		
		label_10 = new JLabel("");
		
		label_21 = new JLabel("");
		
		label_22 = new JLabel("");
		
		chckbxInstallMods = new JCheckBox("Install mods (1.7 Animations, Ping on Tab)");
		
		label_23 = new JLabel("");
		
		label_24 = new JLabel("");
		
		label_25 = new JLabel("");
		
		label_11 = new JLabel("");
		
		label_26 = new JLabel("");
		
		label_12 = new JLabel("");
		
		label_27 = new JLabel("");
		
		label_13 = new JLabel("");
		
		label_14 = new JLabel("");
		
		btnInstall = new JButton("Install");
		btnInstall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LabyModConfig.init();
				try {
					LabyModConfig.applyItem(new PrefixColorSupport());
					LabyModConfig.applyItem(new SpeedFOVSupport());
					LabyModConfig.applyItem(new FPSSupport());
					LabyModConfig.applyItem(new PotionEffectsSupport());
					LabyModConfig.applyItem(new PingSupport());
					LabyModConfig.applyItem(new CoordsSupport());
					LabyModConfig.applyItem(new DateSupport());
					LabyModConfig.applyItem(new TimeSupport());
					LabyModConfig.applyItem(new BiomeSupport());
					LabyModConfig.applyItem(new NameHeadSupport());
					LabyModConfig.applyItem(new BracketsSupport());
					LabyModConfig.applyItem(new BracketsColorSupport());
					LabyModConfig.applyItem(new TextColorSupport());
					LabyModConfig.applyItem(new BoldSupport());
					LabyModConfig.applyItem(new ItalicSupport());
					LabyModConfig.applyItem(new UnderlineSupport());
					
					
					if(chckbxInstallMods.isSelected()) {
						File modsFolder = new File(Main.MC_DIR + "/mods");
						if(!modsFolder.exists()) modsFolder.mkdir();
						JOptionPane.showMessageDialog(btnInstall.getParent(), "Config updated. Downloading mods...");
						System.out.println("Opted to install mods.");
						new Downloader(new URL("https://addons.cursecdn.com/files/2415/786/Orange's%201.7%20Animations-6.7.jar"), "1.7 Animations").download(new File(modsFolder + "/Orange's 1.7 Animations-6.7.jar"));
						new Downloader(new URL("https://addons.cursecdn.com/files/2454/905/Vanilla%20Enhancements-7.7.jar"), "Ping on Tab").download(new File(modsFolder + "/Vanilla Enhancements-7.7.jar"));
						
						
					}
					
					
					JOptionPane.showMessageDialog(btnInstall.getParent(), "Succesfully ported your LabyMod settings to 5zig.");
					
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					
					JOptionPane.showMessageDialog(btnInstall.getParent(), "An error occurred.\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		
		label_15 = new JLabel("");
		
		label_28 = new JLabel("");
		
		label_29 = new JLabel("");
		
		label_30 = new JLabel("");
		
		label_31 = new JLabel("");
		
		label_32 = new JLabel("");
		frmLabymodTozig.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frmLabymodTozig.getContentPane().add(label);
		frmLabymodTozig.getContentPane().add(label_1);
		frmLabymodTozig.getContentPane().add(lblSelectMinecraftDirectory);
		frmLabymodTozig.getContentPane().add(label_2);
		frmLabymodTozig.getContentPane().add(label_3);
		frmLabymodTozig.getContentPane().add(textField);
		frmLabymodTozig.getContentPane().add(label_16);
		frmLabymodTozig.getContentPane().add(label_4);
		frmLabymodTozig.getContentPane().add(label_17);
		frmLabymodTozig.getContentPane().add(label_5);
		frmLabymodTozig.getContentPane().add(label_18);
		frmLabymodTozig.getContentPane().add(btnNewButton);
		frmLabymodTozig.getContentPane().add(label_19);
		frmLabymodTozig.getContentPane().add(label_20);
		frmLabymodTozig.getContentPane().add(label_6);
		frmLabymodTozig.getContentPane().add(label_7);
		frmLabymodTozig.getContentPane().add(label_8);
		frmLabymodTozig.getContentPane().add(label_9);
		frmLabymodTozig.getContentPane().add(label_10);
		frmLabymodTozig.getContentPane().add(label_21);
		frmLabymodTozig.getContentPane().add(label_22);
		frmLabymodTozig.getContentPane().add(chckbxInstallMods);
		frmLabymodTozig.getContentPane().add(label_23);
		frmLabymodTozig.getContentPane().add(label_24);
		frmLabymodTozig.getContentPane().add(label_25);
		frmLabymodTozig.getContentPane().add(label_11);
		frmLabymodTozig.getContentPane().add(label_26);
		frmLabymodTozig.getContentPane().add(label_12);
		frmLabymodTozig.getContentPane().add(label_27);
		frmLabymodTozig.getContentPane().add(label_13);
		frmLabymodTozig.getContentPane().add(label_14);
		frmLabymodTozig.getContentPane().add(label_15);
		frmLabymodTozig.getContentPane().add(btnInstall);
		frmLabymodTozig.getContentPane().add(label_28);
		frmLabymodTozig.getContentPane().add(label_29);
		frmLabymodTozig.getContentPane().add(label_30);
		frmLabymodTozig.getContentPane().add(label_31);
		frmLabymodTozig.getContentPane().add(label_32);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
