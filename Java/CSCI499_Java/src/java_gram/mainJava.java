package java_gram;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public class mainJava
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream is = System.in;
		if (inputFile != null)
		{
			is = new FileInputStream(inputFile);
		}
			
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(is);

		// creates a lexer that feeds off of input CharStream
		JavaLexer lexer = new JavaLexer(input);

		// creates a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		JavaParser parser = new JavaParser(tokens);

		//creates parse tree 
		ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        ProgramListener pl = new ProgramListener(parser);
        walker.walk(pl, tree);  
	}
}
