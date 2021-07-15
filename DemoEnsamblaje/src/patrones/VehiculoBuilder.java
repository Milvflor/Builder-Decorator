package patrones;

import sinpatron.Vehiculo;


public abstract class VehiculoBuilder {
    protected Vehiculo v;
    
    
    public Vehiculo getVehiculo(){
        return v;
    }
    
    public abstract void ConstruirVehiculo();

    
    
}
