package ��ҵ;
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
    System.out.println("CPU�ٶ�:"+cpu.getSpeed());

    System.out.println("Ӳ������:"+HD.getAmount());

 }

}