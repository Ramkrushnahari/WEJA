package musicplayerR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicPlayer {
	static boolean loop = true;
	static int select, select1, select2, select3;

	public static void main(String[] args) {
		MusicPlayer m = new MusicPlayer();
		// main method
		while (loop) {
			m.selectOptions();
		}
	}

	// displaying option
	public void selectOptions() {
		SongOperations so = new SongOperations();
		Scanner inputScanner = new Scanner(System.in);

		try {
			System.out.println("Select Options.......");
			System.out.println("1.Play Song \n2.Add/Remove Song \n3.Edit Song \n4.Exit\n");
			select = inputScanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Number");
		}

		// case 1 song options
		switch (select) {
		case 1: {
			boolean stop = true;
			while (stop) {
				try {
					System.out.println("select option");
					System.out
							.println("1.select Song From Given List \n2.Play all songs \n3.Play Random \n4.Go Back\n");
					select1 = inputScanner.nextInt();
					stop = false;
				} catch (InputMismatchException e) {
					System.out.println("Please Enter Number\n");
					inputScanner.next();
				}
			}

			switch (select1) {
			case 1:
				so.selectToPlaySong();
				break;
			case 2:
				so.playAllSong();
				break;
			case 3:
				so.playRandomSong();
				break;
			case 4:
				System.out.println("Going Back.....\n\n");
				break;

			default:
				System.out.println("Invalid Choice.\n");
				break;
			}
		}
			break;

		// case 2 add/remove songs option
		case 2: {
			boolean stop = true;
			while (stop) {
				try {
					System.out.println("select option");
					System.out.println("1.Add Song \n2.Remove songs \n3.Go Back\n");
					select2 = inputScanner.nextInt();
					stop = false;
				} catch (InputMismatchException e) {
					System.out.println("Please Enter Number\n");
					inputScanner.next();
				}
			}

			switch (select2) {
			case 1:
				so.addSong();
				break;
			case 2:
				so.removeSong();
				break;
			case 3:
				System.out.println("Going Back.....\n\n");
				break;

			default:
				System.out.println("Invalid Choice\n");
				break;
			}
		}
			break;

		// case 3 updating song
		case 3: {
			boolean stop = true;
			while (stop)
				try {
					if (SongOperations.start) {
						System.out.println("select options ");
						System.out.println("1.Update Song Name\\Singer Name\\Movie Name\\Song Duration\n2.Go Back\n");
						select3 = inputScanner.nextInt();
						switch (select3) {
						case 1:
							so.updateSong();
							break;
						case 2:
							System.out.println("Going Back.....\n\n");
							break;

						default:
							System.out.println("Invalid Choice\n");
							stop = false;
							break;
						}
					} else {
						System.out.println(
								"Loading Song List....\nNo song present in list..\nPlease add song first before update....\n");
					}
					stop = false;
				} catch (InputMismatchException e) {
					System.out.println("Please Enter Number\n");
					inputScanner.next();
				}

		}
			break;

		// case 4 exiting from menu
		case 4:
			System.out.println("Exting.....\n");
			loop = false;
			break;

		default:
			System.out.println("Invalid Choice\n");
			break;
		}
	}
}
