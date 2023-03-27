public class Test1_Operator {
    public static void main(String[] args) {

        //三元运算符 ()?:

        //比较两个数是否相同
       /* int x = 10;
        int y = 10;
        boolean b = (x == y) ? true : false;
        boolean c = (x == y);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
*/
        //获取三个整数中的最大值
        int a = 10;
        int b = 20;
        int c = 30;
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        System.out.println("max =" + max);
    }
}
