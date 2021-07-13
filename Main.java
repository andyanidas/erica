import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class Main {


    public static void main(String[] args){
        int[] arr = {2,3,4,4,7,2,1};
        System.out.println("Finding uniq array in ascending order:");
        findUniq(arr);
        System.out.println("Finding uniq array in descending order:");
        findUniqDes(arr);

        String[] languages = {"java", "python", "javascript", "c++", "java", "c++"};
        System.out.println("Counting uniq elements from String array: ");
        System.out.println(countingUniqElements(languages));
        //Task 4
        ArrayList<String> newList = sortStr(languages);
        //task 5
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("python");
        list.add("javascript");
        list.add("c++");
        list.add("java");
        list.add("c++");
        System.out.println("Task5: ");
        sortStrArrayList(list);
    }

    public static void findUniq(int[] arr){
        Arrays.sort(arr);

        for(int i =0; i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i] + " ");
            }
            if(i+1==arr.length-1){
                System.out.println(arr[i+1]);
            }
        }
    }
    public static void findUniqDes(int[] arr){
        Arrays.sort(arr);

        for(int i =arr.length-1; i>0;i--){
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i] + " ");
            }
            if(i-1==0){
                System.out.println(arr[i-1]);
            }
        }
    }

    //{"java", "python", "javascript", "c++", "java", "c++"};
    public static int countingUniqElements(String[] str){//eliminate
        int count=0;
        boolean found= false;
        for(int i=0; i<str.length; i++){
            for(int k=0;k<i;k++){
                if(str[i].equals(str[k])) {
                    found=true;
                    break;
                }
            }
            if(!found){
                count++;
            }
            found=false;
        }
        return count;
    }
    //task 4
    public static ArrayList<String> sortStr(String[] str){
        ArrayList<String> newList = new ArrayList<String>();
        Arrays.sort(str);
        for(String word: str){
            if(!newList.contains(word)){
                newList.add(word);
            }
        }
        return newList;
    }

    //Task 5
    //[“java”, “phython”, “javascript”, “c++”, “java”, “c++”]
    public static String[] sortStrArrayList(List<String> str){
        List<String> newList = new ArrayList<String>();
        Collections.sort(str, Collections.reverseOrder());
        //{c++, c++, java, java, javascript, python}
//        System.out.println(str);
        for(int i = 0; i<str.size();i++){
            if(!newList.contains(str.get(i))){//hervee newlist dotor word baihgui bol newlist ruu nem
                newList.add(str.get(i));
                System.out.print(str.get(i) + " ");
            }
        }
        String[] newArray = new String[newList.size()];
        newArray = newList.toArray(newArray);
        return newArray;
    }

}