//8. Write a Java Program to check whether the given array is Mirror Inverse or not.
public class mirror_inverse {
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3 };
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
