package java_gram;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author rahkeemg This class is designed to generate the LOC count, blank
 *         lines count, and commments count. Currently, blank lines counts are
 *         not functioning
 * 
 * 
 *         Idea: Use the start and stop tokens of the different rules to pass
 *         into Stats, along with the the Tokenstream. From there, try using
 *         those two tokens intervals to calculate the loc and total lines of
 *         code for each respective rule. This way, the Stats class is reusable.
 */

public class Stats {
	private TokenStream tokens;
	private Token start, stop;
	private int loc = 0, comments = 0, blank = 0;

	// variables to count occurences of different items in code
	private int c_import = 0, c_package = 0, c_switch = 0, c_case = 0,
			c_try = 0, c_catch = 0, c_if = 0, c_else = 0, c_for = 0, c_do = 0,
			c_while = 0;

	/**
	 * Constructor
	 */

	/** Default constructor */
	public Stats() {
	}

	public Stats(TokenStream tstream) {
		tokens = tstream;
	}

	public Stats(TokenStream tstream, Token t1, Token t2) {
		tokens = tstream;
		start = t1;
		stop = t2;
	}

	public void setStart(Token t1) {
		start = t1;
	}

	public void setStop(Token t2) {
		stop = t2;
	}

	public Token getStart() {
		return start;
	}

	public Token getStop() {
		return stop;
	}

	/* Method to generate LOC, and comment counts */
	public void count() {

		String code = "";
		int stop_index;

		// add 1 to end to get the very last token of rule if that tokens is not
		// EOF
		if (stop.getType() != JavaLexer.EOF)
			stop_index = stop.getTokenIndex() + 1;
		else
			stop_index = stop.getTokenIndex();

		for (int i = start.getTokenIndex(); i <= stop_index; i++) {
			Token t = tokens.get(i);
			if (t.getChannel() == JavaLexer.COMMENTS) {
				/* Note: Everything in comment tokens is clustered together */
				comments += t.getText().split("\n").length;
				// Can implement blank line count in this part of the code
			} else if (t.getChannel() == JavaLexer.NEWLINES) {
				// Conditional to check if there is a physical line of code
				if (code.trim().isEmpty() == false) {
					loc++;
					code = "";
				}
				/**
				 * Conditional to check for blank lines
				 * 
				 * Note: looks like blank line tokens will always be grouped
				 * together
				 * */
				if (t.getText().split("\n").length >= 2) {
					if (t.getTokenIndex() == 0) // Blank line at beginning of
												// code
						blank += t.getText().split("\n").length;
					else
						blank += t.getText().split("\n").length - 1;
				}
				// System.out.println("Blank line count: " + blank);

			} else {
				identifyToken(t);
				code += t.getText();
			}
		}
//		System.out.println("Total Lines: " + totalLines());
//		System.out.println("Lines  of code: " + getLoc());
//		System.out.println("Lines of comment: " + getComments());
//		System.out.println("End of stats count");
	}

	public int getLoc() {
		return loc;
	}

	public int getComments() {
		return comments;
	}

	public int getBlank() {
		return blank;
	}

	public int totalLines() {
		if (stop.getType() == JavaLexer.EOF)
			return stop.getLine() - start.getLine();
		return stop.getLine() - start.getLine() + 1;
	}

	/** @TODO need to implement to find these different blocks */
	public void identifyToken(Token t) {

		switch (t.getType()) {
		case (JavaLexer.IMPORT):
			c_import++;
			break;
		case (JavaLexer.PACKAGE):
			c_package++;
			break;
		case (JavaLexer.IF):
			c_if++;
			break;
		case (JavaLexer.ELSE):
			c_else++;
			break;
		case (JavaLexer.FOR):
			c_for++;
			break;
		case (JavaLexer.DO):
			c_do++;
			break;
		case (JavaLexer.WHILE):
			c_while++;
			break;
		case (JavaLexer.SWITCH):
			c_switch++;
			break;
		case (JavaLexer.CASE):
			c_case++;
			break;
		case (JavaLexer.TRY):
			c_try++;
			break;
		case (JavaLexer.CATCH):
			c_catch++;
			break;
		default:
			break;
		}
	}

	public int getImport() {
		return c_import;
	}

	public int getPackage() {
		return c_package;
	}

	public int getSwitch() {
		return c_switch;
	}

	public int getCase() {
		return c_case;
	}

	public int getTry() {
		return c_try;
	}

	public int getCatch() {
		return c_catch;
	}

	public int getIf() {
		return c_if;
	}

	public int getElse() {
		return c_else;
	}

	public int getFor() {
		return c_for;
	}

	public int getDo() {
		return c_do;
	}

	public int getWhile() {
		return c_while;
	}
}