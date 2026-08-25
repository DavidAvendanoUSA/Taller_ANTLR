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
				System.out.println("Error: No se puede dividir entre cero.");
				return 0.0;
			} else {
				return left / right;
			}
	}

	@Override
	public Double visitParens(
	ScientificCalcParser.ParensContext ctx) {
		return visit (ctx.expr());
	}

	@Override
	public Double visitPrintExpr(
		ScientificCalcParser.PrintExprContext ctx) {
			double value = visit(ctx.expr());
			System.out.println(value);
			return value;
	}

	@Override
	public Double visitAssign(
		ScientificCalcParser.AssignContext ctx) {
			String id = ctx.ID().getText();
			double value = visit(ctx.expr());
			memory.put(id, value);
		return value;
	}

	@Override
	public Double visitId(
		ScientificCalcParser.IdContext ctx) {
			String id = ctx.ID().getText();
			if (memory.containsKey(id)){
				return memory.get(id);
			}
			throw new RuntimeException("Variable no definida: " + id);
	}
	@Override
	public Double visitPower(
		ScientificCalcParser.PowerContext ctx) {
			double base = visit(ctx.expr(0));
			double exponent = visit(ctx.expr(1));
			return Math.pow(base,exponent);
	}



}
