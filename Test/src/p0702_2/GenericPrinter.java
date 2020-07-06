package p0702_2;

public class GenericPrinter<T extends Meterial>{//내가 사용할 것만 Meterial에 담아쓴다.
	private T meterial;

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	
}
