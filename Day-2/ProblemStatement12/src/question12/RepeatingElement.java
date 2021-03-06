package question12;

import java.util.HashSet;

public class RepeatingElement {
	static void printFirstRepeating(int arr[])
	{
		// Initialize index of first repeating element
		int min = -1;

		
		HashSet<Integer> set = new HashSet<>();

		// Traverse the input array from right to left
		for (int i=arr.length-1; i>=0; i--)
		{
			// If element is already in hash set, update min
			if (set.contains(arr[i]))
				min = i;

			else // Else add element to hash set
				set.add(arr[i]);
		}

		// Print the result
		if (min != -1)
		System.out.println("The first repeating element is : " + arr[min]);
		else
		System.out.println("There are no repeating elements");
	}

	// Driver method to test above method
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1, 2, 3, 10, 3, 4, 5, 7, 8};
		printFirstRepeating(arr);
		
		int arr1[] = {1, 2, 3, 10, 2, 4, 5, 7, 8};
		printFirstRepeating(arr1);
	}

}
