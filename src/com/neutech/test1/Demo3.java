package com.neutech.test1;

public class Demo3 {
    // 12.31上
    public static void main(String[] args) {
        //调用一个方法
//  int x = abs(-120);
//  System.out.println(x);
        int[] arr = {12,415,8};
        System.out.println(arr.length);
        int x[] = arrayCopy(arr,10);
        System.out.println(x.length);

        //方法的意义，让代码可以重用，不用导出粘贴，有问题时可以统一调整
    }

    /*
     * 大前提是知道方法要做什么
     * 方法的四要素
     * 返回值
     * 方法名
     * 参数
     * 方法逻辑体
     */

    /*
     * 写一个能计算绝对值的方法，只考虑int类型
     * [访问控制符] [修饰符] 返回值类型 方法名(参数类型 形式参数,参数类型 形式参数,…)
     {
      方法体
     }
     */
    //声明一个方法
    public static int abs(int x) {
        int result = x < 0 ? -x : x;
        return result;
    }

    /*
     * 写一个int类型的数组扩容方法
     */
    public static int[] arrayCopy(int[] src,int newLength) {
        //创建一个新数组
        int[] result = new int[newLength];
        //利用for循环遍历将原数组的内容赋值新数组内
        for(int i=0;i<src.length;i++) {
            result[i]=src[i];
        }
        return result;
    }
}
