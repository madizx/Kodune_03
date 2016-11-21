import java.util.*;
public class class_01 {
	public static void main(String[] args) {
	//Toode_01 T1=new Toode_01(kogus, hind, kaivem);
	Toode_01 T1=new Toode_01(5, 6, 1.2);
 
	List<Ab_maks> tooted=new ArrayList<Ab_maks>();
	tooted.add(T1);

	for(Ab_maks l: tooted){
	
		System.out.println(l.myygiHind());
}	


		
	}
}
