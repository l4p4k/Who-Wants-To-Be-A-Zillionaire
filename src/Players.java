/**
 * 
 */

/**
 * @author Ebrahim
 *
 */
public class Players {
	//the name of the player
	private String playerName;

	//a blank constructor
	public Players() {
	}
	
	/**
	 * @param player which is the name of the player
	 */
	public Players(String player){
		this.playerName = player;
	}

	/**
	 * @return the players name
	 */
	public String getPlayerName() {
		return playerName;
	}
}
