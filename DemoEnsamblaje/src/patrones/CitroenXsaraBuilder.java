/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

/**
 *
 * @author Elix
 */
public class CitroenXsaraBuilder extends VehiculoBuilder{

    @Override
    public void DefinirVehiculo() {
        v= new Vehiculo();
        v.marca= "Citroen";
        v.modelo="Xsara Picasso";
    }

    @Override
    public void ConstruirMotor() {
        v.motor= new MotorDiesel();
    }

    @Override
    public void ConstruirHabitaculo() {
        v.tipoCarroceria= new Carroceria();
        v.tipoCarroceria.tipoCarroceria="monovolumen";
        v.tipoCarroceria.habitaculoReforzado=false;
        v.tipoCarroceria.material="acero";
        v.color="negro";
    }

    @Override
    public void ConstruirExtras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
