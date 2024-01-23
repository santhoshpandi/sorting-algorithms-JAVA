import java.util.*;
public class sorting{
    public void print(int[] a)
    {
        for(int i : a)
            System.out.print(i+" , ");
        System.out.println();
    }
    public int[] bubble_sort(int[] a)
    {

        return a;
    }
    public static void main(String[] args) {
        sorting s = new sorting();
        Scanner c = new Scanner(System.in);
        int[] a = {1,100,12,58,31,98,25};
        while(true)
        {
            System.out.println("1.Bubble sort 2.insertion sort 3.merge sort 4.quick sort 5.selection sort 6.exit");
            int ch = c.nextInt();
            switch(ch)
            {
                case 1:
                {
                    s.print(s.bubble_sort(a));
                    break;
                }
                case 2:
                {

                }
                case 3:
                {

                }
                case 4:
                {

                }
                case 5:
                {

                }
                case 6:
                {
                    return;
                }
            }
        }
        
    }
}