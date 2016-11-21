
public class Toode_01 extends Ab_maks{
double kogus, hind;

	public Toode_01(double kogus, double hind, double kaivem){
		super(kaivem);
		this.kogus=kogus;
		this.hind=hind;
	}	
	public double sisseostuHind(){
		return kogus*hind;
	}
}
