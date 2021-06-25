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
		return "��";
	} 
	
	@Override
	protected String getDestString() {
		return "�޷�";
	}
}
