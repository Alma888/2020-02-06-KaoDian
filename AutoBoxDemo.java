//自动装箱拆箱
public class AutoBoxDemo {
    public static void main(String[] args) {
        Integer data1=10;
        Integer data2=20;
        //转为double值再除以3
        System.out.println(data1.doubleValue()/3);  //3.3333333333333335
        //进行两个值的比较
        System.out.println(data1.compareTo(data2)); //-1

        System.out.println(data1+10);
        System.out.println(data1++);
    }
}
