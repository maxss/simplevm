package vm;

public class Process {
	
	private byte flags;
	private byte[] memory;
	private byte[] stack;
	
	private int pc;
	private int sp;
	
	private boolean running;
	
	public Process(int memorySize, int stackSize) {
		memory = new byte[memorySize];
		stack = new byte[stackSize];
		
		setRunning(true);
		setPc(4);
	}
	
	public byte[] getMemory() {
		return memory;
	}
	
	public void setMemory(byte[] memory) {
		this.memory = memory;
	}
	
	public byte[] getStack() {
		return stack;
	}
	
	public void setStack(byte[] stack) {
		this.stack = stack;
	}

	public int getPc() {
		return pc;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public byte getFlags() {
		return flags;
	}

	public void setFlags(byte flags) {
		this.flags = flags;
	}

	public int getStackSize() {
		return stack.length;
	}

	public void setStackSize(int stackSize) {

		byte[] newStack = new byte[stackSize];
		int length = newStack.length < stack.length ? newStack.length : stack.length;
		System.arraycopy(stack, 0, newStack, 0, length);
		
		this.stack = newStack;
	}

	public int getMemSize() {
		return memory.length;
	}

	public void setMemSize(int memSize) {
		
		byte[] newMem = new byte[memSize];
		int length = newMem.length < stack.length ? newMem.length : stack.length;
		System.arraycopy(stack, 0, newMem, 0, length);
		
		this.stack = newMem;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
}
