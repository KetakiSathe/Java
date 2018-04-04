
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SatheKetakiA5 {

	public static void main(String args[]) throws IOException {

		playGame();

	}

	private static void playGame() throws NumberFormatException, IOException {
		int min = 25;
		int max = 75;
		int userNum = 0;

		boolean repeatGame = true;

		String FIRST_TRY_PROMPT = "This is your trial 1. Guess a number to win the lottery!";
		String SECOND_TRY_PROMPT = "Alas! Please try again. This is your trial 2!";
		String THIRD_TRY_PROMPT = "Bad luck! You got one more trial!";

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while (repeatGame) {

			boolean victory = false;
			int randomNum = min + (int) (Math.random() * ((max - min) + 1));
			System.out.println(FIRST_TRY_PROMPT);

			int trialCount;
			for (trialCount = 0; trialCount <= 2; trialCount++) {

				try {
					userNum = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.out.println("Only Number input is acceptable. Assuming it as 0 for this trial");
				}

				if (randomNum == userNum) {
					victory = true;
					break;
				} else {
					switch (trialCount) {
					case 0:
						System.out.println(SECOND_TRY_PROMPT);
						break;
					case 1:
						System.out.println(THIRD_TRY_PROMPT);
						break;
					}
				}
			}

			printEndGameStatistics(victory, randomNum, trialCount);
			repeatGame = handleRepeatGameScenario();
		}
	}

	private static boolean handleRepeatGameScenario() throws IOException {

		System.out.println("Would you like to play again? (Y/N)");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String repeatGameUserInput = br.readLine();
		boolean repeatGame = false;

		switch (repeatGameUserInput) {
		case "Y":
			repeatGame = true;
			break;
		case "N":
			repeatGame = false;
			break;
		}
		return repeatGame;
	}

	private static void printEndGameStatistics(boolean victory, int randomNum, int trialCount) {

		String WIN_PROMPT = "Hurray! You won the lottery!";
		String LOST_PROMPT = "Sorry! You lost!";

		System.out.println((victory) ? WIN_PROMPT : LOST_PROMPT);
		System.out.println("Random number generated: " + randomNum);

		// trialCount needs to be +1 in a victory condition as it breaks out of
		// the for loop
		System.out.println("Number of trials: " + ((victory) ? trialCount + 1 : trialCount));
	}
}
