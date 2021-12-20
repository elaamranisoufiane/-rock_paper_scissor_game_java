
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String computerChoice = "";
		// String user, comp;

		int u = 0, c = 0;
		boolean playAgain = true;

		while (playAgain) {
			if ((u == 3) || (c == 3)) {
				if (u == 3) {
					System.out.println("================= USER WINS!!!!! ===============");

				} else if (c == 3) {
					System.out.println("================= COMPUTER WINS!!!!! ===============");
				} else {
					System.out.println("================= IT'S A TIE!!!!!! ===============");
				}
				System.out.println("============== CONGRATULATIONS =============");
				System.out.print("\nPlay again? [Y] - YES || [N] - NO :");
				String resp = read.next();
				if (resp.equals("Y")) {
					u = 0;
					c = 0;
				} else if (resp.equals("N")) {
					System.out.println("============ THANK YOU FOR PLAYING Rock Paper Sissor ==========");
					break;
				} else {
					System.out.println("Choice invalid !!");
				}
			}
			int number = (int) (Math.random() * 3);
			System.out.println("============= LETS PLAY Rock Paper Sissor =============");
			if (number == 0) {

				computerChoice = "rock";

			} else if (number == 1) {

				computerChoice = "paper";

			} else {
				computerChoice = "sissor";
			}

			System.out.print("Enter user choice: ");
			String userChoice = read.next();
			System.out.println("Computer Choice is " + computerChoice);

			if ((computerChoice.equals("rock") && userChoice.equals("paper"))
					|| (computerChoice.equals("sissor") && userChoice.equals("rock"))
					|| (computerChoice.equals("paper") && userChoice.equals("sissor"))) {
				u++;
				System.out.println("User wins!");
			}

			else if ((computerChoice.equals("rock") && userChoice.equals("sissor"))
					|| (computerChoice.equals("sissor") && userChoice.equals("paper"))
					|| (computerChoice.equals("paper") && userChoice.equals("rock"))) {
				c++;
				System.out.println("Computer wins!");

			}

			else if ((computerChoice.equals("rock") && userChoice.equals("rock"))
					|| (computerChoice.equals("sissor") && userChoice.equals("sissor"))
					|| (computerChoice.equals("paper") && userChoice.equals("paper"))) {

				System.out.println("It's a tie!");

			}
			// display scores
			System.out.println("\nLeaderboard:");
			System.out.println("User          : " + u);
			System.out.println("Computer      : " + c);
			System.out.println();

		}

	}
}