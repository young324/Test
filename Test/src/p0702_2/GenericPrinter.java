package p0702_2;

public class GenericPrinter<T extends Meterial>{//���� ����� �͸� Meterial�� ��ƾ���.
	private T meterial;

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	
}
