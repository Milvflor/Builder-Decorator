/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;


/**
 *
 * @author gabrielaramos
 */
public class VehiculoDirector {
    private VehiculoBuilder builder;
    
    public VehiculoDirector(VehiculoBuilder builder){
        this.builder = builder;
    }
    
    public void ConstruirVehiculo(){
        builder.DefinirVehiculo();
        builder.ConstruirMotor();
        builder.ConstruirHabitaculo();
        builder.ConstruirExtras();
        
    }


    public Vehiculo getVehiculo(){
        return builder.getVehiculo();
    }
}
