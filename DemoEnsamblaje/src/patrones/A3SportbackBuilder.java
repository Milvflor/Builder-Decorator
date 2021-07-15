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
public class A3SportbackBuilder extends VehiculoBuilder{

   @Override
    public void DefinirVehiculo() {
        v= new Vehiculo();
        v.marca= "Audi";
        v.modelo="A3 Sportback";
    }

    @Override
    public void ConstruirMotor() {
        v.motor= new MotorDiesel();
    }

    @Override
    public void ConstruirHabitaculo() {
        v.tipoCarroceria= new Carroceria();
        v.tipoCarroceria.tipoCarroceria="deportivo";
        v.tipoCarroceria.habitaculoReforzado=true;
        v.tipoCarroceria.material="fibra de carbono";
        v.color="plata cromado";
    }

    @Override
    public void ConstruirExtras() {
    	System.out.println("Contruyendo Extras");
    }
    
}
