package fr.iutvalence.info.m3105.stackmachine;

public class Stack {
	
	private int size;
	private int maxSize;
	private int[] instructions;

	public Stack(int stackSize)
	{
		this.maxSize = stackSize;
 		this.size = 0;
	}
	
	/**
	 * Supprime et retourne l'objet en haut de Stack.
	 * @return
	 * @throws StackOverflowException
	 */
	public int pop() throws StackOverflowException
 	{
		if (this.size == this.maxSize)
			throw new StackOverflowException();
		
 		this.size--;
 		return this.instructions[this.instructions.length - 1];
 	}
	
	/**
	 * Insère un objet en haut de Stack.
	 * @param value
	 * @throws StackUnderflowException
	 */
	public void push(int value) throws StackUnderflowException
 	{
		if (this.size == 0)
			throw new StackUnderflowException();
		
 		this.instructions[size] = value;
 		this.size++;
 	}

	public int getSize(int size)
	{
		return this.size;
	}
	
	public void clear()
	{
		this.size = 0;
	}
}
