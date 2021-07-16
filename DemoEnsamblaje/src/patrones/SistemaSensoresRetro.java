package patrones;


import patrones.ICar;

public class SistemaSensoresRetro extends CarDecorator{
	public 	SistemaSensoresRetro(ICar c){
		super(c);
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Agregando Sistema Sensores Retro.");
	}
}