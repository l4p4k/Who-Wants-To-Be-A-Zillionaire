
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;


/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class MenuPage extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel titlePanel, mainPanel, playerCard, menuCard;
	private JButton startBtn;
	private JLabel textTitle;
	private JRadioButton playerPick1,playerPick2;
	private ButtonGroup playerPickGrp;

	// object of QuestionDisplay class which will be used to call methods
	QuestionDisplay gameFrame = new QuestionDisplay(MenuPage.this);

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MenuPage inst = new MenuPage();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MenuPage() {
		super();
		initGUI();
	}

	private ButtonGroup getPlayerPickGrp() {
		/**
		 * button group for radio buttons
		 * @return the button group
		 */
		if(playerPickGrp == null) {
			playerPickGrp = new ButtonGroup();
		}
		return playerPickGrp;
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			//set name to window
			this.setName("Who wants to be a Zillionaire?");

			//Getting image resources from the IMG folder
			ImageIcon backIMG = new ImageIcon(getClass().getResource("/background.jpg"));
			ImageIcon btnIMG = new ImageIcon(getClass().getResource("/orangeDiamond.png"));
			ImageIcon titleIMG = new ImageIcon(getClass().getResource("/zillionaireIcon.png"));

			final JLabel background = new JLabel();
			//setting the background image
			background.setIcon(backIMG);
			//placing the background label to the frame
			getContentPane().add(background);
			//setting the background to be a card layour so we can switch cards later
			CardLayout backgroundLayout = new CardLayout();
			background.setLayout(backgroundLayout);
			{
				//the first card to be displayed
				menuCard = new JPanel();
				background.add(menuCard, "menuCard");
				//setting the preferred size of the panel
				menuCard.setPreferredSize(new java.awt.Dimension(794, 371));
				//setting the panel opaque so that we can see the background behind it
				menuCard.setOpaque(false);
				{

					//creating a JPanel for the title
					titlePanel = new JPanel();
					menuCard.add(titlePanel);
					//setting the panel to be a flow layout so the icon and title fit together on line
					titlePanel.setLayout(new FlowLayout());
					//making the titlePanel transparent to see background
					titlePanel.setOpaque(false);
					{
						textTitle = new JLabel();
						titlePanel.add(textTitle);
						//setting the text of the title
						textTitle.setText("Who wants to be a Zillionaire!");
						//customising the label
						textTitle.setBackground(new java.awt.Color(41,41,41));
						textTitle.setBorder(new LineBorder(new java.awt.Color(255,128,0), 2, true));
						textTitle.setForeground(new java.awt.Color(255,255,255));
						textTitle.setFont(new java.awt.Font("Copperplate Gothic Bold",1,30));
						//again setting the label to be opaque so we see the background through it
						textTitle.setOpaque(true);
						//creating JLabel titleImage and adding it to the titlePanel
						JLabel titleImage = new JLabel();
						titlePanel.add(titleImage);
						//giving the title image a background/icon
						titleImage.setIcon(titleIMG);
					}

					//creating a JPanel for the menu buttons 
					mainPanel = new JPanel();
					menuCard.add(mainPanel);
					mainPanel.setLayout(new FlowLayout());
					mainPanel.setOpaque(false);
					{
						//the start button within the mainPanel
						startBtn = new JButton();
						mainPanel.add(startBtn);
						startBtn.setText("Play");
						//customising the button and making it look a little more fancy for the menu page
						startBtn.setBackground(new java.awt.Color(41,41,41));
						startBtn.setBorder(new LineBorder(new java.awt.Color(255,128,0), 2, true));
						startBtn.setForeground(new java.awt.Color(255,255,255));
						startBtn.setFont(new java.awt.Font("Copperplate Gothic Bold",1,20));
						//this will remove the focus ring around this button
						startBtn.setFocusPainted(false);
						//setting an orange diamond image on the button
						startBtn.setIcon(btnIMG);
						startBtn.setPreferredSize(new java.awt.Dimension(400, 31));
						// the action listener for the start button
						startBtn.addActionListener (new ActionListener () {
							public void actionPerformed (ActionEvent evt) {
								//play a sound for the button
								Sound.play("blip.wav");
								//displaying the second card
								CardLayout cl = (CardLayout)(background.getLayout());
								cl.show(background, "playerCard");
								MenuPage.this.setTitle("How many players?");
							}

						});
					}
				}

				//the second card in the background label
				playerCard = new JPanel();
				background.add(playerCard, "playerCard");
				playerCard.setOpaque(false);

				//creating a JPanel for the menu buttons 
				mainPanel = new JPanel();
				playerCard.add(mainPanel);
				BorderLayout mainPanelLayout = new BorderLayout();
				mainPanel.setLayout(mainPanelLayout);
				mainPanel.setOpaque(false);
				{
					//radio buttons to choose the number of players playing
					playerPick1 = new JRadioButton();
					mainPanel.add(playerPick1, BorderLayout.WEST);
					playerPick1.setText("1 Player Game");
					playerPick1.setForeground(new java.awt.Color(255,255,255));
					//making sure player 1 radio button is selected on start-up
					playerPick1.setSelected(true);

					playerPick2 = new JRadioButton();
					mainPanel.add(playerPick2, BorderLayout.EAST);
					playerPick2.setText("2 Player Game (Not Available)");
					playerPick2.setForeground(new java.awt.Color(255,255,255));

					//adding both radio buttons to the button group
					getPlayerPickGrp().add(playerPick1);
					getPlayerPickGrp().add(playerPick2);

					//the start button within the mainPanel has the same properties as the start button on the menuCard panel
					startBtn = new JButton();
					mainPanel.add(startBtn, BorderLayout.SOUTH);
					startBtn.setText("Start Game");
					startBtn.setBackground(new java.awt.Color(41,41,41));
					startBtn.setBorder(new LineBorder(new java.awt.Color(255,128,0), 2, true));
					startBtn.setForeground(new java.awt.Color(255,255,255));
					startBtn.setFont(new java.awt.Font("Copperplate Gothic Bold",1,20));
					startBtn.setFocusPainted(false);				
					startBtn.setIcon(btnIMG);
					startBtn.setPreferredSize(new java.awt.Dimension(400, 31));
					// the action listener for the start button
					startBtn.addActionListener (new ActionListener () {
						public void actionPerformed (ActionEvent evt) {
							if (playerPick1.isSelected()) {
								Sound.play("blip.wav");
								//run 2 methods from the QuestionDisplay class to add players
								gameFrame.setPlayersPlaying(1);
								gameFrame.getGame().addPlayers(1);
								//startGame method simply sets up the newly opened JDialog
								startGame();
								MenuPage.this.setTitle("Who wants to be a Zillionaire!");
								CardLayout cl = (CardLayout)(background.getLayout());
								cl.show(background, "menuCard");
							}else if (playerPick2.isSelected()) {
								Sound.play("blip.wav");
								gameFrame.setPlayersPlaying(2);
								gameFrame.getGame().addPlayers(2);
								startGame();
								MenuPage.this.setTitle("Who wants to be a Zillionaire!");
								CardLayout cl = (CardLayout)(background.getLayout());
								cl.show(background, "menuCard");
							}


						}
					});
				}
			}

			//form layout
			pack();
			//setting the size of the window
			setSize(800, 400);
			this.setTitle("Who wants to be a Zillionaire!");
			//I didn't want the window to be resizable
			setResizable(false);
		} catch (Exception e) {
			//add your error handling code here
			e.printStackTrace();
		}
		//end of initGUI
	}

	//setting up the JDialog for the questions
	private void startGame(){
		gameFrame.setModal(true);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setVisible(true);		
	}

	//end of MenuPage class
}
