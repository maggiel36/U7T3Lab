import java.util.ArrayList;

public class Digits
{
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        while (num > 0)
        {
            int remainder = num % 10;
            digitList.add(0, remainder);
            num = num / 10;
        }
        if (digitList.size() == 0)
        {
            digitList.add(Integer.valueOf(0));
        }
    }

    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        int previous = -1;
        for (int value : digitList)
        {
            if (value <= previous)
            {
                return false;
            }
            previous = value;
        }
        return true;
    }
}