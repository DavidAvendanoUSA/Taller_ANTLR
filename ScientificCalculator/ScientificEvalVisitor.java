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
	@Override
	public Double visitAddSub(
		ScientificCalcParser.AddSubContext ctx) {
			double left = visit(ctx.expr(0));
			double right = visit(ctx.expr(1));
			if (ctx.op.getType() == ScientificCalcParser.ADD) {
				return left + right;
			}
		return left - right;
	}
	@Override
	public Double visitMulDiv(
		ScientificCalcParser.MulDivContext ctx) {
			double left = visit(ctx.expr(0));
			double right = visit(ctx.expr(1));
			if (ctx.op.getType() == ScientificCalcParser.MUL) {
				return left * right;
			}
			if (right == 0) {
				return System.out.println("Error: No se puede dividir entre cero.");
			} else {
				return left / right;
			}
	}

}
