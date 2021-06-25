package test;

public class Won2Dollar extends Converter {
	double won;
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	
	@Override
	protected String getSrcString() {
		return "¿ø";
	} 
	
	@Override
	protected String getDestString() {
		return "´Þ·¯";
	}
}
