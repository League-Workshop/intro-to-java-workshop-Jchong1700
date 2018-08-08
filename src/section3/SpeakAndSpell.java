package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("Spell osteoporosis");
		// 2. Catch the user's answer in a String
String answer = JOptionPane.showInputDialog("Spell!");
		// 3. If the user spelled the word correctly, speak "correct"
if (answer.equalsIgnoreCase("osteoporosis")) {speak("Correct!");
} 

		// 4. Otherwise say "wrong"
else {speak("WRONG!");

}
		// 5. repeat the process for other words
		speak("Spell silhouette");
		String answer2 = JOptionPane.showInputDialog("Spell!");
		if (answer2.equalsIgnoreCase("silhouette")) {speak("Correct!");
		
	}
	else {speak("WRONG!");
	}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


