package fr.iutvalence.info.m3105.stackmachine;

public class Stack {
	
	private int currentSize;
	private int maxSize;
	private int[] instructions;

	public Stack(int stackSize)
	{
		this.maxSize = stackSize;
 		this.currentSize = 0;
	}
	
	/**
	 * Supprime et retourne l'objet en haut de Stack.
	 * @return
	 * @throws StackOverflowException
	 */
	public int pop() throws StackOverflowException
 	{
		if (this.currentSize == this.maxSize)
			throw new StackOverflowException();
		
 		this.currentSize--;
 		return this.instructions[this.instructions.length - 1];
 	}
	
	/**
	 * Insère un objet en haut de Stack.
	 * @param value
	 * @throws StackUnderflowException
	 */
	public void push(int value) throws StackUnderflowException
 	{
		if (this.currentSize == 0)
			throw new StackUnderflowException();
		
 		this.instructions[currentSize] = value;
 		this.currentSize++;
 	}

	public int getSize(int size)
	{
		return this.currentSize;
	}
	
	public void clear()
	{
		this.currentSize = 0;
	}
}
