package pcd.lab02.lost_updates;

public class UnsafeCounter {

	private int cont;

	public UnsafeCounter(int base) {
		this.cont = base;
	}

	public void inc() {
		synchronized (this) {
			cont++;
		}
	}

	public int getValue() {
		return cont;
	}
}
