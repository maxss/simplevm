package vm;

public class MemoryShare {
	private int ptr;
	private int size;
	
	public MemoryShare(int ptr, int size) {
		this.ptr = ptr;
		this.size = size;
	}
	
	public int getPtr() {
		return ptr;
	}
	
	public void setPtr(int ptr) {
		this.ptr = ptr;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
}
