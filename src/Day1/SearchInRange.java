package Day1;

public class SearchInRange {
    public static void main(String[] args) {
        int [] numbers = {11,12,33,44,76,67,8,9,0,4};
        int target = 44;
        System.out.println(searchInRange(numbers, target, 0,7));

    }

    static int searchInRange(int [] arr ,int target,int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }

        return -1;

    }
}
