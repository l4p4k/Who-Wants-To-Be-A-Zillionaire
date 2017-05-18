

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;


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
public class QuestionDisplay extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel backgroundLabel, qTitle, qCatTitle, dispQuestion, endTitle;
	private JPanel questionsCard, catChooseCard,endCard;
	private JButton catGeneral, catComp, catSciNature, restart;
	private JPanel questionsPanel, qTopPanel, answerPanel;
	private JButton helpFiftyFifty,helpAskAudience;
	private JLabel jMoney;
	private JButton answer1,answer2,answer3,answer4;

	private CardLayout cardLayout = new CardLayout();

	//variables used in this class
	private int playersPlaying = 0;
	private int category = 1;
	private int difficulty = 1;
	private int money = 0;
	private Boolean fiftyFiftyUse = false;
	private Boolean askAudienceUse = false;

	GameControl game = new GameControl();

	//getting the question
	private Question questionField = game.displayQuestion(category, difficulty);

	private int myIndex = questionField.getIndex();
	private String myQuestion = questionField.getQuestion();
	private String myCorrectAns = questionField.getCorrectAns();
	private String myWrongAns1 = questionField.getWrongAns1();
	private String myWrongAns2 = questionField.getWrongAns2();
	private String myWrongAns3 = questionField.getWrongAns3();

	//variables that hold what is in each answer button at that time
	private String answer1BtnInput = "";
	private String answer2BtnInput = "";
	private String answer3BtnInput = "";
	private String answer4BtnInput = "";


	// ===================================================================================================
	/**
	 * @return the game
	 */
	public GameControl getGame() {
		return game;
	}
	/**
	 * @param playersPlaying the playersPlaying to set
	 */
	public void setPlayersPlaying(int playersPlaying) {
		this.playersPlaying = playersPlaying;
	}

	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
	}
	// ===================================================================================================

	/**
	 * Auto-generated main method to display this JDialog
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				QuestionDisplay inst = new QuestionDisplay(frame);
				inst.setVisible(true);
			}
		});
	}

	public QuestionDisplay(JFrame frame) {
		super(frame);
		initGUI();
	}

	private void initGUI() {
		//setting the question number to 0
		game.setQuestionNum(0);


		try {
			//set name to window

			//Getting image resources from the IMG folder
			ImageIcon backIMG = new ImageIcon(getClass().getResource("/background.jpg"));
			ImageIcon btnIMG = new ImageIcon(getClass().getResource("/orangeDiamond.png"));
			ImageIcon titleIMG = new ImageIcon(getClass().getResource("/zillionaireIcon.png"));

			final JLabel backgroundLabel = new JLabel();
			backgroundLabel.setIcon(backIMG);
			getContentPane().add(backgroundLabel);
			CardLayout backgroundLayout = new CardLayout();
			backgroundLabel.setLayout(backgroundLayout);
			{

				questionsCard = new JPanel();
				BorderLayout questionsCardLayout = new BorderLayout();
				questionsCard.setLayout(questionsCardLayout);
				backgroundLabel.add(questionsCard, "questionsCard");
				//making the panel opaque to see the background behind it
				questionsCard.setOpaque(false);

				qTopPanel = new JPanel();
				questionsCard.add(qTopPanel, BorderLayout.NORTH);
				qTopPanel.setOpaque(false);
				{
					qTitle = new JLabel();
					qTopPanel.add(qTitle);
					qTitle.setForeground(new java.awt.Color(255,128,0));
					qTitle.setFont(new java.awt.Font("Copperplate Gothic Bold",1,25));
				}				

				questionsPanel = new JPanel();
				questionsPanel.setLayout(new BorderLayout());
				questionsCard.add(questionsPanel, BorderLayout.CENTER);
				questionsPanel.setOpaque(false);
				{
					dispQuestion = new JLabel();
					questionsPanel.add(dispQuestion, BorderLayout.NORTH);
					dispQuestion.setForeground(new java.awt.Color(255,255,255));
					dispQuestion.setFont(new java.awt.Font("Copperplate Gothic Bold",1,20));
					dispQuestion.setPreferredSize(new java.awt.Dimension(12, 80));

					answerPanel = new JPanel();
					questionsPanel.add(answerPanel, BorderLayout.CENTER);
					answerPanel.setOpaque(false);
					answerPanel.setPreferredSize(new java.awt.Dimension(794, 333));
					{
						//the label for the money to be displayed
						jMoney = new JLabel();
						answerPanel.add(jMoney);
						jMoney.setForeground(new java.awt.Color(255,255,255));
						jMoney.setPreferredSize(new java.awt.Dimension(355, 28));

						//code for the fifty fifty button
						helpFiftyFifty = new JButton();
						answerPanel.add(helpFiftyFifty);
						helpFiftyFifty.setText("Help: 50/50");
						//enabling the button
						helpFiftyFifty.setEnabled(true);
						helpFiftyFifty.setBackground(new java.awt.Color(128,255,128));
						helpFiftyFifty.addActionListener (new ActionListener () {
							public void actionPerformed (ActionEvent evt) {
								//setting a boolean variable
								fiftyFiftyUse = true;		
								//depending on where the correct answer is 2 wrong are removed
								if(answer1BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									answer2.setEnabled(false);
									answer4.setEnabled(false);
								} else if(answer2BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									answer4.setEnabled(false);
									answer3.setEnabled(false);
								} else if(answer3BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									answer2.setEnabled(false);
									answer1.setEnabled(false);
								} else if(answer4BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									answer3.setEnabled(false);
									answer1.setEnabled(false);
								}
								//playing the sound
								Sound.play("wiggleRiser.wav");
								//the button is disabled
								helpFiftyFifty.setEnabled(false);
							}
						});

						//the audience help button
						helpAskAudience = new JButton();
						answerPanel.add(helpAskAudience);
						helpAskAudience.setText("Help: Ask Audience");
						helpAskAudience.setEnabled(true);
						helpAskAudience.setBackground(new java.awt.Color(128,255,128));
						helpAskAudience.addActionListener (new ActionListener () {
							public void actionPerformed (ActionEvent evt) {
								//setting the boolean variable to true meaning the help feature hasn't been used
								askAudienceUse = true;

								Random rand = new Random();
								int ans1Ask= 0;
								int ans2Ask = 0;
								int ans3Ask = 0;
								int ans4Ask = 0;

								//Higher chance for the correct answer to be highest percentage
								//the last answer is always 100 minus the rest of the answer's percentages which always makes the 4 add up to 100%
								if(answer1BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									ans1Ask = rand.nextInt(20)+40;
									ans2Ask = rand.nextInt(20);
									ans3Ask = rand.nextInt(20);
									ans4Ask = 100-ans1Ask-ans2Ask-ans3Ask;

								} else if(answer2BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									ans1Ask = rand.nextInt(20);
									ans2Ask = rand.nextInt(20)+40;
									ans3Ask = rand.nextInt(20);
									ans4Ask = 100-ans1Ask-ans2Ask-ans3Ask;

								} else if(answer3BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									ans1Ask = rand.nextInt(20);
									ans2Ask = rand.nextInt(20);
									ans3Ask = rand.nextInt(20)+40;
									ans4Ask = 100-ans1Ask-ans2Ask-ans3Ask;

								} else if(answer4BtnInput.equals("<html>" + myCorrectAns + "</html>")){
									ans1Ask = rand.nextInt(20);
									ans2Ask = rand.nextInt(20);
									ans4Ask = rand.nextInt(20)+40;
									ans3Ask = 100-ans1Ask-ans2Ask-ans4Ask;

								}
								//
								Sound.play("help.wav");
								//making a chart out the results
								AskAudienceChart myChart = new AskAudienceChart("The audience voted",myQuestion, ans1Ask, ans2Ask,ans3Ask, ans4Ask );
								setModal(false);
								myChart.pack();
								myChart.setLocationRelativeTo(null);
								myChart.setVisible(true);
								myChart.setResizable(false);
								//disabling the audience help button
								helpAskAudience.setEnabled(false);
							}
						});

						answer1 = new JButton();
						answerPanel.add(answer1);
						answer1.setPreferredSize(new java.awt.Dimension(590, 50));
						answer1.addActionListener (new ActionListener () {
							public void actionPerformed (ActionEvent evt) {
								CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
								//How many questions there are in the game
								if(game.getQuestionNum() < 20){
									//if the first answer is the correct answer
									if(answer1BtnInput.equals("<html>" + myCorrectAns + "</html>")){
										//set the text for the next page to show you were correct
										qCatTitle.setText("<html>" +  "Correct! Now for your next question..." + "</html>");
										//add money to your account
										money = money + (10000*(game.getQuestionNum()));
										//play the sound to show you got the answer right
										Sound.play("rightSound.wav");
										//change to the choose category panel
										cl.show(backgroundLabel, "catCard");
										QuestionDisplay.this.setTitle("Choose category");
									}else{
										//if the button clicked was not correct play wrong answer sound
										Sound.play("wrongSound.wav");
										//display text to show they got the answer wrong
										endTitle.setText("<html>" +  "Oops wrong answer! You have only won £" + money + "</html>");
										//do not add money to account but send them straight to the end card panel
										cl.show(backgroundLabel, "endCard");
									}
								}else{
									//if the question is 20(or higher) add the last amount of money to bank
									money = money + (10000*(game.getQuestionNum()));
									//play the applause sound
									Sound.play("winApplause.wav");
									//set the text to how much you won
									endTitle.setText("<html>" +  "You won the game with £" + money + "</html>");
									//show the end card panel
									cl.show(backgroundLabel, "endCard");
								}
							}
						});

						answer2 = new JButton();
						answerPanel.add(answer2);
						answer2.setPreferredSize(new java.awt.Dimension(590, 50));
						answer2.addActionListener (new ActionListener () {
							public void actionPerformed (ActionEvent evt) {
								CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
								if(game.getQuestionNum() < 20){
									if(answer2BtnInput.equals("<html>" + myCorrectAns + "</html>")){
										qCatTitle.setText("<html>" +  "That's the right answer! What category now?..." + "</html>");
										money = money + (10000*(game.getQuestionNum()));
										Sound.play("rightSound.wav");
										cl.show(backgroundLabel, "catCard");
										QuestionDisplay.this.setTitle("Choose category");
									}else{
										Sound.play("psycho.wav");
										endTitle.setText("<html>" +  "Incorrect answer, you answered " + game.getQuestionNum() + " questions. You win £" + money + "</html>");
										cl.show(backgroundLabel, "endCard");
									}
								}else{
									money = money + (10000*(game.getQuestionNum()));
									Sound.play("winApplause.wav");
									endTitle.setText("<html>" +  "You won the game with £" + money + "</html>");
									cl.show(backgroundLabel, "endCard");
								}
							}
						});

						answer3 = new JButton();
						answerPanel.add(answer3);
						answer3.setPreferredSize(new java.awt.Dimension(590, 50));
						answer3.addActionListener (new ActionListener () {
							public void actionPerformed (ActionEvent evt) {
								CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
								if(game.getQuestionNum() < 20){
									if(answer3BtnInput.equals("<html>" + myCorrectAns + "</html>")){
										qCatTitle.setText("<html>" +  "That's the right answer! Choose a category for your next question..." + "</html>");
										money = money + (10000*(game.getQuestionNum()));
										Sound.play("rightSound.wav");
										cl.show(backgroundLabel, "catCard");
										QuestionDisplay.this.setTitle("Choose category");
									}else{
										Sound.play("evilLaugh.wav");
										endTitle.setText("<html>" +  "Mwahahahaaa you answered " + game.getQuestionNum() + " questions so you only win £" + money + "</html>");
										cl.show(backgroundLabel, "endCard");
									}
								}else{
									money = money + (10000*(game.getQuestionNum()));
									Sound.play("winApplause.wav");
									endTitle.setText("<html>" +  "You won the game with £" + money + "</html>");
									cl.show(backgroundLabel, "endCard");
								}
							}
						});

						answer4 = new JButton();
						answerPanel.add(answer4);
						answer4.setPreferredSize(new java.awt.Dimension(590, 50));
						answer4.addActionListener (new ActionListener () {
							public void actionPerformed (ActionEvent evt) {
								CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
								if(game.getQuestionNum() < 20){
									if(answer4BtnInput.equals("<html>" + myCorrectAns + "</html>")){
										qCatTitle.setText("<html>" +  "Correct! Now for your next question..." + "</html>");
										money = money + (10000*(game.getQuestionNum()));
										Sound.play("rightSound.wav");
										cl.show(backgroundLabel, "catCard");
										QuestionDisplay.this.setTitle("Choose category");
									}else{
										Sound.play("endGameNews.wav");
										endTitle.setText("<html>" +  "That is the wrong answer. You go home with £" + money + "</html>");
										cl.show(backgroundLabel, "endCard");
									}
								}else{
									money = money + (10000*(game.getQuestionNum()));
									Sound.play("winApplause.wav");
									endTitle.setText("<html>" +  "You won the game with £" + money + "</html>");
									cl.show(backgroundLabel, "endCard");
								}
							}
						});

					}
				}

				//the card that will let the player choose a new category for the next question
				catChooseCard = new JPanel();
				backgroundLabel.add(catChooseCard, "catCard");
				catChooseCard.setOpaque(false);
				{
					qTopPanel = new JPanel();
					catChooseCard.add(qTopPanel);
					qTopPanel.setPreferredSize(new java.awt.Dimension(792, 100));
					qTopPanel.setOpaque(false);
					{

						qCatTitle = new JLabel();
						qTopPanel.add(qCatTitle, BorderLayout.NORTH);
						qCatTitle.setText("Change category");
						qCatTitle.setForeground(new java.awt.Color(255,255,255));
						qCatTitle.setFont(new java.awt.Font("Copperplate Gothic Bold",1,20));
						qCatTitle.setPreferredSize(new java.awt.Dimension(790, 50));
					}	
					//the next question method is executed
					nextQuestion();

					//all 3 category buttons are very similar
					catGeneral = new JButton();
					catChooseCard.add(catGeneral);
					catGeneral.setText("General Knowledge Category");
					catGeneral.setPreferredSize(new java.awt.Dimension(250, 28));
					catGeneral.addActionListener (new ActionListener () {
						public void actionPerformed (ActionEvent evt) {
							//sets the category using a method
							setCategory(1);
							//gets the next question after the category is set
							nextQuestion();
							//shows the question card again
							CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
							cl.show(backgroundLabel, "questionsCard");
							//the title is set to the question number
							setTitle("Question " + game.getQuestionNum());
						}
					});

					catComp = new JButton();
					catChooseCard.add(catComp);
					catComp.setText("Computing Category");
					catComp.setPreferredSize(new java.awt.Dimension(250, 28));
					catComp.addActionListener (new ActionListener () {
						public void actionPerformed (ActionEvent evt) {
							setCategory(2);
							nextQuestion();
							CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
							cl.show(backgroundLabel, "questionsCard");
							setTitle("Question " + game.getQuestionNum());
						}
					});

					catSciNature = new JButton();
					catChooseCard.add(catSciNature);
					catSciNature.setText("Science and Nature Category");
					catSciNature.setPreferredSize(new java.awt.Dimension(250, 28));
					catSciNature.addActionListener (new ActionListener () {
						public void actionPerformed (ActionEvent evt) {
							setCategory(3);
							nextQuestion();
							CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
							cl.show(backgroundLabel, "questionsCard");
							setTitle("Question " + game.getQuestionNum());
						}
					});
				}

				//the end card is when the game is finished whether by winning of answering a question wrong
				endCard = new JPanel();
				BorderLayout endCardLayout = new BorderLayout();
				endCard.setLayout(endCardLayout);
				backgroundLabel.add(endCard, "endCard");
				endCard.setOpaque(false);
				{
					endTitle = new JLabel();
					endCard.add(endTitle, BorderLayout.CENTER);
					endTitle.setText("End");
					endTitle.setForeground(new java.awt.Color(255,255,255));
					endTitle.setFont(new java.awt.Font("Copperplate Gothic Bold",1,20));
					endTitle.setHorizontalAlignment(SwingConstants.CENTER);

					//adding an exit button
					restart = new JButton();
					endCard.add(restart, BorderLayout.SOUTH);
					restart.setText("Exit?");
					restart.setBackground(new java.awt.Color(41,41,41));
					restart.setBorder(new LineBorder(new java.awt.Color(255,128,0), 2, true));
					restart.setForeground(new java.awt.Color(255,255,255));
					restart.setFont(new java.awt.Font("Copperplate Gothic Bold",1,20));
					restart.setFocusPainted(false);				
					restart.setIcon(btnIMG);
					restart.setPreferredSize(new java.awt.Dimension(400, 31));
					restart.addActionListener (new ActionListener () {
						public void actionPerformed (ActionEvent evt) {
							Sound.play("blip.wav");
							CardLayout cl = (CardLayout)(backgroundLabel.getLayout());
							cl.show(backgroundLabel, "questionsCard");
							
							//resetting all the scores

							playersPlaying = 0;
							category = 1;
							difficulty = 1;
							money = 0;
							fiftyFiftyUse = false;
							askAudienceUse = false;

							nextQuestion();
							game.setQuestionNum(1);

							jMoney.setText("£" + money);

							answer1.setEnabled(true);
							answer2.setEnabled(true);
							answer3.setEnabled(true);
							answer4.setEnabled(true);

							helpFiftyFifty.setEnabled(true);
							helpAskAudience.setEnabled(true);

							setTitle("Question " + game.getQuestionNum());
							qTitle.setText(getTitle());
							//closing the window
							dispose();

						}
					});
				}
			}

			//setting up the window properties
			setSize(800, 600);
			setResizable(false);
			getContentPane().setBackground(new java.awt.Color(15,0,28));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void nextQuestion(){
		//if the question number is higher than 7 the change from easy to normal difficulty questions and if it is higher than 14 then hard questions
		if(game.getQuestionNum() <=7){
			difficulty = 1;
		}else if (game.getQuestionNum() >6 && game.getQuestionNum() <=12){
			difficulty = 2;
		}else if (game.getQuestionNum() >14){
			difficulty = 3;
		}

		//this variable is a random question brought in using a method form the GameControl class
		questionField = game.displayQuestion(category, difficulty);
		myIndex = questionField.getIndex();
		myQuestion = questionField.getQuestion();
		myCorrectAns = questionField.getCorrectAns();
		myWrongAns1 = questionField.getWrongAns1();
		myWrongAns2 = questionField.getWrongAns2();
		myWrongAns3 = questionField.getWrongAns3();

		//the question label text is set to the new question
		dispQuestion.setText("<html>Question: " + myQuestion + "</html>");

		Random rand = new Random();
		//there are 4 different places the correct answer button could be
		//it all depends on the answerReorder variable and the random class which gives it a number from 1 to 4
		int answerReorder = rand.nextInt(4) + 1;
		if(answerReorder==1){
			answer1.setText("<html>" + myCorrectAns + "</html>");
			answer2.setText("<html>" + myWrongAns1 + "</html>");
			answer3.setText("<html>" + myWrongAns2 + "</html>");
			answer4.setText("<html>" +  myWrongAns3 + "</html>");
		}else if(answerReorder==2){
			answer4.setText("<html>" + myCorrectAns + "</html>");
			answer3.setText("<html>" + myWrongAns1 + "</html>");
			answer2.setText("<html>" + myWrongAns2 + "</html>");
			answer1.setText("<html>" +  myWrongAns3 + "</html>");
		}else if(answerReorder==3){
			answer2.setText("<html>" + myCorrectAns + "</html>");
			answer3.setText("<html>" + myWrongAns1 + "</html>");
			answer4.setText("<html>" + myWrongAns2 + "</html>");
			answer1.setText("<html>" +  myWrongAns3 + "</html>");
		}else{
			answer3.setText("<html>" + myCorrectAns + "</html>");
			answer4.setText("<html>" + myWrongAns1 + "</html>");
			answer1.setText("<html>" + myWrongAns2 + "</html>");
			answer2.setText("<html>" +  myWrongAns3 + "</html>");
		}

		//these variables are given the text within each button
		answer1BtnInput = answer1.getText();
		answer2BtnInput = answer2.getText();
		answer3BtnInput = answer3.getText();
		answer4BtnInput = answer4.getText();

		//the money label text is set to the money variable
		jMoney.setText("£" + money);

		//all the answer buttons are enabled after the fifty fifty might have disabled them in the last question
		answer1.setEnabled(true);
		answer2.setEnabled(true);
		answer3.setEnabled(true);
		answer4.setEnabled(true);

		//disables the fifty fifty button if the boolean variable fiftyfiftyUse is true
		if(fiftyFiftyUse == true){
			helpFiftyFifty.setEnabled(false);
		}

		//disables the ask eh audience button if the boolean variable askAudienceUse is true
		if(askAudienceUse == true){
			helpAskAudience.setEnabled(false);
		}

		//the title is set to the question number
		this.setTitle("Question " + game.getQuestionNum());
		//the title is set to the title which should be the question number
		qTitle.setText(this.getTitle());
	}
}
