package package1;

public class Test1 {
    public static void main(String[] args){
        String tlsCipherRecommended = "abcd";
        String tlsCipherOptional = "1";
        String[] cipherRecommendedArr = tlsCipherRecommended.split(",");
        String[] cipherOptionalArr = tlsCipherOptional.split(",");
        String[] cipherArr = new String[cipherRecommendedArr.length+cipherOptionalArr.length];
        System.arraycopy(cipherRecommendedArr, 0, cipherArr, 0, cipherRecommendedArr.length);
        System.arraycopy(cipherOptionalArr, 0, cipherArr, cipherRecommendedArr.length, cipherOptionalArr.length);
        for(String i : cipherArr){

            System.out.println(i);
        }
    }
}
