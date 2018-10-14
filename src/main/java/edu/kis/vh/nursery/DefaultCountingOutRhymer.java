package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int empty_stack = -1;
	private static final int full_stack = 11;
	private static final int stack_capacity = 12;

	private int[] NUMBERS = new int[stack_capacity];

	private int total = empty_stack;

	protected int getTotal()
	{
		return total;
	}

	protected void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	protected boolean callCheck() {
		return total == empty_stack;
	}

	protected boolean isFull() {
		return total == full_stack;
	}

	protected int peekaboo() {
		if (callCheck())
			return empty_stack;
		return NUMBERS[total];
	}

	protected int countOut() {
		if (callCheck())
			return empty_stack;
		return NUMBERS[total--];
	}
}
