
import patrones.CarDecorator;
import patrones.ICar;

public class CamaraRetro extends CarDecorator{
	public 	CamaraRetro(ICar c){
		super(c);
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Agregando Camara Retro.");
	}
}