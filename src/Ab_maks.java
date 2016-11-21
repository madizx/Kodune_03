
public abstract class Ab_maks {
double kaivem;
	public Ab_maks(double uusHind){
		kaivem= uusHind;
	}
	public abstract double sisseostuHind();
	public double myygiHind(){
		return sisseostuHind()*kaivem;
		
	}
	
}
