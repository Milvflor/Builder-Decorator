/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;


/**
 *
 * @author david_000
 */
public class Vehiculo implements ICar,IMotor{
   public String color;
   public boolean direccionAsistida;
   public String marca;
   public String modelo;
   public IMotor motor;
   public Carroceria tipoCarroceria;

   
   public String getPrestaciones(){
       String n1 = "Prestaciones:\n";
       n1 += "El presente vehículo es un " + marca + "\n";
       n1 += "Estilo " + tipoCarroceria.tipoCarroceria + "\n";
       n1 += "Color: " + color + "\n";
       n1 += (direccionAsistida ? "Con ":"Sin ") + "dirección asistida" + "\n";
       n1 += "Carrocería de " + tipoCarroceria.material + "\n";
       n1 += "Respuesta del motor: " + motor.InyectarCombustible(100) + "\n";
       
       return n1;
   }

    @Override
    public void assemble() {
        this.assemble();
        System.out.println("Armando vehículo");
    }

    @Override
    public String ConsumirCombustible() {
        return this.ConsumirCombustible();
    }

    @Override
    public String InyectarCombustible(int cantidad) {
        return this.InyectarCombustible(cantidad);
    }

    @Override
    public String RealizarEscape() {
        return this.RealizarEscape();
    }

    @Override
    public String RealizarCombustion() {
        return this.RealizarCombustion();
    }
    
}
