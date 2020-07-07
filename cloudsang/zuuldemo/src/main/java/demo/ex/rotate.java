package demo.ex;

import javafx.scene.media.SubtitleTrack;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class rotate {
    int name =9;
    public demo rotates(){
        int[] nums={1,1,3,5,7,3,7};
        int k=2;
        if (k == 0||k%nums.length==0||k<0) {

        }else {
            int p=k%nums.length;
            int temp=0;
            for (int i = 1; i <= p; i++) {
                temp=nums[nums.length-1];
                for (int m = nums.length - 1; m > 0; m--) {
                    nums[m]=nums[m-1];
                }
                nums[0]=temp;
           }
        }
        return null;
    }

    public  boolean containsDuplicate(int[] nums){

        Arrays.sort(nums);
        int length = nums.length;
        if (length<=1){
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (i==length-1){
                return false;
            }
            if(nums[i]==nums[i+1]){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        rotate rotate = new rotate();
        int[] nums1={2,2,2,2,5,5,5,8};

        int[][] nums={{1,3},{2,6}};

        String[][] numr={{".",".",".",".","5",".",".","1","."},{".","4",".","3",".",".",".",".","."},{".",".",".",".",".","3",".",".","1"},{"8",".",".",".",".",".",".","2","."},{".",".","2",".","7",".",".",".","."},{".","1","5",".",".",".",".",".","."},{".",".",".",".",".","2",".",".","."},{".","2",".","9",".",".",".",".","."},{".",".","4",".",".",".",".",".","."}};
        int[] ints = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            ints[i]=scanner.nextInt();
        }
        int temp=ints[0];
        for (int i = 1; i < ints.length; i++) {
           if (temp>ints[i]){
               temp=ints[i];
           }
        }
        System.out.println(temp);
    }
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int l = 0; l < nums.length; l++) {
                if(i==l&&l!=nums.length-1){
                    continue;}
                if(l==nums.length-1&&i==nums.length-1){
                    return nums[i];
                }
                if (nums[i]==nums[l]){
                    break;
                }
                if(l==nums.length-1){
                    return nums[i];
                }
            }
        }

        return 0;
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) { //
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
                  Arrays.sort(nums1);
                  Arrays.sort(nums2);
        int length = nums1.length;
        int length1 = nums2.length;
        int le=0;

        for (int i = 0,y=0; i <length&&y<length1;) {
         if (nums1[i]<nums2[y]){
             i++;
         }else if (nums2[y]<nums1[i]){
             y++;
         }else {
             nums1[le++]=nums1[i++];

             y++;

         }
        }


        return Arrays.copyOf(nums1,le);
    }
    public int[] plusOne(int[] digits) {
        int i = digits.length;
        int digit = digits[i - 1];
        if (digit!=9){
            digits[i-1]=digit+1;
            return digits;
        }
        boolean y=true;
        for (int k = i-1; k >= 0; k--) {
            if(digits[k]==9){
                digits[k]=0;
                continue;
            }else {
                digits[k]=digits[k]+1;
                y=false;
                return digits;
            }

        }
        if (y){
            int[] ints = new int[i + 1];
            ints[0]=1;
            return ints;
        }



        return digits;
    }
    public void moveZeroes(int[] nums) {
        int p = nums.length;
        for (int i = 0; i < nums.length; i++) {
          if(nums[i]==0){
              for (int k = i+1; k < nums.length; k++) {
                  if (nums[k]!=0){
                      nums[i]=nums[k];
                      nums[k]=0;
                      break;
                  }
              }

          }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if(nums[i]+nums[k]==target){
                    ints[0]=nums[i];
                    ints[1]=nums[k];
                }
            }
        }

        return ints;
    }
    public boolean isValidSudoku(String[][] board) {

        int length = board.length;

        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                if ( board[i][k].equals(".")){
                    continue;
                }
                for (int g = k+1; g < length; g++) {
                    if ( board[i][k].equals(board[i][g])){
                        return false;
                    }
                }

            }
        }
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < 9; k++) {
                String c = board[k][i];
                if (!c.equals(".")){
                for (int p = k+1; p < 9; p++) {
                    String g = board[p][i];
                    if(c.equals(g)){
                        return false;
                    }
                }
                }
            }}
            boolean bl=false;
            int hl=0;
            int y=0;
        for (int i = 0; i < length;) {

        }
        return bl;
    }

    public void reverseString(char[] s) {
        char b;
        int k = s.length - 1;
        int d = s.length / 2;
        for (int i = 0; i < d; i++) {
          b=s[i];
          s[i]=s[k-i];
            s[k-i]=b;
        }
        for (char c : s) {
            System.out.println(c);
        }
    }
    public int reverse(int x) {
        if(x<Math.pow(-2,31)||x>Math.pow(2,31)-1){
            return 0;
        }
        int length = String.valueOf(x).length();
        long c=0;
        boolean d=false;
        if (x<0){
             x = x * -1;
             d=true;
             length = String.valueOf(x).length();
        }
        if(x>0){
            for (int i = length-1; i >= 0; i--) {
                long v = (long) (x / Math.pow(10, i));
                long pow = (long) Math.pow(10, length - i - 1);
                c=c+v*pow;
                x= (int) (x%Math.pow(10, i));
                if(c>Math.pow(2,31)-1){
                    return 0;
                }
            }
        }
        if (d){
            c=c * -1;
            if(c<=Math.pow(-2,31)){
                return 0;
            }
        }

        return Math.toIntExact(c);
    }
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        boolean f=true;
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                if(i==k){
                    continue;
                }
                if(chars[i]==chars[k]){
                    f=false;
                    break;
                }else {
                    f=true;
                }
            }
            if (f){

            return i;
            }
        }
        return -1;
    }
    public boolean isAnagram(String s, String t) {
        if(s.equals(t))return true;
        char[] chars = s.toCharArray();
        char[] array = t.toCharArray();
        int length = chars.length;
        int length1 = array.length;
        Arrays.sort(chars);
        Arrays.sort(array);
        if (length!=length1) return false;

        return  Arrays.equals(chars,array);
    }
    public int[] sort(int[] digits){
        Arrays.sort(digits);
        int length = digits.length;
        int temp=digits[0];
        int c=0;
        for (int i = 1; i < length; i++) {
            if(temp>digits[i]){
                temp=digits[i];
                digits[c]=temp;
                c++;
            }
        }
        return digits;
    }
    public int myAtoi(String str) {
        Cookie cookie = new Cookie("","");
        String trim = str.replace(" ","");
        if (trim.length()==0||trim.equals("-")||trim.equals("+"))
            return 0;
        char[] chars = trim.toCharArray();
        char c = trim.charAt(0);

        String a="";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='0'&&chars[i]<='9'){
                a=chars[i]+a;
            }
        }
        if(a.charAt(0)!=trim.charAt(0)){
            return 0;
        }
        System.out.println(a);

        return 8888;
    }
    public int sumNums(int n) {
             int b=n;
             boolean a=n>0&&(b+=sumNums(n-1))>0;
              return b;
    }
    public int add(int a, int b) {
        int i = a ^ b;
        return i;
    }
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置

        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int[] ints = new int[k];
        int w = k * threshold;
        int time=0;
        int length = arr.length;
        System.arraycopy(arr,0,ints,0,k);
        int reduce = Arrays.stream(ints).reduce(0, Integer::sum);
        if (reduce>=w){
            time++;
        }
        for (int i = k,h=0; i <length; i++,h++) {
            reduce = reduce + arr[i] - arr[h];
            if(reduce>=w){
                  time++;
              }
        }

        return time;
    }
    public double angleClock(int hour, int minutes) {
        double i = hour*30+(minutes*0.5);
        int k = minutes*6;
        double v = i - k;
        if (v<0){
            v=v*-1;
        }
        double g = 360 - v;
        double c=g<=v?g:v;
        return c;
    }
    public boolean isUnique(String astr) {
        int[] ch = new int[26];
        int length = astr.length();
        for (int i = 0; i < length; i++) {
            if (ch[astr.charAt(i)-97]>0)
                    return false;
            else ch[astr.charAt(i)-97]=astr.charAt(i);
        }
        return true;
    }
    public String replaceSpaces(String S, int length) {

        char[] chars = S.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if(chars[i]==' '){
                s.append("%20");
            }else {
                s.append(chars[i]);
            }

        }

        return s.toString();
    }
    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int[] ints = new int[128];
        int i=0;
        for (int k = 0; k < length; k++) {
            ints[chars[k]]++;
        }
        for (int g = 0; g < ints.length; g++) {
            if (ints[g]%2!=0){
                i++;
            }
            if (i>1){
                return false;
            }
        }
        return true;
    }
    public boolean oneEditAway(String first, String second) {

        if (first==second||first.equals(second))return true;
        int length = first.length();
        int length1 = second.length();
        int a=length>length1?length:length1;
        int c=length<length1?length:length1;
        if (a-c>1) return false;
        if (a==1&&c==0)return true;
        StringBuilder stringBuilder = new StringBuilder(first);
        StringBuilder stringBuilder1 = new StringBuilder(second);
        for (int i = 0,h=0; i < a; i++,h++) {
            if (i==a-1&&h==c){
                return true;
            }
         if (first.charAt(i)!=second.charAt(i)){
             if (length==length1){
                 stringBuilder.deleteCharAt(i);
                 stringBuilder.insert(i,second.charAt(i));
                 break;
             }else if(length>length1){
                 stringBuilder.deleteCharAt(i);
                 break;
             }else {
                 stringBuilder1.deleteCharAt(i);
                 break;
             }
         }else {
             stringBuilder.deleteCharAt(i);
             stringBuilder1.deleteCharAt(i);
             break;
         }

        }
        return stringBuilder.toString().equals(stringBuilder1.toString());
    }
    public boolean formats(String first) {
        String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
String c="1+[3,5,8]+[1-9]{9}";
String f="\\w+@+\\w+.com";





        Pattern compile = Pattern.compile(REGEX_URL);
        Matcher matcher = compile.matcher(first);
        System.out.println(matcher.matches());
        return matcher.matches();
    }
    public int pivotIndex(int[] nums) {

        int length = nums.length;
        if(length==0||length==2){
            return -1;
        }
        if (length==1)return nums[0];
        int t=length;
        int g=nums[0];
        int f=nums[length-1];
        for (int i = 0,k=length-1; i < length-1&&k>0;) {
            if (g>f&&g>0&&f>0){
                k--;
                f+=nums[k];
            }else if (f>g&&g>0&&f>0){
                i++;
                g+=nums[i];
            }else {
                if (k-1==i+1){
                    return i+1;
                }else if (i+1>k-1){
                    return -1;
                }else {
                    i++;
                    k--;
            g+=nums[i];
            f+=nums[k];
                }
            }
        }

        return -1;
    }
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (target<nums[i]){
                return i;
            }else if (target==nums[i]){
                return i;
            }else if (i==length-1){
                return i+1;
            }
        }
        return target;
    }
    public int[][] merge(int[][] intervals) {

        int length = intervals.length;
        int cont=0;

        for (int i = 0; i < length-1; i++) {
            for (int k = 0; k < 2; k++) {

            }
            if (intervals[i][1]>=intervals[i+1][0]&&intervals[i][0]<=intervals[i+1][1]){
                if ( intervals[i][0]<=intervals[i+1][0]){
                    intervals[i+1][0]=intervals[i][0];
                }
                if (intervals[i][1]>=intervals[i+1][1]){
                    intervals[i+1][1]=intervals[i][1];
                }
                cont++;
            }
        }
        int[][] ints = Arrays.copyOfRange(intervals, cont,length);
        return ints;
    }
    public String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        String prefix = "";

        if(count != 0){
            prefix = strs[0];
        }
        for(int i=0; i<count; i++){
            //关键代码，不断的从后往前截取字符串，然后与之相比，直到startsWith()返回true
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;


    }
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        String ss = "sfsfsadsdfsaff";
        
        return s;
    }
}


