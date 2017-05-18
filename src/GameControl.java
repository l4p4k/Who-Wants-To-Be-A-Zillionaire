import java.util.ArrayList;

/**
 * This class takes control of the game by passing through relevant information to the GUI classes
 */

/**
 * @author Ebrahim
 *
 */
public class GameControl {

	public int numPlayers;
	// name of the players
	private String name1 = "Player1";
	private String name2 = "Player2";

	// QHandler object which is used to call methods in the QHandler class
	QHandler questions = new QHandler();
	// an arraylist of players containing objects of Players class
	private ArrayList<Players> playersList = new ArrayList<Players>();

	/**
	 * empty constructor to be called from the GUI class
	 * 
	 */
	public GameControl(){
	}

	/**
	 * add players accordingly, it will also return the number of players
	 * @return the number of players
	 */
	public int addPlayers(int numPlayers){
		playersList.clear();
		if (numPlayers == 1){
			playersList.add(new Players(name1));
		}else if (numPlayers == 2){
			playersList.add(new Players(name1));
			playersList.add(new Players(name2));
		}
		return this.numPlayers;
	}

	/**
	 * display question is called from the GUI class QuestionDisplay
	 * @return the question depending on category and difficulty which are both send from the GUI classes.
	 */
	public Question displayQuestion(int category, int difficulty){
		return questions.returnQuestion(category, difficulty);
	}

	/**
	 * @return the questionNum
	 */
	public int getQuestionNum() {
		return questions.getQuestionNum();
	}

	/**
	 * set the question number
	 * @param question number to be set
	 */
	public void setQuestionNum(int no) {
		questions.setQuestionNum(no);
	}

}
