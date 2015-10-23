import java.util.Scanner;

public class MyBubbleSorting{
	
	public static void main(String[] args){
		int count, temp = 0, a, b;
		Scanner cr = new Scanner(System.in);
		
		System.out.print("How many numbers you like to sort? ");
		count = cr.nextInt();
		
		int sort[] = new int[count];
		System.out.println("Input " + count + " numbers: ");
		 
		for(a = 0; a < count; a++)
			sort[a] = cr.nextInt();	
		
	for (a = 0; a < ( count - 1 ); a++) {
		for (b = 0; b < count - a - 1; b++)
      {
        if (sort[b] > sort[b+1]) 
        {
           temp = sort[b];
           sort[b] = sort[b+1];
           sort[b+1] = temp;
        }         
      }
    }
 
    System.out.println("Ascending Formation:");
	 for (x = 0; x < count; x++)
      System.out.print(sort[x]+ " ");
 
  
  for (x = 0; x < ( count - 1 ); x++) {
		for (y = 0; y < count - x - 1; y++)
      {
        if (sort[y] < sort[y+1]) 
        {
           temp = sort[y];
           sort[y] = sort[y+1];
           sort[y+1] = temp;
        }         
      }
    }
 
     System.out.println("\nDescending Formation:");
	 for (x = 0; x < count; x++)
      System.out.print(sort[x]+ " ");
	 
	
}
}