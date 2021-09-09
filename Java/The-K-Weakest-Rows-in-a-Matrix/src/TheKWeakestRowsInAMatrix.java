import java.util.*;

public class TheKWeakestRowsInAMatrix {

    /*
    * 思路提出者：wenzi
    * 代码来源：https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/comments/977735
    * 战斗值*100 + 行号，然后排序，排完序后再对100取余
    * 思路很棒。
    * */
//    public int[] kWeakestRows(int[][] mat, int k) {
//        int m=mat.length;
//        int n=mat[0].length;
//        //统计每行的战斗力，并通过对战斗力和i行 来进行运算，是int数组既可以表示战斗力，也可以表示其索引
//        //通过数组实现hashmap的功能
//        int [] res=new int[m];
//        for(int i=0;i<m;i++ ){
//            int l=0;
//            int r=n-1;
//            int mid=(r-l)/2+l;
//            while(l<=r){
//                if(mat[i][mid]==1){
//                    l=mid+1;
//                }else {
//                    r=mid-1;
//                }
//                mid=(r-l)/2+l;
//            }
//            res[i]=100*(l+1)+i;
//        }
//        Arrays.sort(res);
//        int []ans=new int[k];
//        for(int i=0;i<k;i++){
//            ans[i]=res[i]%100;
//        }
//        return ans;
//    }

    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = Arrays.stream(mat[i]).sum();
            map.put(i,sum);
        }
        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        int[] result = new int[k];
        for (int x = 0; x < k; x++){
            result[x] = entries.get(x).getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[] ints = new TheKWeakestRowsInAMatrix().kWeakestRows(mat, 3);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
