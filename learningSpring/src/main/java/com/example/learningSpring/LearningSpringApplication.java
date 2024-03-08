package learningSpring.src.main.java.com.example.learningSpring;

/**
 * LearningSpringApplication
 */
public class LearningSpringApplication {

	public static void main(String[] args) {
		
		
		var game = new SuperContraGame();
		// var game = new MarioGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}