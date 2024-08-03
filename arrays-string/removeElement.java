import java.util.*;
public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val =3;
        int count = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            if(!(nums[i]==val)){
                nums[count] = nums[i];
                count++;
            }
        }
    }
}
