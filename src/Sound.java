import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public static synchronized void play(final String fileName) 
	{
		// Note: use .wav files             
		new Thread(new Runnable() { 
			public void run() {
				try{
					Clip clip = AudioSystem.getClip();
					java.net.URL defaultSound = this.getClass().getResource(fileName); 
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(defaultSound); 
					clip.open(audioInputStream); 
					clip.start(); 
				} 
				catch (Exception ex) {
					ex.printStackTrace();
				}                 
			}
		}).start();
	}
}