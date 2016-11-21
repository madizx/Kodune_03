
public class Toode_02 extends Ab_maks{
double kogus, hind, importMaks;

	public Toode_02(double kogus, double hind, double kaivem, double importMaks){
		super(kaivem);
		this.kogus=kogus;
		this.hind=hind;
		this.importMaks=importMaks;
	}	
	public double sisseostuHind(){
		return kogus*hind*importMaks;
	}
}