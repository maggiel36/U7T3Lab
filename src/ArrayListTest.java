import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //COMPLETE ME!
        for (int i = 1; i < numList.size() - 1; i++)
        {
            int current = numList.get(i);
            int next = numList.get(i + 1);
            numList.set(i - 1, current + next);
        }
        System.out.println(numList);
    }
}
