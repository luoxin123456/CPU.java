package 作业;
public class PC {
	  CPU cpu;
 HardDisk HD;
 void setCPU(CPU cpu) {
	 this.cpu = cpu;
 }
 void setHardDisk(HardDisk HD) {
	  this.HD = HD;
 }
void show(){
    System.out.println("CPU速度:"+cpu.getSpeed());

    System.out.println("硬盘容量:"+HD.getAmount());

 }

}