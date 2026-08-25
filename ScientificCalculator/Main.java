import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	public static void main(Strig[] args ) throws Exception {
		
		CharStream input = 
			CharSteams.fromStream(System.in);

		ScientificCalcLexer lexer =
			new ScientificCalcLexer(input);

		CommonTokenStream tokens =
			new CommonTokenStream(lexer);

		ScientificCalcParser parser =
			new ScientificCalcParser(tokens);

		ParserTree tree =
			parser.prog();

		ScientificEvalVisitor visitor =
			new ScientificCalcEvalVisitor();

		visitor.visit(tree);

	}
}
