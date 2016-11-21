import java.util.*;
public class class_01 {
	public static void main(String[] args) {
	//Toode_01 T1=new Toode_01(kogus, hind, kaivem);
	//Toode_02 T2 =new Toode_02(kogus, hind, kaivem, importMaks);	
	Toode_01 T1=new Toode_01(5, 6, 1.2);
	Toode_02 T2 =new Toode_02(3, 8, 1.2, 0.3);
	List<Ab_maks> tooted=new ArrayList<Ab_maks>();
	tooted.add(T1);
	tooted.add(T2);

	for(Ab_maks l: tooted){
	
		System.out.println(l.myygiHind());
		/*	36.0
			8.639999999999999
		  */
}	


		
	}
}
