package abstractQuiz;

public class Won2Dollar extends Converter {
	public Won2Dollar(double won) {
	}

	@Override
	protected double convert(double src) {
		return src / 1200;
	}

	@Override
	protected String getSrcString() {
		return "¿ø";
	}

	@Override
	protected String getDestString() {
		return "´Þ·¯";
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
