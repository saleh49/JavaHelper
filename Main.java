import InputOutput.*;
import SortingAlgorithms.*;
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		BufferIO BufferIO = new BufferIO();
		BubbleSort BubbleSort = new BubbleSort();

		int[] x = BufferIO.getIntList();
		BufferIO.printText("Before Sorting");
		BufferIO.showIntList(x);
		BubbleSort.bubbleSort(x, 0);
		BufferIO.nextLine();
		BufferIO.printText("After Sorting");
		BufferIO.showIntList(x);
	}
}