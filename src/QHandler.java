import java.util.Random;

/**
 * @author Ebrahim
 */
public class QHandler {

	// an object of Questions class
	Question AddQuestions = new Question();

	//the question number
	private int questionNum = -1;

	//a variable used to work out which question to pull out of the arraylist
	private int index;

	//using the random class to choose a random question
	Random rand = new Random();

	// =========================================================================================
	/**
	 * returning the question array to the game controller
	 * @param category, difficulty
	 * @return the question from an array list
	 */
	public Question returnQuestion(int category, int difficulty){
		//the category is worked our from here
		if(category == 1){
			dispCat1();
		}else if(category == 2){
			dispCat2();
		}else if(category == 3){
			dispCat3();
		}

		//incrementing the question number
		questionNum++;
		//returns the question according to difficulty
		return getQuestion(index, difficulty);
	}

	// works out where the question is according to category
	public void dispCat1(){
		//display General question
		//change the nextInt() number to however many questions you have in that category
		index = rand.nextInt(7) + 0;
	}

	public void dispCat2(){
		//display Computing question
		//the number added to nextInt() is last index number of the previous category
		index = rand.nextInt(7) + 7;
	}

	public void dispCat3(){
		//display Science and Nature question
		index = rand.nextInt(7) + 14;
	}
	// =========================================================================================

	/**
	 * get the question from 3 seperate array lists
	 * @param index, difficulty
	 * @return
	 */

	public Question getQuestion(int index, int difficulty) {
		//setting displayQ to the easy array list at first
		Question displayQ = AddQuestions.easyQuizList.get(index);
		//now checking which the question should be under
		if(difficulty == 1){
			displayQ = AddQuestions.easyQuizList.get(index);
		}else if(difficulty == 2){
			displayQ = AddQuestions.normalQuizList.get(index);
		}else if(difficulty == 3){
			displayQ = AddQuestions.hardQuizList.get(index);
		}
		return displayQ;
	}

	/**
	 * @return the questionNum
	 */
	public int getQuestionNum() {
		return questionNum;
	}

	//setting the question number
	public void setQuestionNum(int no) {
		questionNum = no;
	}

}
