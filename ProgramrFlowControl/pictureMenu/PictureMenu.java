package pictureMenu;

import java.util.Scanner;

/**
 * In this exercise, you'll see how to call functions. Functions are 
 * chunks of code with a name, and "calling" a function means to call 
 * on the function to do a task for you.
 * You have to call the functions by taking input from the user and 
 * display the picture of the animal.
 * 
 * @author Renan
 *
 */

public class PictureMenu {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int choice;

		System.out.println( "1. Butterfly 2. Elephant 3. Teddy Bear 4. Snake:" );
		System.out.print( "Which animal to draw?:" );
		choice = kb.nextInt();
		System.out.println();
		/// {write your code here
		switch(choice){
		case 1:
			butterfly();
			break;
		case 2:
			elephant();
			break;
		case 3:
			teddybear();
			break;
		case 4:
			snake();
			break;
		default:
			System.out.println("Incorrect choice.");
		}
		/// }
	}

	public static void butterfly(){
		System.out.println("  .==-.                   .-==.     ");
		System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
		System.out.println("   (88\"     .  \\./  .     \"88)   ");
		System.out.println("    \\_.'`-    .(#).    -'`._/      ");
		System.out.println("      `._... .q(_)p. ..._.'         ");
		System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
		System.out.println("        .\"\"' .'|=|`. `\"\".       ");
		System.out.println("       .' 8(o)./|=|\\.(o)8 `.       ");
		System.out.println("     (O  8   / \\_/ \\   8  O)      ");
		System.out.println("      \\O `  /       \\  ' O/       ");
		System.out.println("       \"\"--'         `--\"\"   hjw");
	}
	public static void elephant(){
		System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
		System.out.println("   _.-'         \\ __...----...__ /         '-._");
		System.out.println(" .'      .:::...,'              ',...:::.      '.");
		System.out.println("(     .'``'''::;                  ;::'''``'.     )");
		System.out.println(" \\             '-)              (-'             /");
		System.out.println("  \\             /                \\             /");
		System.out.println("   \\          .'.-.            .-.'.          /");
		System.out.println("    \\         | \\0|            |0/ |         /");
		System.out.println("    |          \\  |   .-==-.   |  /          |");
		System.out.println("     \\          `/`;          ;`\\`          /");
		System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
		System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
		System.out.println("               / /`;   .==.   ;`\\ \\");
		System.out.println("         .---./_/   \\  .==.  /   \\ \\");
		System.out.println("        / '.    `-.__)       |    `\"");
		System.out.println("       | =(`-.        '==.   ;");
		System.out.println(" jgs    \\  '. `-.           /");
		System.out.println("         \\_:_)   `\"--.....-'");
	}

	public static void teddybear(){
		System.out.println("            ___   .--. ");
		System.out.println("      .--.-\"   \"-' .- |");
		System.out.println("     / .-,`          .'");
		System.out.println("     \\   `           \\");
		System.out.println("      '.            ! \\");
		System.out.println("        |     !  .--.  |");
		System.out.println("        \\        '--'  /.____");
		System.out.println("       /`-.     \\__,'.'      `\\");
		System.out.println("    __/   \\`-.____.-' `\\      /");
		System.out.println("    | `---`'-'._/-`     \\----'    _");
		System.out.println("    |,-'`  /             |    _.-' `\\");
		System.out.println("   .'     /              |--'`     / |");
		System.out.println("  /      /\\              `         | |");
		System.out.println("  |   .\\/  \\      .--. __          \\ |");
		System.out.println("   '-'      '._       /  `\\         /");
		System.out.println("      jgs      `\\    '     |------'`");
		System.out.println("                 \\  |      |");
		System.out.println("                  \\        /");
		System.out.println("                   '._  _.'");
		System.out.println("                      ``");

	}	
	public static void snake(){
		System.out.println("         ,,'6''-,.");
		System.out.println("        <====,.;;--.");
		System.out.println("        _`---===. \"\"\"==__");
		System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
		System.out.println("     |( @@@  |===|  @@@  ||");
		System.out.println("      \\\\ @@   |===|  @@  //");
		System.out.println("        \\\\ @@ |===|@@@ //");
		System.out.println("         \\\\  |===|  //");
		System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
		System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
		System.out.println("             |==||                           `\\   \\");
		System.out.println("            |==| |          pb                 )   |");
		System.out.println("           |==| |       _____         ______,--'   '");
		System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
		System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
		System.out.println("                \"\"\"\"		");
	}

}
