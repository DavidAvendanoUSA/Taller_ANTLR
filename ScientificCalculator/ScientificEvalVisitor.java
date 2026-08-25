import java.util.HashMap;
import java.util.Map;

public class ScientificEvalVisitor
	extends ScientificCalcBaseVisitor<Double> {

	Map<String, Double> memory = new HashMap<>();
	@Override
	public Double visitNumber(
	ScientificCalcParser.NumberContext cxt) {

	return Double.parseDouble(
		cxt.NUMBER().getText()
	);
	}
}
