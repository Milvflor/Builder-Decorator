package patrones;


import patrones.ICar;

public abstract class CarDecorator implements ICar{
	protected ICar wrapee;

	public CarDecorator(ICar car){
		this.wrapee = car;
	}

	@Override
	public void assemble(){
		this.wrapee.assemble();
	}
}