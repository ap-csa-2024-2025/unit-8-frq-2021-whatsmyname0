public class Main
{
  public static void main(String[] args)
  {
    int[][] arr = {{2, 1, 0},
                   {1, 3, 2},
                   {0, 0, 0},
                   {4, 5, 6}};
    System.out.println("Testing ArrayResizer.isNonZeroRow(arr, 0)");
    System.out.println("Expected value: false\nActual Value: " + ArrayResizer.isNonZeroRow(arr, 0));

    System.out.println("Testing ArrayResizer.isNonZeroRow(arr, 1)");
    System.out.println("Expected value: true\nActual Value: " + ArrayResizer.isNonZeroRow(arr, 1));
    
    int[][] smaller = ArrayResizer.resize(arr);
    System.out.println("Expected result:\n1 3 2\n4 5 6\nActual result:");

    for (int[] row : smaller)
    {
      for (int elem : row)
      {
        System.out.print(elem + " ");
      }
      System.out.println();
    }
  }
}
