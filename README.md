＃计191 2019311215罗鑫
＃阅读程序
个人电脑与CPU和硬盘关联UML图
##实验目的
利用类描述计算机中CPU的运行速度和硬盘容量，
##实验过程
中央处理器类要求getSpeed（）的返回速度的值，要求setSpeed（）方法将参数M的值赋值给速度； HardDisk类要求getSpeed（）的给定值的值，要求setSpeed（）方法将参数m赋值给量； pc类要求setCPU（）的参数赋值给cpu，要求setHardDisk（HardDisk）方法将参数h的值赋值给HD，要求显示（）方法能显示cpu的速度和硬盘容量
##核心方法
1个，主要方法中创造一个CPU的对象cpu，cpu将自己的速度设置为2200
```
public class PC {
	  CPU cpu;
```
2,main方法中创建一个headDisk对象disk
```
public class HardDisk {
    int amount; 
    int getAmount() {
     return amount;
	}
```
3主要方法中创造一个PC对象pc
```
public class PC {
	  CPU cpu;
 HardDisk HD;
 void setCPU(CPU cpu) {
	 this.cpu = cpu;
 }
```
＃#实验结果
经过计算机计算得出
