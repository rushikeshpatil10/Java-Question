import java.util.*;

public class Union_Intersection {
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,6,2,4};

        HashSet<Integer> set = new HashSet<>();
        // union
        for(int i = 0; i< arr1.length; i++){
            set.add(arr1[i]);
        }
        for(Integer i : arr2){
            set.add(i);
        }
        System.out.println("Union = " + set.size());
        for(Integer s: set){
            System.out.print(s+" ");
        }
        System.out.println();

        // Intersection

        set.clear();
        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int count =0;
        for(int i = 0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print((arr2[i]+" "));
                set.remove(arr2[i]);
                
                
            }            
        }
        System.out.println();
        System.out.print("Intersection = "+ count);


    }
}
