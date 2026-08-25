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
	@override
	public Double visitAddSub(
		ScientificCalcParser.AddSubContext ctx) {
			double left = visit(ctx.expr(0));
			double right = visit(ctx.expr(1));
			if (ctx.op.getType() == ScientificCalcParser.ADD) {
				return left + right;
			}
		return left - rigth;
	}

}
