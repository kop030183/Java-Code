//class是「類別」的宣告
//後面接類別的名稱 名稱要跟檔名一樣
//public static void main(String[] args)是程式的入口
//JVM 在執行時會從這裡開始跑程式
//String[] 表示「字串陣列」  args 是參數名稱，代表「命令列參數」

public class Day1{
    public static void main(String[] args){
        System.out.println("Hello, Java!");
        // 基本的輸出

        int age = 23;               //整數
        double height = 178.5;      //浮點數
        String name = "Chieh";      //字串 要加雙引號！
        //變數宣告、指定
        int age1 = 23;               
        double height1 = 160;     
        String name1 = "Yu";

        System.out.println("名字："+ name);
        System.out.println("年齡："+ age);
        System.out.println("身高："+ height+ "公分");

        System.out.println("名字："+ name1);
        System.out.println("年齡："+ age1);
        System.out.println("身高："+ height1+ "公分");
        //輸出變數+字串
    }
}