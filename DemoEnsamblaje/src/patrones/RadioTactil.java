public class RadioTactil extends CarDecorator{
	public 	RadioTactil(ICar c){
		super(c);
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Agregando Radio Tactil.");
	}
}