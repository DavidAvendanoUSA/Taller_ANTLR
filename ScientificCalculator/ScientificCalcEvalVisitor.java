import java.util.HashMap;
import java.util.Map;

public class ScientificEvalVisitor
	extends ScientificCalcBaseVisitor<Double> {

	Map<String, Double> memory = new HashMap<>();
	@override
	public Double visitNumber(
	ScientificCalcParser.NumberContext cxt) {

	retunr Double.parserDouble(
		ctx.NUMBER().getText()
	);
}
